package com.itb.tcc.inf2am.newvision.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="clientes")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String cpf;
	private String email;
	private String cep;
	private String numcasa;
	private String complcasa;
	private String senha;
	private String endereco;
	private boolean codStatusCliente;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String getNumcasa() {
		return numcasa;
	}
	public void setNumcasa(String numcasa) {
		this.numcasa = numcasa;
	}
	
	public String getComplcasa() {
		return complcasa;
	}
	public void setComplcasa(String complcasa) {
		this.complcasa = complcasa;
	}
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public boolean isCodStatusCliente() {
		return codStatusCliente;
	}
	public void setCodStatusCliente(boolean codStatusCliente) {
		this.codStatusCliente = codStatusCliente;
	}
	
	
}
