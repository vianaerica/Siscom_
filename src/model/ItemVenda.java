package model;

import java.awt.HeadlessException;
import java.io.Serializable;


public class ItemVenda implements Serializable{
	private static final long serialVersionUID = 1L;
	
	//Atributos
	private Produto produto;
	private int quantVenda;
	private double valorVenda;

	/**
	 * @param produto
	 * @param quantVenda
	 * @param valorVenda
	 */

	/**
	 * @return the produto
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
	 * @return the quantVenda
	 */
	public int getQuantVenda() {
		return quantVenda;
	}

	/**
	 * @param quantVenda the quantVenda to set
	 */
	public void setQuantVenda(int quantVenda) {
		this.quantVenda = quantVenda;
	}

	/**
	 * @return the valorVenda
	 */
	public double getValorVenda() {
		return valorVenda;
	}

	/**
	 * @param valorVenda the valorVenda to set
	 */
	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}


	@Override
	public String toString() {
		return "Item de Venda:"
				+ "\nProduto: " + produto 
				+ "\nQuantidade de Venda: " + quantVenda 
				+ "\nValor de Venda: " + valorVenda;
	}

	public ItemVenda(Produto produto, int quantVenda, double valorVenda) throws HeadlessException {
		super();
		this.produto = produto;
		this.quantVenda = quantVenda;
		this.valorVenda = valorVenda;
	}

}
