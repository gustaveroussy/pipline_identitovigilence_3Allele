package demo.entite;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity

public class Echantillion implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int idechantillion; 
	private String nomechantillion;
	private String nompatient;
	private String prénompatient;
	private int nip;
	
	@ManyToOne ( fetch = FetchType . LAZY ) 
	@JoinColumn ( name = "id_Run" )
	private  Run run  ; 
		
	public Echantillion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Echantillion(int idechantillion, String nomechantillion, String nompatient, String prénompatient,
					int nip, Run run, List<Snpechantillion> snpechantillions) {
			super();
			this.idechantillion = idechantillion;
			this.nomechantillion = nomechantillion;
			this.nompatient = nompatient;
			this.prénompatient = prénompatient;
			this.nip = nip;
			this.run = run;

	}

	public int getIdechantillion() {
		return idechantillion;
	}

	public void setIdechantillion(int id_echantillion) {
		this.idechantillion = id_echantillion;
	}

	public String getNom_echantillion() {
		return nomechantillion;
	}

		public void setNom_echantillion(String nomechantillion) {
			this.nomechantillion = nomechantillion;
		}

		public String getNom_patient() {
			return nompatient;
		}

		public void setNom_patient(String nompatient) {
			this.nompatient = nompatient;
		}

		public String getPrénom_patient() {
			return prénompatient;
		}

		public void setPrénom_patient(String prénompatient) {
			this.prénompatient = prénompatient;
		}

		public Run getRun() {
			return run;
		}

		public void setRun(Run run) {
			this.run = run;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		public int getNip() {
			return nip;
		}

		public void setNip(int nip) {
			this.nip = nip;
		}

		@Override
		public String toString() {
			return "Echantillion [idechantillion=" + idechantillion + ", nomechantillion=" + nomechantillion
					+ ", nompatient=" + nompatient + ", prénompatient=" + prénompatient + ", nip=" + nip + "]";
		}

}
