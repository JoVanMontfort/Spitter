package spitter.data;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import spitter.model.Spittle;

public interface SpittleRepository extends JpaRepository<Spittle, Long> {

	List<Spittle> findAll();

	Spittle findByMessage(String message);

	Optional<Spittle> findById(Long id);

}
