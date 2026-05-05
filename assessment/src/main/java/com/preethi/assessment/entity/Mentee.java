package com.preethi.assessment.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Mentee {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mentee_id;

    private String name;
    private List<String>goals;
    private List<String> skill_gaps;




    public Long getMentee_id() {
        return mentee_id;
    }
    public void setMentee_id(Long mentee_id) {
        this.mentee_id = mentee_id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<String> getGoals() {
        return goals;
    }
    public void setGoals(List<String> goals) {
        this.goals = goals;
    }
    public List<String> getSkill_gaps() {
        return skill_gaps;
    }
    public void setSkill_gaps(List<String> skill_gaps) {
        this.skill_gaps = skill_gaps;
    }
    public Mentee(Long mentee_id, String name, List<String> goals, List<String> skill_gaps) {
        this.mentee_id = mentee_id;
        this.name = name;
        this.goals = goals;
        this.skill_gaps = skill_gaps;
    }
    public Mentee() {
    }
    @Override
    public String toString() {
        return "Mentee [mentee_id=" + mentee_id + ", name=" + name + ", goals=" + goals + ", skill_gaps=" + skill_gaps
                + "]";
    }


    
}
