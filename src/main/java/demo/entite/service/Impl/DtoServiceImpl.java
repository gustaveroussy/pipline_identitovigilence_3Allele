package demo.entite.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.entite.Dto;
import demo.entite.Echantillion;
import demo.entite.Snp;
import demo.entite.Snpechantillion;
import demo.entite.service.DtoService;
import demo.entite.service.EchantillionService;
import demo.entite.service.SnpEchantillionService;
import demo.entite.service.SnpService;


@Service
public class DtoServiceImpl implements DtoService{
	@Autowired
	private EchantillionService echrep;
	@Autowired
	private SnpService snpser;
	@Autowired
	private SnpEchantillionService snpechser;
	

	@Override
	public void save(List<Dto> dto) {
		String nomech;
		Echantillion ech;
		Snp snp;
		Snpechantillion snpech;
		String chromosome ; 
		List<Snpechantillion> lsnpech = new ArrayList < Snpechantillion >();
		
		int posotion;
		for(int i=0; i < dto.size();i++) {
			nomech = dto.get(i).getNomech();
			ech = echrep.getBYnomech(nomech);
			
			if(ech == null) {
				
				ech = new Echantillion();
				ech.setNom_echantillion(nomech);
				echrep.saveone(ech);
				
			}
			
			
			chromosome = dto.get(i).getChr();
			posotion= dto.get(i).getPos();
			snp = snpser.getBYchormosomeposition(chromosome ,posotion);
			snpech = new Snpechantillion();
			snpech.setAcount(dto.get(i).getAcount());
			snpech.setAltcount(dto.get(i).getAltcount());
			snpech.setCcount(dto.get(i).getCcount());
			snpech.setEchantillion(ech);
			snpech.setGcount(dto.get(i).getGcount());
			snpech.setNcount(dto.get(i).getNcount());
			snpech.setRefcount(dto.get(i).getRefcount());
			snpech.setNip(dto.get(i).getNomech());
			snpech.setTcount(dto.get(i).getTcount());
			snpech.setSnp(snp);
			lsnpech.add(snpech);	
		}
		
		snpechser.save(lsnpech);
		
	}

}
