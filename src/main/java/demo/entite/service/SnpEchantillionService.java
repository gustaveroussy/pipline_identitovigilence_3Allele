package demo.entite.service;


import java.util.List;

import demo.entite.Snpechantillion;

public interface SnpEchantillionService {
	public List <Snpechantillion> getbyidech(int ech);
	public void save(Snpechantillion snpech);
	//public List<Snp_echantillion>getAllsnp_echantillion();
	public void save( List <Snpechantillion> listeEch);
	

}
