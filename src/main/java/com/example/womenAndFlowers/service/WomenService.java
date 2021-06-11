package com.example.womenAndFlowers.service;

import com.example.womenAndFlowers.entity.Women;
import com.example.womenAndFlowers.repository.WomenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class WomenService {
    @Autowired
    private WomenRepository womenRepository;

    public List<Women> getAllWomen(){
       return womenRepository.findAll();
    }

    public Women getById(Long id){
      return   womenRepository.findById(id).orElseThrow(()
                -> new EntityNotFoundException(String.format("can not find this id: '%d' ", id)));
    }

    public Women createWomen(Women women){
        Women newWomen = new Women();
        newWomen.setFirstLastName(women.getFirstLastName());
        return womenRepository.save(newWomen);
    }

}
