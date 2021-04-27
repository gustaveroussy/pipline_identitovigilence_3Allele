package demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.entite.Snpechantillion;
import demo.entite.service.SnpEchantillionService;

@Controller

public class Snpechantillioncontroller {
	@Autowired
	SnpEchantillionService snpechantillion;
	
	
	@GetMapping("/byidech")
	@ResponseBody
	
	public List <Snpechantillion> getbyidechs(int ech) {
		return  snpechantillion.getbyidech(ech) ;
	}
	

}
