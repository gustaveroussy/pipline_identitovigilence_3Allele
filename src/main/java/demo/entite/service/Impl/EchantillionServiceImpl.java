package demo.entite.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.entite.Echantillion;
import demo.entite.repository.EchantillionRepo;
import demo.entite.service.EchantillionService;

@Service
public class EchantillionServiceImpl implements EchantillionService{

	private EchantillionRepo echrepo;
	
	@Autowired
	public void setRepo(EchantillionRepo echrepo) {
		
		this.echrepo = echrepo;
		
	}
	
	@Override
	public void save(Echantillion ech) {
		echrepo.save(ech);		
	}

	@Override
	public List<Echantillion> getAllEchantillion() {
		
		return echrepo.findAll();
	}
}