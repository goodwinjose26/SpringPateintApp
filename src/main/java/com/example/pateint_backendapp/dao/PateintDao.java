package com.example.pateint_backendapp.dao;

import com.example.pateint_backendapp.model.Pateint;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PateintDao extends CrudRepository<Pateint,Integer> {

    @Query(value = "SELECT `id`, `address`, `age`, `mobno`, `name` FROM `pateints` WHERE `name`=:name",nativeQuery = true)
    List<Pateint> searchPateint(@Param("name") String name);

}
