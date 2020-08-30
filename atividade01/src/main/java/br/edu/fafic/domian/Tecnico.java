package br.edu.fafic.domian;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorColumn(name = "idPessoa")
public class Tecnico extends Pessoa{

	private static final long serialVersionUID = 1L;
	
	@OneToOne(cascade = CascadeType.MERGE)
	private Time timeTecnico;
	
	public Tecnico() {
		
	}

	public Tecnico(Time timeTecnico) {
		super();
		this.timeTecnico = timeTecnico;
	}

	public Time getTimeTecnico() {
		return timeTecnico;
	}

	public void setTimeTecnico(Time timeTecnico) {
		this.timeTecnico = timeTecnico;
	}

	@Override
	public String toString() {
		return "Tecnico [timeTecnico=" + timeTecnico + "]";
	}

}
