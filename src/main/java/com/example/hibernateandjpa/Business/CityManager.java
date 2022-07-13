package com.example.hibernateandjpa.Business;

import com.example.hibernateandjpa.DataAccess.ICityDal;
import com.example.hibernateandjpa.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class CityManager implements ICityService{
    private ICityDal cityDal;

    @Autowired
    public CityManager(ICityDal cityDal) {
        this.cityDal = cityDal;
    }

    @Override
    @Transactional
    public List<City> GetAll() {
        return this.cityDal.GetAll();
    }

    @Override
    @Transactional
    public void add(City city) {

    }

    @Override
    @Transactional
    public void update(City city) {

    }

    @Override
    public void delete(City city) {

    }
}
