package br.edu.fafic.domian;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

import br.edu.fafic.enums.Status;

@Entity
@DiscriminatorColumn(name = "idPessoa")
public class Jogador extends Pessoa{
	
	private static final long serialVersionUID = 1L;
	
	@Enumerated(EnumType.ORDINAL)
	private Status status;	
	
	private String posicao;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	private Time jagarTime;
	
	public Jogador() {

	}

	public Jogador(Status status, String posicao, Time jagarTime) {
		super();
		this.status = status;
		this.posicao = posicao;
		this.jagarTime = jagarTime;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public Time getJagarTime() {
		return jagarTime;
	}

	public void setJagarTime(Time jagarTime) {
		this.jagarTime = jagarTime;
	}

	@Override
	public String toString() {
		return "Jogador [status=" + status + ", posicao=" + posicao + ", jagarTime=" + jagarTime + "]";
	}

}
