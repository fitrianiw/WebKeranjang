package com.fitri.dao;

import com.fitri.model.Productt;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class PelayananProduct {
    
    @PersistenceUnit
    EntityManagerFactory emf;
    EntityManager em;
    
    public List<Productt> showAllProduct(){
        em = emf.createEntityManager();
        List<Productt> products = em.createQuery("select t from Productt t").getResultList();
        
        return products;
    }
}
