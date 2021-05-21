package demo.entite.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.entite.Run;
import demo.entite.repository.RunRepo;
import demo.entite.service.RunService;

@Service
public class RunServiceImpl implements RunService {

	private RunRepo runrepo;
	
	@Autowired
	public void setRepo(RunRepo runrepo) {
		
		this.runrepo = runrepo;
		
	}
	
	@Override
	public void save(Run run) {
		runrepo.save(run);
		
	}
	@Override
    public Run get(String nomRun) {
		
		return runrepo.findByNomrun(nomRun);
		
	}

//	@Override
//	public void editIfExistElseInsertNewRun(Run run) {
//		// TODO Auto-generated method stub
//		
//	}

	@Override
	public List<Run> getAllrun() {
		return runrepo.findAll();
	}

	@Override
	public Run getBYnomrun(String nomrun) {
		
		return runrepo.findByNomrun(nomrun) ;
	}

	@Override
	public void saveall(List<Run> run) {
		 runrepo.saveAll(run);
		
	}

	@Override
	public Run getByIdRun(Integer id) {
		Optional<Run> run = runrepo.findById(id);
		return run.get();
	}


}
