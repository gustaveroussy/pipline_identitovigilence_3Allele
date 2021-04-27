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

	/**
	 * 
	 */
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
	   
//	   @OneToMany ( mappedBy  =  "id_echantillion" ) 
//		private  List <Snp_echantillion>snp_echantillions; 
		
		
		 public Echantillion() {
		super();
		// TODO Auto-generated constructor stub
	}


		public Echantillion(int idechantillion, String nomechantillion, String nompatient, String prénompatient,
					int depth, Run run, List<Snpechantillion> snpechantillions) {
				super();
				this.idechantillion = idechantillion;
				this.nomechantillion = nomechantillion;
				this.nompatient = nompatient;
				this.prénompatient = prénompatient;
				this.nip = nip;
				this.run = run;
//				this.snp_echantillions = snp_echantillions;
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


//		public List<Snp_echantillion> getSnp_echantillions() {
//			return snp_echantillions;
//		}
//
//
//		public void setSnp_echantillions(List<Snp_echantillion> snp_echantillions) {
//			this.snp_echantillions = snp_echantillions;
//		}


		public static long getSerialversionuid() {
			return serialVersionUID;
		}


		public int getNip() {
			return nip;
		}


		public void setNip(int nip) {
			this.nip = nip;
		}


//		@Override
//		public String toString() {
//			return "Echantillion [id_echantillion=" + id_echantillion + ", Nom_echantillion=" + Nom_echantillion
//					+ ", nom_patient=" + nom_patient + ", prénom_patient=" + prénom_patient + ", Depth=" + Depth
//					+ ", run=" + run + ", snp_echantillions=" + snp_echantillions + ", getId_echantillion()="
//					+ getId_echantillion() + ", getNom_echantillion()=" + getNom_echantillion() + ", getNom_patient()="
//					+ getNom_patient() + ", getPrénom_patient()=" + getPrénom_patient() + ", getDepth()=" + getDepth()
//					+ ", getRun()=" + getRun() + ", getSnp_echantillions()=" + getSnp_echantillions() + ", getClass()="
//					+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
//		}


//		@Override
//		public int hashCode() {
//			final int prime = 31;
//			int result = 1;
//			result = prime * result + Depth;
//			result = prime * result + ((Nom_echantillion == null) ? 0 : Nom_echantillion.hashCode());
//			result = prime * result + ((id_echantillion == null) ? 0 : id_echantillion.hashCode());
//			result = prime * result + ((nom_patient == null) ? 0 : nom_patient.hashCode());
//			result = prime * result + ((prénom_patient == null) ? 0 : prénom_patient.hashCode());
//			result = prime * result + ((run == null) ? 0 : run.hashCode());
//			result = prime * result + ((snp_echantillions == null) ? 0 : snp_echantillions.hashCode());
//			return result;
//		}


//		@Override
//		public boolean equals(Object obj) {
//			if (this == obj)
//				return true;
//			if (obj == null)
//				return false;
//			if (getClass() != obj.getClass())
//				return false;
//			Echantillion other = (Echantillion) obj;
//			if (Depth != other.Depth)
//				return false;
//			if (Nom_echantillion == null) {
//				if (other.Nom_echantillion != null)
//					return false;
//			} else if (!Nom_echantillion.equals(other.Nom_echantillion))
//				return false;
//			if (id_echantillion == null) {
//				if (other.id_echantillion != null)
//					return false;
//			} else if (!id_echantillion.equals(other.id_echantillion))
//				return false;
//			if (nom_patient == null) {
//				if (other.nom_patient != null)
//					return false;
//			} else if (!nom_patient.equals(other.nom_patient))
//				return false;
//			if (prénom_patient == null) {
//				if (other.prénom_patient != null)
//					return false;
//			} else if (!prénom_patient.equals(other.prénom_patient))
//				return false;
//			if (run == null) {
//				if (other.run != null)
//					return false;
//			} else if (!run.equals(other.run))
//				return false;
//			if (snp_echantillions == null) {
//				if (other.snp_echantillions != null)
//					return false;
//			} else if (!snp_echantillions.equals(other.snp_echantillions))
//				return false;
//			return true;
//		}
		

		
	   
		

}
