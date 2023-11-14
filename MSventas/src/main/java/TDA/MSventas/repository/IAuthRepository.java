package TDA.MSventas.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
 
import TDA.MSventas.model.modelVentas;

@Repository
public interface IAuthRepository extends CrudRepository<modelVentas, Integer> {


    
}
