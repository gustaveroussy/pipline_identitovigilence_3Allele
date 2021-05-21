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
	private int position;
	private String Gemoderéference;
	private String gene;
	
	
	@OneToMany ( mappedBy  =  "snp" ) 
	private  List <Snpechantillion>snp_echantillion;
	

	public Snp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Snp(int idSnp, String chromosome, int position, String gemoderéference, String gene,
			List<Snpechantillion> snp_echantillion) {
		super();
		this.idSnp = idSnp;
		this.chromosome = chromosome;
		this.position = position;
		this.Gemoderéference = gemoderéference;
		this.gene = gene;
		this.snp_echantillion = snp_echantillion;
	}

	public String getChromosome() {
		return chromosome;
	}

	public void setChromosome(String chromosome) {
		this.chromosome = chromosome;
	}

	public int getPosition() {
		return position;
	}

	public String getGene() {
		return gene;
	}

	public void setGene(String gene) {
		this.gene = gene;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public String getGemoderéference() {
		return Gemoderéference;
	}

	public void setGemoderéference(String gemoderéference) {
		Gemoderéference = gemoderéference;
	}

	public int getIdSnp() {
		return idSnp;
	}

	public void setIdSnp(int idSnp) {
		this.idSnp = idSnp;
	}

	@Override
	public String toString() {
		return "Snp [idSnp=" + idSnp + ", chromosome=" + chromosome + ", position=" + position + ", Gemoderéference="
				+ Gemoderéference + ", gene=" + gene + "]";
	}

}
