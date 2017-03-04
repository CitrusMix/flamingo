package spring.mvc.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "psy")
public class Pies {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	private String placeOfFind;

	@Temporal(TemporalType.DATE)
	private Date dateOfFind;

	private int age;

	@ManyToOne
	@JoinColumn(name = "boks_id")
	private Boks boks;

	public static DateFormat DATE_FORMATTER = new SimpleDateFormat("dd.MM.yyyy");

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlaceOfFind() {
		return placeOfFind;
	}

	public void setPlaceOfFind(String placeOfFind) {
		this.placeOfFind = placeOfFind;
	}

	public Date getDateOfFind() {
		return dateOfFind;
	}

	public void setDateOfFind(Date dateOfFind) {
		this.dateOfFind = dateOfFind;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Boks getBoks() {
		return boks;
	}

	public void setBoks(Boks boks) {
		this.boks = boks;
	}

}
