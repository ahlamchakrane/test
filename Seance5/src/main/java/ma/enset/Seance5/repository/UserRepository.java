package ma.enset.Seance5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.enset.Seance5.entities.User;
@Repository
public interface UserRepository extends JpaRepository<User,String> {
	User findByUsername(String username);
}
