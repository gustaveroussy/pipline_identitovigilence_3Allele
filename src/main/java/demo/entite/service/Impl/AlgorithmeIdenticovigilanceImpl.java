package demo.entite.service.Impl;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.entite.Echantillion;
import demo.entite.Run;
import demo.entite.Snp;
import demo.entite.Snpechantillion;
import demo.entite.service.AlgorithmeIdenticovigilance;
import demo.entite.service.EchantillionService;
import demo.entite.service.RunService;
import demo.entite.service.SnpEchantillionService;
import demo.entite.service.SnpService;

@Service
public class AlgorithmeIdenticovigilanceImpl implements AlgorithmeIdenticovigilance{
	
	@Autowired
	private SnpEchantillionService snpechser;
	
	@Autowired
	private RunService runservice;
	
	@Autowired
	private EchantillionService echservice;
	@Autowired
	private SnpService snpservice;
	
	
	@Override
	public Map<String, Double> calculerRatio() {
		
		Run r;
		Run runlazy;
		Echantillion ech;
		Echantillion echlazy;
		Snp s;
		Snp snplazy;
		Integer idech;
		Snpechantillion snpech;
		
		String nomrun;
		String nomech;
		String chr;
		Integer position;
		Double ratio;
		
		// TODO Réaliser une fonction qui parcourt la table Snpechantillon pour remplir une Map
		// La clef de la map sera une concatenation du nom du run avec le nom de l'echantillon avec le chromosome du snp et la position du snp
		// La valeur sera le ratio refprofondeur/depth
		List<Snpechantillion> lsn = snpechser.getAllsnpechantillion();//recuperer la liste de snpechantillion
		Map<String,Double>retio = new HashMap<>();
		
		for(int i = 0; i < lsn.size(); i++) {
			
			snpech = lsn.get(i); 
			
			ech = snpech.getEchantillion();
			
			echlazy = echservice.getByID(ech.getIdechantillion());
			
			runlazy = echlazy.getRun();
			
			r = runservice.getByIdRun(runlazy.getId());

			s=snpech.getSnp();
			snplazy=snpservice.getBYsnp(s.getIdSnp());
			
			nomrun 		= r.getNomrun();
			nomech 		= echlazy.getNom_echantillion();
			chr			= snplazy.getChromosome();
			position 	= snplazy.getPosition();
			ratio		= new Double(snpech.getRefcount())/new Double(snpech.getDepth());
			
			retio.put(nomrun + ":" + nomech + ":" + chr + ":" + position,ratio);
		}	
		
		return retio;
}
}

