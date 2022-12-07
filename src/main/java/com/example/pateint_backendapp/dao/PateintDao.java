package com.example.pateint_backendapp.dao;

import com.example.pateint_backendapp.model.Pateint;
import org.springframework.data.repository.CrudRepository;

public interface PateintDao extends CrudRepository<Pateint,Integer> {
}
