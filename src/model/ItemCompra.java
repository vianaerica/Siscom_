package model;

import java.awt.HeadlessException;
import java.io.Serializable;

public class ItemCompra implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	//Atributos
	private Produto produto;
	private int quantCompra;
	private double valorCompra;

	/**
	 * @param produto
	 * @param quantCompra
	 * @param valorCompra
	 */


	/**
	 * @return the produtp
	 */

	public Produto getProduto() {
		return produto;
	}

	/**
	 * @param produto the produto to set
	 */
	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	/**
	 * @return the quantCompra
	 */
	public int getQuantCompra() {
		return quantCompra;
	}

	/**
	 * @param quantCompra the quantCompra to set
	 */
	public void setQuantCompra(int quantCompra) {
		this.quantCompra = quantCompra;
	}

	/**
	 * @return the valorCompra
	 */
	public double getValorCompra() {
		return valorCompra;
	}

	/**
	 * @param valorCompra the valorCompra to set
	 */
	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}

	public ItemCompra(Produto produto, int quantCompra, double valorCompra) throws HeadlessException {
		super();
		this.produto = produto;
		this.quantCompra = quantCompra;
		this.valorCompra = valorCompra;
	}

	@Override
	public String toString() {
		return "Item de Compra: "
				+ "\nQuantidade de Compra: " + quantCompra 
				+ ",\nValor da Compra: " + valorCompra
				+ "\nProduto: " + produto;
	}


}
