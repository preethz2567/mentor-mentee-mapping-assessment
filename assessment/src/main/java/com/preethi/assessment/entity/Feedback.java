package com.preethi.assessment.entity;

import jakarta.persistence.*;

@Entity
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long feedback_id;

    private Long match_id;

    private int rating;

    private String comments;

    public Long getFeedback_id() {
        return feedback_id;
    }

    public void setFeedback_id(Long feedback_id) {
        this.feedback_id = feedback_id;
    }

    public Long getMatch_id() {
        return match_id;
    }

    public void setMatch_id(Long match_id) {
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

    public Feedback(Long feedback_id, Long match_id, int rating, String comments) {
        this.feedback_id = feedback_id;
        this.match_id = match_id;
        this.rating = rating;
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Feedback [feedback_id=" + feedback_id + ", match_id=" + match_id + ", rating=" + rating + ", comments="
                + comments + "]";
    }
}
