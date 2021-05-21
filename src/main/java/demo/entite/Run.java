package demo.entite;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="run")
public class Run implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int  id;
	private String nomrun;
	private Date daterun;

	public Run() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate_run() {
		return daterun;
	}

	public void setDate_run(Date date_run) {
		this.daterun = date_run;
	}

	public String getNomrun() {
		return nomrun;
	}

	public void setNomrun(String nomrun) {
		this.nomrun = nomrun;
	}

	@Override
	public String toString() {
		return "Run [id=" + id + ", nomrun=" + nomrun + ", daterun=" + daterun + "]";
	}
	
}
