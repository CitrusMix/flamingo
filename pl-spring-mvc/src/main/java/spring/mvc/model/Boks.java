package spring.mvc.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Boks {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@OneToMany(mappedBy="psy")
	private List<Pies> listaPsow;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Pies> getListaPsow() {
		return listaPsow;
	}

	public void setListaPsow(List<Pies> listaPsow) {
		this.listaPsow = listaPsow;
	}
	
	

}
