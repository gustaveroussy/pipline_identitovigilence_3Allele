package demo.entite.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import demo.entite.Snpechantillion;

@Repository
public interface Snp_echantillionRepo extends JpaRepository<Snpechantillion, Integer>{
	public List <Snpechantillion> findByEchantillion_Idechantillion(int idech);
	

}
