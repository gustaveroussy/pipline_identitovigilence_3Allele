package demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.entite.Snp;
import demo.entite.service.SnpService;

@Controller
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class SNPcontroller {

	@Autowired
	SnpService snpSerivce;
	
	@GetMapping("/allSNP")
	@ResponseBody
	public List<Snp> getAllSnp() {
			
		return snpSerivce.getAllSnp();
		
	}
	@GetMapping("/getsnpbygene")
	@ResponseBody
	public List <Snp>getsnpBygene(@RequestParam("gene")String gene){
		return snpSerivce.getsnpBygene(gene);
	}
	
	@PostMapping("/saveSNPs")
	@ResponseBody
	public void saveSNPs(@RequestBody @NonNull List<Snp> snps) {
		snpSerivce.save(snps);
	}
	
}
