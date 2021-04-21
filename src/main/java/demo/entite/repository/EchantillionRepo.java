package demo.entite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import demo.entite.Echantillion;
@Repository
public interface EchantillionRepo extends JpaRepository<Echantillion, Integer>{

	//public Echantillion findBySNP_IdSnpANDEchantillion_idechantillion(int idSNP, int Idech);
		
}
