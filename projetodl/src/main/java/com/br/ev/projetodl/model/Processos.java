package com.br.ev.projetodl.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Processos")
public class Processos{
	@Id
	private int id;
	@Column
	private String numeroPub;
	@Column
	private String numeroPedido;
	@Column
	private String dataPub;
	@Column
	private String requerentes;
	@Column
	private String titulo;
	@Column
	private String numProcesso;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumeroPub() {
		return numeroPub;
	}
	public void setNumeroPub(String numeroPub) {
		this.numeroPub = numeroPub;
	}
	public String getNumeroPedido() {
		return numeroPedido;
	}
	public void setNumeroPedido(String numeroPedido) {
		this.numeroPedido = numeroPedido;
	}
	public String getDataPub() {
		return dataPub;
	}
	public void setDataPub(String dataPub) {
		this.dataPub = dataPub;
	}
	public String getRequerentes() {
		return requerentes;
	}
	public void setRequerentes(String requerentes) {
		this.requerentes = requerentes;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getNumProcesso() {
		return numProcesso;
	}
	public void setNumProcesso(String numProcesso) {
		this.numProcesso = numProcesso;
	}
	@Override
	public String toString() {
		return "Processos [id=" + id + ", numeroPub=" + numeroPub + ", numeroPedido=" + numeroPedido + ", dataPub="
				+ dataPub + ", requerentes=" + requerentes + ", titulo=" + titulo + ", numProcesso=" + numProcesso
				+ "]";
	}
}

