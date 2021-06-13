package com.example.womenAndFlowers.service;

import com.example.womenAndFlowers.entity.Woman;
import com.example.womenAndFlowers.repository.WomenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class WomenService {
    @Autowired
    private WomenRepository womenRepository;

    public List<Woman> getAllWomen(){
       return womenRepository.findAll();
    }

    public Woman getById(Long id){
      return   womenRepository.findById(id).orElseThrow(()
                -> new EntityNotFoundException(String.format("can not find this id: '%d' ", id)));
    }

    public List<Woman> createWomen(List<Woman> womanList){
//        List<Woman> womanList1 = womanList.stream()
//                .map(woman -> Woman.builder()
//                        .firstLastName(woman.getFirstLastName())
//                        .build())
//                .collect(Collectors.toList());
        //for dto
        return womenRepository.saveAll(womanList);
    }

    public Woman updateWoman(Long id, Woman woman) {
        Woman newWoman = womenRepository.findById(id).orElseThrow(() ->
                new EntityNotFoundException(String.format("can not find this id: '%d' ", id)));
            newWoman.setFirstLastName(woman.getFirstLastName());
        return womenRepository.save(newWoman);
    }

    public void deleteWoman(Long id){
        womenRepository.deleteById(id);
    }

}
