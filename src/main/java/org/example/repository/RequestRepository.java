package org.example.repository;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.model.Request;

import java.util.List;

public class RequestRepository {
    private EntityManagerFactory factory;
    private EntityManager entityManager;

    public RequestRepository() {
        this.factory = Persistence.createEntityManagerFactory("persist");
        this.entityManager = factory.createEntityManager();
    }

    public Request create(Request request) {
        entityManager.getTransaction().begin();
        entityManager.persist(request);
        entityManager.getTransaction().commit();
        return request;
    }

    public Request find(int id) {
        entityManager.getTransaction().begin();
        Request request = entityManager.find(Request.class, id);
        entityManager.getTransaction().commit();
        return request;
    }

    public Request findByEmail(String email) {
        entityManager.getTransaction().begin();
        Request request = entityManager.find(Request.class, email);
        entityManager.getTransaction().commit();
        return request;
    }

    public List<Request> findAll() {
        List<Request> requests = entityManager.createQuery("SELECT r from Request r").getResultList();
        return requests;
    }

    public void delete(Request request) {
        entityManager.getTransaction().begin();
        entityManager.remove(request);
        entityManager.getTransaction().commit();
    }

    public void deleteById(int id) {
        Request request = find(id);
        entityManager.getTransaction().begin();
        request.setPetToAdopt(null);
        entityManager.remove(request);
        entityManager.getTransaction().commit();
    }
}
