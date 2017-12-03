package model;

import java.awt.HeadlessException;
import java.util.Date;
import java.util.ArrayList;
import java.io.Serializable;


public class Compra implements Serializable{
	private static final long serialVersionUID = 1L;
	
	//Atributos
	private Fornecedor fornecedor;
	private ArrayList<ItemCompra> compraItens = new ArrayList<ItemCompra>();
	private int numCompra;
	private Date dataCompra;

	/**
	 * @param numCompra
	 * @param dataCompra
	 * @param forn
	 * @param itCompra
	 * */

	/**
	 * @return the fornecedor
	 */

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	/**
	 * @param fornecedor the fornecedor to set
	 */

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	/**
	 * @return the CompraItens
	 */
	public ArrayList<ItemCompra> getCompraItens() {
		return compraItens;
	}

	/**
	 * @param CompraItens the CompraItens to set
	 */
	public void setCompraItens(ArrayList<ItemCompra> compraItens) {
		this.compraItens = compraItens;
	}

	/**
	 * @return the numCompra
	 */

	public int getNumCompra() {
		return numCompra;
	}

	/**
	 * @param numCompra the numCompra to set
	 */
	public void setNumCompra(int numCompra) {
		this.numCompra = numCompra;
	}


	/**
	 * @return the dataCompra
	 */
	public Date getDataCompra() {
		return dataCompra;
	}

	/**
	 * @param dataCompra the dataCompra to set
	 */
	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}


	public Compra(Fornecedor fornecedor, ArrayList<ItemCompra> compraItens, int numCompra, Date dataCompra)
			throws HeadlessException {
		super();
		this.fornecedor = fornecedor;
		this.compraItens = compraItens;
		this.numCompra = numCompra;
		this.dataCompra = dataCompra;
	}
	
	public Compra(){
		super();
	}

	@Override
	public String toString() {
		return "Compra: "
				+ "\nFornecedor: " + fornecedor 
				+ "\nCompra de Itens: " + compraItens 
				+ "\nNúmero da Compra: " + numCompra
				+ "\nData da Compra: " + dataCompra;
	}
}
