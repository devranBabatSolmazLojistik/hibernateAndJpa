package com.example.hibernateandjpa.entity;

import lombok.Data;
import javax.persistence.*;


@Data
@Entity
@Table(name="city")
public class City {
    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "countryCode")
    private String countryCode;
    @Column(name = "district")
    private String district;
    @Column(name = "population")
    private String population;


}
