package com.example.womenAndFlowers.initializer;

import com.example.womenAndFlowers.entity.Women;
import com.example.womenAndFlowers.repository.WomenRepository;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class WomenFaker implements CommandLineRunner {

    @Autowired
    private WomenRepository womenRepository;

    @Override
    public void run(String... args) throws Exception {
        Faker faker = new Faker();
        for(int i = 1; i <= 10; i++) {
            Women women = new Women();
            women.setFirstLastName(faker.name().fullName());
            womenRepository.save(women);
        }

    }
}
