package model;

import java.util.Date;

public class Cliente extends Pessoa {
	private static final long serialVersionUID = 1L;
	
	//Atributos
	private String cpf;
	private double limiteCredito;

	/**
	 * @param cpf
	 * @param limiteCredito
	 * @param codigo
	 * @param nome
	 * @param telefones
	 * @param email
	 * @param dataCad
	 */

	public String getCpf() {
		return cpf;
	}

	/**
	 * @return the cpf
	 */

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * @param cpf the cpf to set
	 */
	
	public double getLimiteCredito() {
		return limiteCredito;
	}

	/**
	 * @return the limiteCredito
	 */
	
	public void setLimiteCredito(double limiteCredito){
		this.limiteCredito = limiteCredito;
	}

	/**
	 * @param limiteCredito the limiteCredito to set
	 */

	public Cliente(int codigo, String nome, String telefones, String email, Date dataCad) {
		super(codigo, nome, telefones, email, dataCad);
	}

	public Cliente(int codigo, String nome, String telefones, String email, Date dataCad, String cpf,
			double limteCredito) {
		super(codigo, nome, telefones, email, dataCad);
		this.cpf = cpf;
		this.limiteCredito = limteCredito;
	}

	@Override
	public String toString() {
		return "Cliente:"
				+ "\nCPF: " + cpf
				+ "\nLimite de Crédito: " + limiteCredito 
				+ "\nCódigo: " + getCodigo() 
				+ "\nNome: " + getNome() 
				+ "\nTelefones: " + getTelefones() 
				+ "\nE-mail: " + getEmail() 
				+ "\nData do Cadastro: " + getDataCad();
	}

	public int getTipoPessoa(){
		return Pessoa.CLIENTE;
	}

}
