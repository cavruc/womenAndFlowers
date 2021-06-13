package com.example.womenAndFlowers.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Woman {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idWoman;

    @Column
    private String firstLastName;

    /*@Column
    private List<Flowers> flowersList;*/
}

