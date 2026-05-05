package com.preethi.assessment.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Mentor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mentor_id;

    private String name;

    @ElementCollection
    private List<String> expertise;

    private String availability;

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

    public String getAvailability() {
         return availability; 
        }
    public void setAvailability(String availability) { this.availability = availability; }

    public Mentor() {}

    @Override
    public String toString() {
        return "Mentor [mentor_id=" + mentor_id + ", name=" + name + ", expertise=" + expertise + ", availability=" + availability + "]";
    }
}
