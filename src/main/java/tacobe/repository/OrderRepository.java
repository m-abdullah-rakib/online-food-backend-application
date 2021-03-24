package tacobe.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tacobe.domain.Order;
import tacobe.domain.User;

@Repository
public interface OrderRepository 
         extends CrudRepository<Order, Long> {

  List<Order> findByUserOrderByPlacedAtDesc(
          User user, Pageable pageable);

}
