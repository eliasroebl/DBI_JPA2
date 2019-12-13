package at.htl.demo.repository;

import at.htl.demo.model.RootBO;
import at.htl.demo.model.data.EntityBase;

import javax.persistence.EntityManager;

public abstract class RepositoryBase<T extends EntityBase> {

    protected final EntityManager entityManager;

    protected RepositoryBase(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    protected void persist (RootBO<T> object){
        this.entityManager.persist(object.getState());
    }
}
