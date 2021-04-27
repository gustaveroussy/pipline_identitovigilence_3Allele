package demo.entite.service;

import java.util.List;

import demo.entite.Echantillion;

public interface EchantillionService {

	public void save(List<Echantillion> echs);
	
	public void saveone(Echantillion ch1);
	public List<Echantillion> getAllEchantillion();
	public Echantillion getBYnomech(String nomech);
	
	
	
	
}
