package fr.adhoc.domain;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/** Find user objects by using the JPA API
 */

@Repository
public class JpaUserRepository implements UserRepository{ 

	private EntityManager entityManager;

	/** Set the entity manager. Assumes automatic dependency injection via the JPA @PersistenceContext
	*/

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager=entityManager;
	}

	public User findById(int identifier) {
		return (User) entityManager.find(User.class,identifier);
	}

	public User findByEmail(String email) {
		return (User) entityManager.createQuery("select u from User u where u.email=?").setParameter(1,email).getSingleResult();	

	}

	}



