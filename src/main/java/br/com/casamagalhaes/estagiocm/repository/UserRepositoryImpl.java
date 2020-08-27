package br.com.casamagalhaes.estagiocm.repository;

import br.com.casamagalhaes.estagiocm.model.User;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Objects;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(User user) {
        entityManager.persist(user);
    }

    @Override
    @Transactional
    public void update(User user) {
        entityManager.merge(user);
    }

    @Override
    @Transactional
    public List<User> search(String name, String birthday) {
        Criteria c = ((Session) entityManager.getDelegate()).createCriteria(User.class);
        c.add(Restrictions.ilike("name", Objects.isNull(name)?"":name, MatchMode.ANYWHERE));
        if (!Objects.isNull(birthday))
            c.add(Restrictions.eq("birthday", birthday));

        return c.list();
    }

    @Override
    public User search(Long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    @Transactional
    public void delete(User user) {
        Session session = ((Session) entityManager.getDelegate());
        Query query = session.createQuery("delete from User u where id = :id");
        query.setParameter("id", user.getId());
        query.executeUpdate();
    }

    @Override
    @Transactional
    public User validateLogin(String name, String password) {
        Criteria c = ((Session) entityManager.getDelegate()).createCriteria(User.class);
        c.add(Restrictions.eq("name", name));
        c.add(Restrictions.eq("password", password));

        return (User) c.uniqueResult();
    }
}
