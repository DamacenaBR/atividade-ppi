package br.edu.fafic.domian;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Campeonato implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "nome", nullable = false, length = 50)
	private String nome;
	
	@ManyToMany(mappedBy = "campeonatos")
	private List<Time> timesCampeonato;
	
	@Temporal(TemporalType.DATE)
	private Date dataInicio;
	
	@Temporal(TemporalType.DATE)
	private Date dataFim;
	
	public Campeonato() {

	}

	public Campeonato(String nome, List<Time> timesCampeonato, Date dataInicio, Date dataFim) {
		this.nome = nome;
		this.timesCampeonato = timesCampeonato;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}

	public long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Time> getTimesCampeonato() {
		return timesCampeonato;
	}

	public void setTimesCampeonato(List<Time> timesCampeonato) {
		this.timesCampeonato = timesCampeonato;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	@Override
	public String toString() {
		return "Campeonato [id=" + id + ", nome=" + nome + ", timesCampeonato=" + timesCampeonato + ", dataInicio="
				+ dataInicio + ", dataFim=" + dataFim + "]";
	}

}
