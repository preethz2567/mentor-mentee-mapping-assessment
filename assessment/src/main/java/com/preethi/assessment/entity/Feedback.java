package com.preethi.assessment.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Feedback {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long feedback_id;
    private long match_id;
    private int rating;
    private String comments;

    public long getFeedback_id() {
        return feedback_id;
    }

    public void setFeedback_id(long feedback_id) {
        this.feedback_id = feedback_id;
    }

    public long getMatch_id() {
        return match_id;
    }

    public void setMatch_id(long match_id) {
        this.match_id = match_id;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComments() {
        return comments;
    }   

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Feedback() {
    }

    public Feedback(long feedback_id, long match_id, int rating, String comments) {
        this.feedback_id = feedback_id;
        this.match_id = match_id;
        this.rating = rating;
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Feedback [feedback_id=" + feedback_id + ", match_id=" + match_id + ", rating=" + rating
                + ", comments=" + comments + "]";
    }



    
}
