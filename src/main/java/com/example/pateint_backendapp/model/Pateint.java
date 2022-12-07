package com.example.pateint_backendapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pateints")
public class Pateint {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private  int age;
    private String mobno;
    private String address;

    public Pateint() {
    }

    public Pateint(int id, String name, int age, String mobno, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mobno = mobno;
        this.address = address;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobno() {
        return mobno;
    }

    public void setMobno(String mobno) {
        this.mobno = mobno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
