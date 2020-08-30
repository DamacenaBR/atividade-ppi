package br.edu.fafic.domian;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Time implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nome;
	
	@OneToMany(cascade = CascadeType.MERGE)
	private List<Jogador> jogadores;
	
	@OneToOne
	private Tecnico tecnico;
	
	@ManyToMany
	private List<Campeonato> campeonatos;
	
	public Time() {

	}

	public Time(String nome, List<Jogador> jogadores, Tecnico tecnico, List<Campeonato> campeonatos) {
		this.nome = nome;
		this.jogadores = jogadores;
		this.tecnico = tecnico;
		this.campeonatos = campeonatos;
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

	public List<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(List<Jogador> jogadores) {
		this.jogadores = jogadores;
	}

	public Tecnico getTecnico() {
		return tecnico;
	}

	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}

	public List<Campeonato> getCampeonatos() {
		return campeonatos;
	}

	public void setCampeonatos(List<Campeonato> campeonatos) {
		this.campeonatos = campeonatos;
	}

	@Override
	public String toString() {
		return "Time [id=" + id + ", nome=" + nome + ", jogadores=" + jogadores + ", tecnico=" + tecnico
				+ ", campeonatos=" + campeonatos + "]";
	}
}
