package demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.entite.Run;
import demo.entite.service.RunService;

@Controller
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class RunController {
	@Autowired
	RunService runservice;
	
	@PostMapping("/saveRuns")
	@ResponseBody
	public void saveRuns( Run run ) {
		
		runservice.save(run);
		
	}
	

}
