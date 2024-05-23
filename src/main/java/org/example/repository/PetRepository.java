package org.example.repository;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.model.Pet;

import java.util.List;


public class PetRepository {
    private EntityManagerFactory factory;
    private EntityManager entityManager;

    public PetRepository() {
        this.factory = Persistence.createEntityManagerFactory("persist");
        this.entityManager = factory.createEntityManager();
    }

    public void create(Pet pet) {
        entityManager.getTransaction().begin();
        entityManager.persist(pet);
        entityManager.getTransaction().commit();
    }

    public void edit(int id, String pic, String name, int age) {
        Pet petToedit = findById(id);
        petToedit.setAge(age);
        petToedit.setPicture(pic);
        petToedit.setName(name);
    }

    public Pet findById(int id) {
        return entityManager.find(Pet.class, id);
    }


    public List<Pet> findAll() {
        return entityManager.createQuery("select p from Pet p").getResultList();
    }

    public void delte(int id) {
        entityManager.getTransaction().begin();
        Pet petToDelete = findById(id);
        entityManager.remove(petToDelete);
        entityManager.getTransaction().commit();
    }

}
