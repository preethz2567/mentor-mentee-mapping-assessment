package com.preethi.assessment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.*;

@Entity
public class Mentor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mentor_id;

    private String name;
    private List<String> expertise;
    private enum availability {
        AVAILABLE,
        NOT_AVAILABLE
    }
    public Long getMentor_id() {
        return mentor_id;
    }
    public void setMentor_id(Long mentor_id) {
        this.mentor_id = mentor_id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<String> getExpertise() {
        return expertise;
    }
    public void setExpertise(List<String> expertise) {
        this.expertise = expertise;
    }
    public Mentor() {
    }
    @Override
    public String toString() {
        return "Mentor [mentor_id=" + mentor_id + ", name=" + name + ", expertise=" + expertise + "]";
    }
    public Object getAvailability() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAvailability'");
    }


    

}
