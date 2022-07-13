package com.example.hibernateandjpa.Business;

import com.example.hibernateandjpa.entity.City;

import java.util.List;

public interface ICityService {

    List<City> GetAll();
    void add(City city);
    void update(City city);
    void delete(City city);
}
