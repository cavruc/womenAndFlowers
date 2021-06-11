package com.example.womenAndFlowers.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Flowers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idFlower;

    @Column
    private String nameFlower;
}
