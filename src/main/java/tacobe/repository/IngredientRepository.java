package tacobe.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tacobe.domain.Ingredient;

@Repository
public interface IngredientRepository 
         extends CrudRepository<Ingredient, String> {

}
