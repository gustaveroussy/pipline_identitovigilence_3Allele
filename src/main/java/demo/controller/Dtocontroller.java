package demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.entite.Dto;
import demo.entite.service.DtoService;

@Controller
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class Dtocontroller {
	@Autowired
	DtoService dtoservice;
	
	@PostMapping("/saveSnpEch")
	@ResponseBody
	public void saveSnpech(@RequestBody List <Dto>se  ) {
		dtoservice.save(se);
		
	}

}
