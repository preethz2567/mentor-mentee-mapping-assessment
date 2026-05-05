package com.preethi.assessment.entity;

import jakarta.persistence.*;

@Entity
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long match_id;

    @ManyToOne
    private Mentor mentor;

    @ManyToOne
    private Mentee mentee;

    private String status;

    private String created_at;

    public Long getMatch_id() {
         return match_id; 
        }
    public void setMatch_id(Long match_id) { 
        
        this.match_id = match_id; 
    
    }

    public Mentor getMentor() { 
        
        return mentor; 
    }
    public void setMentor(Mentor mentor) { 
        this.mentor = mentor; 
    }

    public Mentee getMentee() {
         return mentee;
         }
    public void setMentee(Mentee mentee) { this.mentee = mentee; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getCreated_at() { return created_at; }
    public void setCreated_at(String created_at) { this.created_at = created_at; }

    public Match() {}

    @Override
    public String toString() {
        return "Match [match_id=" + match_id + ", mentor=" + mentor + ", mentee=" + mentee + ", status=" + status + ", created_at=" + created_at + "]";
    }
}
