package com.example.womenAndFlowers.repository;

import com.example.womenAndFlowers.entity.Flowers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface FlowersRepository extends JpaRepository<Flowers, Long> {
}
