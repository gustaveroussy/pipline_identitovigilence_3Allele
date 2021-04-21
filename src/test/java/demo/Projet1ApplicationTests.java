package demo;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import demo.controller.SNPcontroller;
import demo.entite.Echantillion;
import demo.entite.Run;
import demo.entite.Snp;
import demo.entite.Snpechantillion;
import demo.entite.service.EchantillionService;
import demo.entite.service.RunService;
import demo.entite.service.SnpService;
import demo.entite.service.Snp_EchantillionService;

@SpringBootTest
class Projet1ApplicationTests {

@Autowired
	RunService runservice;	
@Autowired	
  EchantillionService echservice;
@Autowired
  SnpService snpservice;
@Autowired
  Snp_EchantillionService echsnpservice;

@Autowired
SNPcontroller snpCOntroller;

	@Test
	void contextLoads() {
	}
	
	@Test
	void saveRun() {
		
		Run run1 = new Run();
		
		run1.setDate_run(new Date());
		run1.setNomrun("test");
		runservice.save(run1);
		
		Run runbis1 = runservice.get("testb");
		
		System.out.println(runbis1);
	}
	
	@Test
	void saveEch() {
		
	Echantillion ech = new Echantillion();
		
		ech.setDepth(1);
		ech.setNom_echantillion("atsi");
		ech.setNom_patient("bi");
		ech.setPrénom_patient("");		
		echservice.save(ech);
		 
		 //echservice.getAllEchantillion();
		//System.out.println(ech);
		
   	
	}
	
	@Test
	void getAllSnpRest() {
		System.out.println("snpCOntroller.getAllSnp().get(0)");
		System.out.println(snpCOntroller.getAllSnp().get(0));
		
	}
	
	@Test 
	void saveSnp() {
		
		Snp snip =new Snp();
		snip.setChromosome("b");
		snip.setGemoderéference("a");
		snip.setPosition(200);
		snip.setGene("test");
		snpservice.save(snip);
		
	}
	
	@Test 
	void saveSnpech() {
		
		List<Echantillion> listech = echservice.getAllEchantillion();
		
		List<Snp> listesnp = snpservice.getAllSnp();
		Snp snp;
		for (int i = 0; i < listesnp.size(); i++) {
			snp = listesnp.get(i);
	
			Snpechantillion snip = new Snpechantillion();
			snip.setEchantillion(listech.get(0));
			snip.setSnp(snp);
			echsnpservice.save(snip);
		}
	}
}
