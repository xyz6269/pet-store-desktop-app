package org.example.model;

import jakarta.persistence.*;

@Entity
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String email;
    private String job;
    @OneToOne
    private Pet petToAdopt;

    public Request() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Pet getPetToAdopt() {
        return petToAdopt;
    }

    public void setPetToAdopt(Pet petToAdopt) {
        this.petToAdopt = petToAdopt;
    }
}
