package com.example.womenAndFlowers.initializer;

import com.example.womenAndFlowers.entity.Flowers;
import com.example.womenAndFlowers.repository.FlowersRepository;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class FlowersFaker implements CommandLineRunner {

    @Autowired
    private FlowersRepository flowersRepository;

    @Override
    public void run(String... args) throws Exception {
        Faker faker = new Faker();
        for(int i = 1; i <=10; i++) {
            Flowers flowers = new Flowers();
            flowers.setNameFlower(faker.name().firstName());
            flowersRepository.save(flowers);
        }

    }
}
