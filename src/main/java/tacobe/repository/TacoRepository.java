package tacobe.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import tacobe.domain.Taco;

@Repository
public interface TacoRepository 
         extends PagingAndSortingRepository<Taco, Long> {

}
