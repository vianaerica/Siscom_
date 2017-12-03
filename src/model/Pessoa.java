package model;

import java.util.Date;
import java.io.Serializable;

public abstract class Pessoa implements Comparable<Pessoa>, Serializable{
	private static final long serialVersionUID = 1L;

	//Atributos
	private int codigo;
	private String nome;
	private String telefones;
	private String email;
	private Date dataCad;

	/**
	 * @param codigo
	 * @param nome
	 * @param telefones
	 * @param email
	 * @param dataCad
	 * 
	 * */

	public static final int CLIENTE = 0;
	public static final int VEND = 1;
	public static final int FORN = 2;

	public abstract int getTipoPessoa();


	public int getCodigo() {
		return codigo;
	}

	/**
	 * @return the codigo
	 */

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */

	public String getNome() {
		return nome;
	}

	/**
	 * @return the nome
	 */

	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @param nome the nome to set
	 */

	public String getTelefones() {
		return telefones;
	}

	/**
	 * @return the telefones
	 */

	public void setTelefones(String telefones) {
		this.telefones = telefones;
	}

	/**
	 * @param telefones the telefones to set
	 */


	public String getEmail() {
		return email;
	}

	/**
	 * @return the email
	 */

	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @param email the email to set
	 */

	public Date getDataCad() {
		return dataCad;
	}

	/**
	 * @return the dataCad
	 */

	public void setDataCad(Date dataCad) {
		this.dataCad = dataCad;
	}

	/**
	 * @param dataCad the dataCad to set
	 */

	public Pessoa(int codigo, String nome, String telefones, String email, Date dataCad) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.telefones = telefones;
		this.email = email;
		this.dataCad = dataCad;
	}

	@Override
	public String toString() {
		return "Pessoa:"
				+ "\nCódigo: " + codigo + 
				"\nNome: " + nome 
				+ "\nTelefones: " + telefones 
				+ "\nE-mail:" + email
				+ "\nData de Cadastro: " + dataCad;
	}

	//Método compareTo ~ interface Comparable (parâmetro Pessoa)
	public int compareTo(Pessoa pessoa){
		return this.nome.compareTo(pessoa.getNome());
	}

}
