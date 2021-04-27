package demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.entite.Echantillion;
import demo.entite.service.EchantillionService;

@Controller

public class EchantillionController {
	@Autowired
EchantillionService echantillionservice;
	@GetMapping("/allEch")
	@ResponseBody
	public List<Echantillion> getAllEchantillion(){
		return echantillionservice.getAllEchantillion();
		
	}
	
	@PostMapping("/saveEchs")
	@ResponseBody
	public void saveEchs(@RequestBody @NonNull List<Echantillion> Echs) {
		echantillionservice.save(Echs);
	}
	

}
