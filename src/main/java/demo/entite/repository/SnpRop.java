package demo.entite.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import demo.entite.Snp;
@Repository

public interface SnpRop extends JpaRepository<Snp, Integer> {
	public List <Snp> findByGene(String genename);
	public Snp findByChromosomeAndPosition(String chromosome , int position);
}
