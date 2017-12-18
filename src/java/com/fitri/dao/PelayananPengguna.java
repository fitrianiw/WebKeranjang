package com.fitri.dao;

import com.fitri.model.User;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class PelayananPengguna {
    
    static final Logger logger = Logger.getLogger(PelayananPengguna.class.getName());
    
    @PersistenceUnit
    EntityManagerFactory emf;
    
    private EntityManager em;
    
    @Transactional
    public void simpanPengguna(User user){
        System.out.println("Hallo saya di DAO");
        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
        em.close();
    }
    
    public User findByUsername(String username){
        User user = new User();
        try{
            em = emf.createEntityManager();
            Query query = em.createQuery("Select u from User u where u.username = :username");
            query.setParameter("username", username);
            user = (User) query.getSingleResult();
        } catch (NoResultException nre){
            logger.severe("Username Tidak Ditemukan");
        }
        return user;
    }
}
