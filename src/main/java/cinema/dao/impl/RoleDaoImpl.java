package cinema.dao.impl;

import java.util.Optional;
import cinema.dao.AbstractDao;
import cinema.dao.RoleDao;
import cinema.exception.DataProcessingException;
import cinema.model.Role;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDaoImpl extends AbstractDao<Role> implements RoleDao {
    public RoleDaoImpl(SessionFactory factory) {
        super(factory, Role.class);
    }

    @Override
    public Optional<Role> getByName(Role.RoleName roleName) {
        try (Session session = factory.openSession()) {
            Query<Role> getByNameQuery = session.createQuery(
                    "FROM Role WHERE roleName = :roleName", Role.class);
            getByNameQuery.setParameter("roleName", roleName);
            return getByNameQuery.uniqueResultOptional();
        } catch (Exception e) {
            throw new DataProcessingException("Not found role for roleName "
                    + roleName, e);
        }
    }
}
