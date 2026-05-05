package com.preethi.assessment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Match {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long match_id;

    @OneToMany
    private Mentor mentor_id;

    @OneToMany
    private Mentee mentee_id;

    private String status;

    private String created_At;

    public long getMatch_id() {
        return match_id;
    }

    public void setMatch_id(long match_id) {
        this.match_id = match_id;
    }

    public Mentor getMentor_id() {
        return mentor_id;
    }

    public void setMentor_id(Mentor mentor_id) {
        this.mentor_id = mentor_id;
    }

    public Mentee getMentee_id() {
        return mentee_id;
    }

    public void setMentee_id(Mentee mentee_id) {
        this.mentee_id = mentee_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreated_At() {
        return created_At;
    }

    public void setCreated_At(String created_At) {
        this.created_At = created_At;
    }

    public Match() {
    }

    @Override
    public String toString() {        
        return "Match [match_id=" + match_id + ", mentor_id=" + mentor_id + ", mentee_id=" + mentee_id + ", status="
                + status + ", created_At=" + created_At + "]";
    }
    
    
}
