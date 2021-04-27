package demo.entite;

import java.io.Serializable;

import javax.persistence.Entity;
@Entity

public class Dto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nomech;
	private String chr	;
	private int pos	;
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
	public String  getRef_base() {
		return refbase;
	}
	public void setRef_base(String ref_base) {
		this.refbase = ref_base;
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
	public String getNomech() {
		return nomech;
	}
	public void setNomech(String nomech) {
		this.nomech = nomech;
	}
	
}
