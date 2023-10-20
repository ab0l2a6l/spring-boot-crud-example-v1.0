package org.abolfazl.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.abolfazl.entity.Person;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonDA {
    @PersistenceContext
    private EntityManager entityManager;

    public void save(Person person){
        entityManager.persist(person);
    }

    public void update(Person person){
        entityManager.merge(person);
    }

    public void delete(Person person){
        entityManager.remove(entityManager.merge(person));
    }

    public List<Person> findAll(){
       return entityManager.createQuery("select o from person o").getResultList();
    }
}
