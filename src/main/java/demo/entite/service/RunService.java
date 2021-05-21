package demo.entite.service;

import java.util.List;

import demo.entite.Run;

public interface RunService {

	public void save(Run run);
	public void saveall(List<Run> run);
	
	//public void editIfExistElseInsertNewRun(Run run);
	
	public Run get(String nomRun);
	public List <Run>getAllrun();
	public Run getBYnomrun(String nomrun);
	public Run getByIdRun(Integer id);
	
}
