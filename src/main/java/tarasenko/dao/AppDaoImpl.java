package tarasenko.dao;

import tarasenko.dao.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

/**
 * @author tarasenko
 * @since 01.06.2016
 */
//@Repository
//@Transactional
public class AppDaoImpl {
    @Autowired
    private EntityManager em;

    public User getUser(Long id){
        return em.find(User.class, id);
    }
}
