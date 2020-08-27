package br.com.casamagalhaes.estagiocm.repository;

import br.com.casamagalhaes.estagiocm.model.Estagiario;
import br.com.casamagalhaes.estagiocm.model.User;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
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
    public List<User> search(String name, String birthday) {
        Criteria c = ((Session) entityManager.getDelegate()).createCriteria(User.class);
        c.add(Restrictions.ilike("name", name, MatchMode.ANYWHERE));
        if (!Objects.equals(birthday, ""))
            c.add(Restrictions.eq("birthday", birthday));

        return c.list();
    }
}
