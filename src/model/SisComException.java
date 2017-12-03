package model;

public class SisComException extends Exception{
	private static final long serialVersionUID = 1L;
	
	//Atributos
	private String nomeProduto;
	private int estoque;
	private String mensagemErro;

	/**
	 * @param nomeProduto
	 * @param estoque
	 * @param mensagemErro;
	 */

	public String getNomeProduto() {
		return nomeProduto;
	}
	/**
	 * @return the nomeProduto
	 */

	public int getEstoque() {
		return estoque;
	}
	/**
	 * @return the estoque
	 */

	public String getMensagemErro() {
		return mensagemErro;
	}
	/**
	 * @return the mensagemErro
	 */

	public SisComException(String nomeProduto, int estoque, String mensagemErro) {
		super();
		this.nomeProduto = nomeProduto;
		this.estoque = estoque;
		this.mensagemErro = mensagemErro;
	}

	public SisComException(String mensagemErro) {
		super();
		this.mensagemErro = mensagemErro;
	}
	
}
