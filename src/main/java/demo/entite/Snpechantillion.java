package demo.entite;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity

public class Snpechantillion implements Serializable{
	  
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  @Column(unique=true, nullable=false)
	  private int id;
	  private int depth;
	  private int Refcount;
	  private int Altcount;
	  private int Acount;
	  private int Ccount;
	  private int Gcount;
	  private int Tcount;
	  private int Ncount;
	  private String refbase;
	  @ManyToOne ( fetch = FetchType . LAZY ) 
	   @JoinColumn ( name = "idSnp" ) 
	   private  Snp snp; 
	  
	  @ManyToOne ( fetch = FetchType . LAZY ) 
	   @JoinColumn ( name = "id_echantillion" ) 
	   private Echantillion  echantillion ;



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRefcount() {
		return Refcount;
	}

	public void setRefcount(int refcount) {
		Refcount = refcount;
	}

	public int getAltcount() {
		return Altcount;
	}

	public void setAltcount(int altcount) {
		Altcount = altcount;
	}

	public int getAcount() {
		return Acount;
	}

	public void setAcount(int acount) {
		Acount = acount;
	}

	public int getCcount() {
		return Ccount;
	}

	public void setCcount(int ccount) {
		Ccount = ccount;
	}

	public int getGcount() {
		return Gcount;
	}

	public void setGcount(int gcount) {
		Gcount = gcount;
	}

	public int getTcount() {
		return Tcount;
	}

	public void setTcount(int tcount) {
		Tcount = tcount;
	}

	public int getNcount() {
		return Ncount;
	}

	public void setNcount(int ncount) {
		Ncount = ncount;
	}

	public Snp getSnp() {
		return snp;
	}

	public void setSnp(Snp snp) {
		this.snp = snp;
	}

	public Echantillion getEchantillion() {
		return echantillion;
	}

	public void setEchantillion(Echantillion echantillion) {
		this.echantillion = echantillion;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public String getRefbase() {
		return refbase;
	}

	public void setRefbase(String string) {
		this.refbase = string;
	}

	@Override
	public String toString() {
		return "Snpechantillion [id=" + id + ", depth=" + depth + ", Refcount=" + Refcount + ", Altcount=" + Altcount
				+ ", Acount=" + Acount + ", Ccount=" + Ccount + ", Gcount=" + Gcount + ", Tcount=" + Tcount
				+ ", Ncount=" + Ncount + ", refbase=" + refbase + "]";
	}
  
}
