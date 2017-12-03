package model;

import java.util.Date;

public class Fornecedor extends Pessoa {
	private static final long serialVersionUID = 1L;
	
	//Atributos
	private String cnpj;
	private String nomeContato;

	/**
	 * @param cnpj
	 * @param nomeContato
	 * @param codigo
	 * @param nome
	 * @param telefones
	 * @param email
	 * @param dataCad
	 */


	public String getCnpj() {
		return cnpj;
	}

	/**
	 * @return the cnpj
	 */

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	/**
	 * @param cnpj the cnpj to set
	 */

	public String getNomeContato() {
		return nomeContato;
	}

	/**
	 * @return the nomeContato
	 */

	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}

	/**
	 * @param nomeContato the nomeContato to set
	 */


	public Fornecedor(int codigo, String nome, String telefones, String email, Date dataCad) {
		super(codigo, nome, telefones, email, dataCad);
	}

	public Fornecedor(int codigo, String nome, String telefones, String email, Date dataCad, String cnpj,
			String nomeContato) {
		super(codigo, nome, telefones, email, dataCad);
		this.cnpj = cnpj;
		this.nomeContato = nomeContato;
	}


	@Override
	public String toString() {
		return "Fornecedor:"
				+ "\nCNPJ: " + cnpj 
				+ "Nome do Contato: " + nomeContato 
				+ "Código: " + getCodigo() 
				+ "Nome: " + getNome()
				+ "Telefones:" + getTelefones() 
				+ "E-mail: " + getEmail() 
				+ "Data do Cadastro: " + getDataCad();
	}

	public int getTipoPessoa(){
		return Pessoa.FORN;
	}

}
