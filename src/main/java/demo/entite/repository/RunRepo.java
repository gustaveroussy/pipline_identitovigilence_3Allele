package demo.entite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import demo.entite.Run;
@Repository


public interface RunRepo extends JpaRepository<Run, Integer>{

	public Run findByNomrun(String nomrun);
	
	
}
