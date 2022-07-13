package com.example.hibernateandjpa.DataAccess;

import com.example.hibernateandjpa.entity.City;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import java.util.List;

public abstract class HibernateCityDal implements ICityDal{
    private EntityManager entityManager;

    @Autowired
    public HibernateCityDal(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<City> GetAll() {
        Session session=entityManager.unwrap(Session.class);
        List<City> cities= session.createQuery("from City",City.class).getResultList();
        return cities;
    }
}
