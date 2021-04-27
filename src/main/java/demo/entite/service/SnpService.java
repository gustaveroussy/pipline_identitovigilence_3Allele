package demo.entite.service;

import java.util.List;

import demo.entite.Snp;

public interface SnpService {
	public void save(Snp snp);
	public void save(List<Snp> snp);
	public List<Snp>getAllSnp();
	public List <Snp>getsnpBygene(String gene);
	public Snp getBYchormosomeposition(String chromosome ,int position);
}
