package com.examly.springapp;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
@RestController
public class carcon {
    @Autowired
    carrep repo;
    @PostMapping("/saveCar")
    public car enter(@RequestBody car c)
    {
        repo.save(c);
        return c;
    }
    @PostMapping("/editCar")
    public car updatecar(@RequestParam("id") int carId,@RequestBody car c)
    {
        repo.save(c);
        return c;
    }
    @DeleteMapping("/deleteCar")
    public String deletecar(@RequestParam("id") int carId)
    {
        car c=repo.getOne(carId);
        repo.delete(c);
        return "deleted";
    }
    @GetMapping("/getCar")
    public Optional<car>  getcar(@RequestParam("id") int carId)
    {
        return  repo.findById(carId);

    }
    @GetMapping("/getCars")
    public List<car>  getcars()
    {
        return  repo.findAll();
    }
    
}
