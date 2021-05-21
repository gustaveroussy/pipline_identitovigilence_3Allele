package demo.entite;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class Dto implements Serializable {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String nomechantillion;
	private String nomrun;
	private String chr;
	private int pos;
	private int depth;	
	private String refbase;
	private int refcount;	
	private int altcount;	
	private int acount;	
	private int ccount;	
	private int gcount;
	private int tcount;	
	private int ncount;	
	private int indelcount;	
	private int identifier;
	private String genomdereference;
	
	
	public Dto(String nomechantillion, String nomrun, String chr, int pos, int depth, String refbase, int refcount, int altcount,
			int acount, int ccount, int gcount, int tcount, int ncount, int indelcount, int identifier, String genomdereference) {
		super();
		this.nomechantillion = nomechantillion;
		this.nomrun = nomrun;
		this.chr = chr;
		this.pos = pos;
		this.depth = depth;
		this.refbase = refbase;
		this.refcount = refcount;
		this.altcount = altcount;
		this.acount = acount;
		this.ccount = ccount;
		this.gcount = gcount;
		this.tcount = tcount;
		this.ncount = ncount;
		this.indelcount = indelcount;
		this.identifier = identifier;
		this.setGenomdereference(genomdereference);
		
	}
	
	public Dto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNomechantillion() {
		return nomechantillion;
	}

	public void setNomechantillion(String nomechantillion) {
		this.nomechantillion = nomechantillion;
	}

	public String getNomrun() {
		return nomrun;
	}

	public void setNomrun(String nomrun) {
		this.nomrun = nomrun;
	}

	public String getChr() {
		return chr;
	}

	public void setChr(String chr) {
		this.chr = chr;
	}

	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
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

	public void setRefbase(String refbase) {
		this.refbase = refbase;
	}

	public int getRefcount() {
		return refcount;
	}

	public void setRefcount(int refcount) {
		this.refcount = refcount;
	}

	public int getAltcount() {
		return altcount;
	}

	public void setAltcount(int altcount) {
		this.altcount = altcount;
	}

	public int getAcount() {
		return acount;
	}

	public void setAcount(int acount) {
		this.acount = acount;
	}

	public int getCcount() {
		return ccount;
	}

	public void setCcount(int ccount) {
		this.ccount = ccount;
	}

	public int getGcount() {
		return gcount;
	}

	public void setGcount(int gcount) {
		this.gcount = gcount;
	}

	public int getTcount() {
		return tcount;
	}

	public void setTcount(int tcount) {
		this.tcount = tcount;
	}

	public int getNcount() {
		return ncount;
	}

	public void setNcount(int ncount) {
		this.ncount = ncount;
	}

	public int getIndelcount() {
		return indelcount;
	}

	public void setIndelcount(int indelcount) {
		this.indelcount = indelcount;
	}

	public int getIdentifier() {
		return identifier;
	}

	public void setIdentifier(int identifier) {
		this.identifier = identifier;
	}

	public String getGenomdereference() {
		return genomdereference;
	}

	public void setGenomdereference(String genomdereference) {
		this.genomdereference = genomdereference;
	}
	
}
