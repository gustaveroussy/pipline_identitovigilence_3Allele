package demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import demo.entite.Dto;
import demo.entite.service.DtoService;

public class Dtocontroller {
	@Autowired
	DtoService dtoservice;
	
	
	@PostMapping("/saveSnpEch")
	public void snpech(List <Dto>se  ) {
		
	}

}
