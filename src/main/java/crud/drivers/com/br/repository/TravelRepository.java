package crud.drivers.com.br.repository;

import crud.drivers.com.br.entity.Travel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelRepository extends JpaRepository<Travel, Integer> {
}
