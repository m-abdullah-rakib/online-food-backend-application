package tacobe.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tacobe.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

  User findByUsername(String username);
  
}
