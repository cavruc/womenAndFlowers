package com.example.womenAndFlowers.repository;

import com.example.womenAndFlowers.entity.Women;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WomenRepository extends JpaRepository<Women, Long> {
}
