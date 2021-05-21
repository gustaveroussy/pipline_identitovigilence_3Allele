package demo.entite.service.Impl;

import java.util.List;
import java.util.Optional;

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
	public List<Echantillion> getAllEchantillion() {
		
		return echrepo.findAll();
	}

	@Override
	public void save(List<Echantillion> echs) {
		echrepo.saveAll(echs);
	}

	@Override
	public void saveone(Echantillion ch1) {
		echrepo.save(ch1);
		
		
	}


	@Override
	public Echantillion getBYnomech(String nomech) {
		
		return echrepo.findByNomechantillion(nomech);
	}


	@Override
	public Echantillion getByID(Integer id) {
		Optional<Echantillion> ech = echrepo.findById(id);
		return ech.get();
	}
	
}
