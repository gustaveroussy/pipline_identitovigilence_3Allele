package demo.entite.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.entite.Snp;
import demo.entite.repository.SnpRop;
import demo.entite.service.SnpService;
@Service
public class SnpServiceImpl implements SnpService {
   private SnpRop snprop;
   
   
   @Autowired
   
   public void setSnprop(SnpRop snprop) {
		this.snprop = snprop;
	}

	@Override
	public void save(Snp snp) {
		snprop.save(snp);
	}

	@Override
	public List<Snp> getAllSnp() {
		
		return snprop.findAll();
	}

	@Override
	public List<Snp> getsnpBygene(String gene) {
		
		return snprop.findByGene(gene);
	}

	@Override
	public void save(List<Snp> snp) {
		snprop.saveAll(snp);
		
	}
}
