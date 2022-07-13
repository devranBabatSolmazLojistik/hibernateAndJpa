package com.example.hibernateandjpa.DataAccess;

import com.example.hibernateandjpa.entity.City;

import java.util.List;

public interface ICityDal {
    List<City> GetAll();
    void add(City city);
    void update(City city);
    void delete(City city);
}
