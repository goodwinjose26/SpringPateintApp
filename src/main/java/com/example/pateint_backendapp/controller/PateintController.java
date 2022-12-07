package com.example.pateint_backendapp.controller;

import com.example.pateint_backendapp.dao.PateintDao;
import com.example.pateint_backendapp.model.Pateint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class PateintController {
    @Autowired
    private PateintDao dao;
    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Pateint> view()
    {
        return (List<Pateint>) dao.findAll();
    }
    @CrossOrigin(origins = "*")

    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String add(@RequestBody Pateint p)
    {
        System.out.println(p.getName().toString());
        System.out.println(p.getAge());
        System.out.println(p.getMobno().toString());
        System.out.println(p.getAddress());
        dao.save(p);
        return "PATEINT ADDED";
    }
}
