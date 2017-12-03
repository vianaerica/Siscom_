package model;

import java.util.Date;
import java.io.Serializable;

public class Produto implements Comparable<Produto>, Serializable{
	private static final long serialVersionUID = 1L;

	//Atributos
	private int codigo;
	private String nome;
	private double precoUnitario;
	private int estoque;
	private int estoqueMinimo;
	private Date dataCad;

	/**
	 * @param codigo
	 * @param nome
	 * @param precoUnitario
	 * @param estoque
	 * @param estoqueMinimo
	 * @param dataCad
	 */

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

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	/**
	 * @return the precoUnitario
	 */

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	/**
	 * @param precoUnitariothe precoUnitario to set
	 */

	public int getEstoque() {
		return estoque;
	}

	/**
	 * @return the estoque
	 */

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	/**
	 * @param estoque the estoque to set
	 */

	public int getEstoqueMinimo() {
		return estoqueMinimo;
	}

	/**
	 * @return the estoqueMinimo
	 */

	public void setEstoqueMinimo(int estoqueMinimo) {
		this.estoqueMinimo = estoqueMinimo;
	}

	/**
	 * @param estoqueMinimo the estoqueMinimo to set
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

	public Produto(int codigo, String nome, double precoUnitario, int estoque, int estoqueMinimo,
			Date dataCad) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.precoUnitario = precoUnitario;
		this.estoque = estoque;
		this.estoqueMinimo = estoqueMinimo;
		this.dataCad = dataCad;
	}

	public Produto(){
		super();
	}

	@Override
	public String toString() {
		return "Produto: "
				+ "\nCódigo: " + codigo 
				+ "\nNome: " + nome 
				+ "\nPreço Unitário: " + precoUnitario 
				+ "\nEstoque: " + estoque 
				+ "\nEstoque Minimo: " + estoqueMinimo 
				+ "\nData de Cadastro: " + dataCad;
	}

	public void adicionaQuantidadeDeProdutoNoEstoque(int quantidadeAddProduto){
		estoque = 0;
		estoque = quantidadeAddProduto;
	}

	public void decrementaQuantidadeDeProdutoNoEstoque(int quantidadeDecrementaProduto){
		try{
			estoque = estoque - quantidadeDecrementaProduto;
		}catch (Exception e){
			SisComException sisEx = new SisComException(nome, estoque, "Estoque Insuficiente.");
		}
	}

	public int compareTo(Produto produto){
		return this.nome.compareTo(produto.getNome());
	}

}
