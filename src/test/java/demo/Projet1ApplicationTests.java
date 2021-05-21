package demo;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import demo.controller.Dtocontroller;
import demo.controller.SNPcontroller;
import demo.entite.Dto;
import demo.entite.Echantillion;
import demo.entite.Run;
import demo.entite.Snp;
import demo.entite.Snpechantillion;
import demo.entite.service.AlgorithmeIdenticovigilance;
import demo.entite.service.EchantillionService;
import demo.entite.service.RunService;
import demo.entite.service.SnpService;
import demo.entite.service.SnpEchantillionService;

@SpringBootTest
class Projet1ApplicationTests {

	@Autowired
Dtocontroller dtocontroller;
	
@Autowired
	RunService runservice;	
@Autowired	
  EchantillionService echservice;
@Autowired
  SnpService snpservice;
@Autowired
  SnpEchantillionService echsnpservice;

@Autowired
SNPcontroller snpCOntroller;

	@Autowired
	AlgorithmeIdenticovigilance algorithmeIdenticovigilance;

	@Test
	void contextLoads() {
	}
	
	/*@Test
	void DTO() {
		
		List<Dto> se = new ArrayList<Dto>();
		Dto dto = new Dto();
		
		dto.setAcount(0);
		dto.setAltcount(1);
		dto.setCcount(0);
		dto.setChr("chr1");
		dto.setDepth(1000);
		dto.setGcount(3);
		dto.setIndelcount(4);
		dto.setIdentifier(0);
		dto.setNcount(0);
		dto.setNomech("2317-409809-201305213UK--_S1_L001_001");
		dto.setNomrun("200703_NS500197_0765_AH7F2JAFX2_Identito_conta_readcounts");
		dto.setPos(17371224);
		dto.setRef_base("C");
		dto.setRefcount(366);
		dto.setTcount(0);
		dto.setGenedereference("ht19");
		
		se.add(dto);
		dto = new Dto();
		dto.setAcount(0);
		dto.setAltcount(1);
		dto.setCcount(0);
		dto.setChr("chr1");
		dto.setDepth(1000);
		dto.setGcount(3);
		dto.setIndelcount(4);
		dto.setIdentifier(0);
		dto.setNcount(0);
		dto.setNomech("test");
		dto.setNomrun("200703_NS500197_0765_AH7F2JAFX2_Identito_conta_readcounts");
		dto.setPos(17371224);
		dto.setRef_base("C");
		dto.setRefcount(366);
		dto.setTcount(0);
		dto.setGenedereference("ht19");
		
		se.add(dto);
		
		dtocontroller.saveSnpech(se);
		
		
		
	}
	
	//@Test
	void saveRun() {
		
		Run run1 = new Run();
		
		run1.setDate_run(new Date());
		run1.setNomrun("test");
		runservice.save(run1);
		
		Run runbis1 = runservice.get("testb");
		
		System.out.println(runbis1);
	}
	
	//@Test
	void saveEch() {
		
	Echantillion ech = new Echantillion();
	
		ech.setNip(1);
		ech.setIdechantillion(1);
		ech.setNom_patient("bi");
		ech.setPrénom_patient("");		
		echservice.saveone(ech);
		 
		 echservice.getAllEchantillion();
		System.out.println(ech);
		
   	
	}
	
	//@Test
	void getAllSnpRest() {
		System.out.println("snpCOntroller.getAllSnp().get(0)");
		System.out.println(snpCOntroller.getAllSnp().get(0));
		
	}
	
	//@Test 
	void saveSnp() {
		
		Snp snip =new Snp();
		snip.setChromosome("b");
		snip.setGemoderéference("a");
		snip.setPosition(200);
		snip.setGene("test");
		snpservice.save(snip);
		
	}
	
	//@Test 
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
	}*/
	@Test 
	void testratio() throws IOException {
		Map<String, Double> ratio = algorithmeIdenticovigilance.calculerRatio();
		
		Map<Object, Object> result = ratio.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		
		BufferedWriter writter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("ratio/ratio.txt", true), StandardCharsets.UTF_8));
		
		Set<Entry<String, Double>> clefs = ratio.entrySet();
		
		Iterator<Entry<String, Double>> it = clefs.iterator();
		
		String clef;
		
		while (it.hasNext()) {
			
			writter.append(it.next().toString());
			writter.append("\n");
			
		}
		
		writter.close();
		
		BufferedWriter writterbis = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("ratio/ratiotri.txt", true), StandardCharsets.UTF_8));
		
		Set<Entry<Object, Object>> clefsbis = result.entrySet();
		
		Iterator<Entry<Object, Object>> itbis = clefsbis.iterator();
		
		String clefbis;
		
		while (itbis.hasNext()) {
			
			writterbis.append(itbis.next().toString());
			writterbis.append("\n");
			
		}
		
		writterbis.close();
		
	}
}
