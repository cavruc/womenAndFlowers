package com.example.womenAndFlowers.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Women {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idWoman;

    @Column
    private String firstLastName;

    /*@Column
    private List<Flowers> flowersList;*/
}

