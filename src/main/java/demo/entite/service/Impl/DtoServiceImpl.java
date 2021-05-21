package demo.entite.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.entite.Dto;
import demo.entite.Echantillion;
import demo.entite.Run;
import demo.entite.Snp;
import demo.entite.Snpechantillion;
import demo.entite.service.DtoService;
import demo.entite.service.EchantillionService;
import demo.entite.service.RunService;
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
	@Autowired
	private RunService runser;
	
	@Override
	public void save(List<Dto> dto) {
		String nomrun;
		String genomdereference;
		Run run;
		String nomechantillion;
		Echantillion ech;
		Snp snp;
		Snpechantillion snpech;
		String chromosome ; 
		List<Snpechantillion> lsnpech = new ArrayList < Snpechantillion >();
		List<Snp>listsnp=new ArrayList<Snp>();
		List<Echantillion>listech= new ArrayList<Echantillion>();
		List<Run>listrun= new ArrayList<Run>();
		int posotion;
		
		for(int i=0; i < dto.size();i++) {
			nomrun =dto.get(i).getNomrun();
			run=runser.getBYnomrun(nomrun );
			nomechantillion = dto.get(i).getNomechantillion();
			ech = echrep.getBYnomech(nomechantillion);
			
			if(run == null) {
				run =new Run();
				run.setNomrun(nomrun);
				runser.save(run);
			}
			
			if(ech == null) {
				
				ech = new Echantillion();
				ech.setNom_echantillion(nomechantillion);
				ech.setRun(run);
				echrep.saveone(ech);
				
			}
			
			chromosome = dto.get(i).getChr();
			posotion= dto.get(i).getPos();
			genomdereference=dto.get(i).getGenomdereference();
			snp = snpser.getBYchormosomeposition(chromosome, posotion);
			
			if (snp == null) {
				
				snp = new Snp();
				snp.setChromosome(chromosome);
				snp.setPosition(posotion);
				snp.setGemoderéference(genomdereference);
				snpser.save(snp);
				snp = snpser.getBYchormosomeposition(chromosome, posotion);
			}
		
			
			System.out.println("snp");
			System.out.println(snp);
			
			System.out.println(chromosome);
			System.out.println(posotion);
			
			snpech = new Snpechantillion();
			snpech.setAcount(dto.get(i).getAcount());
			snpech.setAltcount(dto.get(i).getAltcount());
			snpech.setCcount(dto.get(i).getCcount());
			snpech.setEchantillion(ech);
			snpech.setGcount(dto.get(i).getGcount());
			snpech.setRefbase(dto.get(i).getRefbase());
			snpech.setNcount(dto.get(i).getNcount());
			snpech.setRefcount(dto.get(i).getRefcount());
			snpech.setTcount(dto.get(i).getTcount());
			snpech.setDepth(dto.get(i).getDepth());
			snpech.setSnp(snp);
			lsnpech.add(snpech);	
		}
		
		snpechser.save(lsnpech);
		snpser.save(listsnp);
		echrep.save(listech);
		runser.saveall(listrun);
}
}
