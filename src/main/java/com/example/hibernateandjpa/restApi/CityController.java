package com.example.hibernateandjpa.restApi;

import com.example.hibernateandjpa.Business.ICityService;
import com.example.hibernateandjpa.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CityController {

    private ICityService cityService;
    @Autowired
    public CityController(ICityService cityService) {
        this.cityService = cityService;
    }

    public List<City> get(){
        return cityService.GetAll();
    }
}
