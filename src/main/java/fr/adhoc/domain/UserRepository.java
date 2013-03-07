package fr.adhoc.domain;


/** Loads an user by its identifier et son email
 */

public interface UserRepository {

	public User findById(int identifier);
	public User findByEmail(String email);

}