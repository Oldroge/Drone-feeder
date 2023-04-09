package com.java.Dronefeeder.dao;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 * Classe abstrata GenericDao.
 **/

public abstract class GenericDao<T, I extends Serializable> {

  /**
   * Atributos.
   **/
    
  private final Class<T> entityClass;
  private final EntityManager em = Persistence.createEntityManagerFactory("crudHibernatePU")
      .createEntityManager();

  /**
   * Métodos.
   **/
  
  public GenericDao(Class<T> entityClass) {
    this.entityClass = entityClass;
  }
  
  /**
   * Método getAll.
   **/
  public List<T> findAll() {
    CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
    CriteriaQuery<T> criteriaQuery = criteriaBuilder.createQuery(entityClass);
    Root<T> root = criteriaQuery.from(entityClass);
    criteriaQuery.select(root);
    return em.createQuery(criteriaQuery).getResultList();
  }
  
  /**
   * Método getById.
   **/
  public T findById(Long id) {
    return em.find(entityClass, id);
  }
  
  /**
   * Método save.
   **/
  public void save(T entity) {
    EntityTransaction transaction = em.getTransaction();
    transaction.begin();
    em.persist(entity);
    transaction.commit();
  }
  
  /**
   * Método put.
   **/
  public void edit(T entity) {
    EntityTransaction transaction = em.getTransaction();
    transaction.begin();
    em.merge(entity);
    transaction.commit();
  }
  
  /**
   * Método deletet.
   **/
  public void delete(Long id) {
    EntityTransaction transaction = em.getTransaction();
    transaction.begin();
    T entity = em.find(entityClass, id);
    em.remove(entity);
    transaction.commit();
  }

}