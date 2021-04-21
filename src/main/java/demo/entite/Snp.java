package demo.entite;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity

public class Snp implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int idSnp;
	
	private String chromosome;
	private int Position;
	private String Gemoderéference;
	private String gene;
	
	@OneToMany ( mappedBy  =  "snp" ) 
	private  List <Snpechantillion>snp_echantillion;

	public String getChromosome() {
		return chromosome;
	}

	public void setChromosome(String chromosome) {
		this.chromosome = chromosome;
	}

	public int getPosition() {
		return Position;
	}

	public String getGene() {
		return gene;
	}

	public void setGene(String gene) {
		this.gene = gene;
	}

	public void setPosition(int position) {
		Position = position;
	}

	public String getGemoderéference() {
		return Gemoderéference;
	}

	public void setGemoderéference(String gemoderéference) {
		Gemoderéference = gemoderéference;
	}

	@Override
	public String toString() {
		return "Snp [idSnp=" + idSnp + ", chromosome=" + chromosome + ", Position=" + Position + ", Gemoderéference="
				+ Gemoderéference + "]";
	}

}
