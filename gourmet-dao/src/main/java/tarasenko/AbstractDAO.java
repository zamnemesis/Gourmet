package tarasenko;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * @author tarasenko
 * @since 01.06.2016
 */
public abstract class AbstractDAO<PK extends Serializable, T> {
    private final Class<T> persistentClass;

    @SuppressWarnings("unchecked")
    public AbstractDAO() {
        this.persistentClass = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
    }

    @Autowired
    private EntityManager entityManager;

    @SuppressWarnings("unchecked")
    public T getByKey(PK key) {
        return (T) entityManager.find(persistentClass, key);
    }

    public void persist(T entity) {
        entityManager.persist(entity);
    }

    public void delete(T entity) {
        entityManager.remove(entity);
    }

    public void deleteById(PK key) {
//        CriteriaDelete<T> criteriaDelete = getTCriteriaDelete();
//        Root<T> rootEntry = criteriaDelete.from(persistentClass);
//        criteriaDelete.where(rootEntry.);
//        entityManager.createQuery(criteriaDelete);
    }

    public List<T> findAll() {
        CriteriaQuery<T> criteriaQuery = getCriteriaQuery();
        Root<T> rootEntry;
        rootEntry = criteriaQuery.from(persistentClass);
        CriteriaQuery<T> all = criteriaQuery.select(rootEntry);
        TypedQuery<T> allQuery = entityManager.createQuery(all);
        return allQuery.getResultList();
    }

    protected CriteriaQuery<T> getCriteriaQuery() {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        return criteriaBuilder.createQuery(persistentClass);
    }

    protected CriteriaDelete<T> getCriteriaDelete() {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        return criteriaBuilder.createCriteriaDelete(persistentClass);
    }
}
