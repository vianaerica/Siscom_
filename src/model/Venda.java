package model;

import java.awt.HeadlessException;
import java.util.Date;
import java.util.ArrayList;
import java.io.Serializable;


public class Venda implements Serializable{
	private static final long serialVersionUID = 1L;

	//Atributos
	private int numVenda;
	private Cliente cliente;
	private Vendedor vendedor;
	private ArrayList<ItemVenda> vendaItens = new ArrayList<ItemVenda>();
	private int formaPagto; //(1-Pagto á Vista; 2-Pagto a prazo – cheque pré-datado)
	private Date dataVenda;

	/**
	 * @param numVenda
	 * @param cliente
	 * @param vendedor
	 * @param vendaItens
	 * @param formaPagto
	 * @param dataVenda
	 * */

	/**
	 * @return the numVenda
	 */
	public int getNumVenda() {
		return numVenda;
	}

	/**
	 * @param numVenda the numVenda to set
	 */
	public void setNumVenda(int numVenda) {
		this.numVenda = numVenda;
	}

	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return the vendedor
	 */
	public Vendedor getVendedor() {
		return vendedor;
	}

	/**
	 * @param vendedor the vendedor to set
	 */
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}


	/**
	 * @return the vendaItens
	 */
	public ArrayList<ItemVenda> getVendaItens() {
		return vendaItens;
	}

	/**
	 * @param vendaItens the vendaItens to set
	 */
	public void setVendaItens(ArrayList<ItemVenda> vendaItens) {
		this.vendaItens = vendaItens;
	}

	/**
	 * @return the formaPagto
	 */
	public int getFormaPagto() {
		return formaPagto;
	}

	/**
	 * @param formaPagto the formaPagto to set
	 */
	public void setFormaPagto(int formaPagto) {
		this.formaPagto = formaPagto;
	}

	/**
	 * @return the dataVenda
	 */
	public Date getDataVenda() {
		return dataVenda;
	}

	/**
	 * @param dataVenda the dataVenda to set
	 */
	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}


	public Venda(int numVenda, Cliente cliente, Vendedor vendedor, ArrayList<ItemVenda> vendaItens, int formaPagto,
			Date dataVenda) throws HeadlessException {
		super();
		this.numVenda = numVenda;
		this.cliente = cliente;
		this.vendedor = vendedor;
		this.vendaItens = vendaItens;
		this.formaPagto = formaPagto;
		this.dataVenda = dataVenda;
	}

	public Venda(){
		super();
	}

	@Override
	public String toString() {
		return "Venda: "
				+ "\nNúmero da Venda: " + numVenda 
				+ "\nCliente: " + cliente 
				+ "\nVendedor: " + vendedor 
				+ "\nForma de Pagamento: " + formaPagto 
				+ "\nData da Venda: " + dataVenda;
	}

}
