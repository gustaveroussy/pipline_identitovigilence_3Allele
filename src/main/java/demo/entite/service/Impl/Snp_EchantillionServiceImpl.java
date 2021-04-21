package demo.entite.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.entite.Snpechantillion;
import demo.entite.repository.Snp_echantillionRepo;
import demo.entite.service.Snp_EchantillionService;
@Service
public class Snp_EchantillionServiceImpl implements Snp_EchantillionService{
	private Snp_echantillionRepo snpechanrep;
	@Autowired
	
	public void setSnpechanrep(Snp_echantillionRepo snpechanrep) {
		this.snpechanrep = snpechanrep;
	}

	@Override
	public void save(Snpechantillion snpech) {
		snpechanrep.save(snpech);
		
	}

//	@Override
//	public List<Snp_echantillion> getAllsnp_echantillion() {
//		
//		return snpechanrep.findAll();
//	}

	@Override
	public List<Snpechantillion> getbyidech(int ech) {
		// TODO Auto-generated method stub
		return snpechanrep.findByEchantillion_Idechantillion(ech);
	}

}
