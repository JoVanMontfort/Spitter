package spitter.data;

import org.springframework.data.jpa.repository.JpaRepository;

import spitter.model.Spitter;

public interface SpitterRepository extends JpaRepository<Spitter, Long> {

	Spitter findByUsername(String username);

}
