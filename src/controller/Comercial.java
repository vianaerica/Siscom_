package controller;

import java.util.ArrayList;
import model.Pessoa;
import model.Cliente;
import model.Fornecedor;
import model.Vendedor;
import model.Produto;
import model.Compra;
import model.Venda;
import model.ItemCompra;
import model.ItemVenda;
import model.SisComException;
import java.util.*;


public class Comercial {

	private ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	private ArrayList<Compra> listaCompras = new ArrayList<Compra>();
	private ArrayList<Venda> listaVendas = new ArrayList<Venda>();

	//GET's dos atributos desta classe
	public ArrayList<Pessoa> getListaPessoas() {
		return listaPessoas;
	}

	public ArrayList<Venda> getListaVendas() {
		return listaVendas;
	}

	public ArrayList<Produto> getListaProdutos() {
		return listaProdutos;
	}

	public ArrayList<Compra> getListaCompras() {
		return listaCompras;
	}

	//GERADOR DE CÓDIGOS SEQUENCIAIS
	public int gerarNumCompraSequencial(){
		return getListaCompras().isEmpty() ? 1 : getListaCompras().size() + 1;
	}

	public int gerarCodProdutoSequencial(){
		return getListaProdutos().isEmpty() ? 1 : getListaProdutos().size() + 1;
	}

	public int gerarNumVendaSequencial(){
		return getListaVendas().isEmpty() ? 1 : getListaVendas().size() + 1;
	}

	public int gerarCodPessoaSequencial(){
		return getListaPessoas().isEmpty() ? 1 : getListaPessoas().size() + 1;
	}
	
	//CADASTROS ~ INSERÇÕES
	public void inserirNovaPessoa(Pessoa pessoa) throws Exception {
		if (pessoa.getTipoPessoa() == 2){
			Fornecedor forn = (Fornecedor) pessoa;
			for (Pessoa pessoa1 : listaPessoas) {
				if (pessoa1.getTipoPessoa() == 2) {
					Fornecedor aux = (Fornecedor) pessoa1;
					if (forn.getCnpj().equals(aux.getCnpj()))
						throw new Exception("O CNPJ informado já está cadastrado.");
				} else{
					boolean adicionar = getListaPessoas().add(pessoa);
				}
			}
		}
		else if (pessoa.getTipoPessoa() == 1){
			Vendedor vend = (Vendedor) pessoa;
			for (Pessoa pessoa1 : listaPessoas) {
				if (pessoa1.getTipoPessoa() == 1) {
					Vendedor aux = (Vendedor) pessoa1;
					if (vend.getCpf().equals(aux.getCpf()) && vend.getMetaMensal() <= 0)
						throw new Exception("O CPF informado já está cadastrado.");
				}
				else{
					boolean adicionar = getListaPessoas().add(pessoa);
				}
			}
		}
		else if (pessoa.getTipoPessoa() == 0){
			Cliente cliente = (Cliente) pessoa;
			for (Pessoa pessoa1 : listaPessoas) {
				if (pessoa1.getTipoPessoa() == 0) {
					Cliente aux = (Cliente) pessoa1;
					if (cliente.getCpf().equals(aux.getCpf()))
						throw new Exception("O CPF informado já está cadastrado.");
				}
				else{
					boolean adicionar = getListaPessoas().add(pessoa);
				}
			}
		}
		else{
			boolean adicionar = getListaPessoas().add(pessoa);
			if (!adicionar) {
				throw new Exception("Falha ao tentar inserir nova pessoa.");
			}
		}
	}

	public void inserirNovoProduto(Produto produto) throws Exception {
		produto.setCodigo(gerarCodProdutoSequencial());
		boolean adicionar = getListaProdutos().add(produto);
		for (Produto prd : listaProdutos){
			if(prd.getNome().equals(produto)){
				throw new Exception("Produto já cadastrado. Tente novamente.");
			}
		}
		if(adicionar == true){
			throw new Exception("Produto cadastrado com sucesso.");
		}
		else{
			throw new Exception("Falha ao cadastrar produto. Tente novamente.");
		}
	}

	public void inserirNovaVenda(Cliente cliente, Vendedor vendedor, int formaPagto, ArrayList<ItemVenda> itens) throws Exception {
		//inclui itens na lista de itens de venda
		for (ItemVenda itemVenda : itens) {
			int qtd = 0;
			for (ItemVenda item : itens) {
				if (item.getProduto().getCodigo() == itemVenda.getProduto().getCodigo()) {
					qtd++;
				}
			}
			//valida se tem itens duplicados
			if (qtd > 1) {
				throw new Exception("A venda possui produtos duplicados.");
			}
		}
		//verifica forma de pgto e se passar do limite de credito exibe erro
		if (formaPagto == 2) {
			double total = 0;

			for (ItemVenda itemVenda : itens) {
				total = total + itemVenda.getValorVenda();
			}

			if (total > cliente.getLimiteCredito()) {
				throw new SisComException("O cliente não possui limite de crédito suficiente. Escolha outra opção de pagamento.");
			}
		}

		//gera o número da venda ~ autoincrement sequencial
		Venda venda = new Venda();
		int numVenda;
		numVenda = gerarNumVendaSequencial();

		venda = new Venda(numVenda, cliente, vendedor, itens, formaPagto, new Date());
		//pega quantidade de prds vendidos e decrementa do estoque
		for (ItemVenda itemVenda : itens) {
			itemVenda.getProduto().decrementaQuantidadeDeProdutoNoEstoque(itemVenda.getQuantVenda());
		}
		boolean adicionar = getListaVendas().add(venda);
	}

	public void inserirNovaCompra(Fornecedor fornecedor, ArrayList<ItemCompra> itens) throws Exception {
		//inclui itens na lista de compra
		for (ItemCompra itemCompra : itens) {
			int qtd = 0;

			for (ItemCompra item : itens) {
				if (item.getProduto().getCodigo() == itemCompra.getProduto().getCodigo()) {
					qtd++;
				}
			}
			//valida se tem itens duplicados 
			if (qtd > 1) {
				throw new SisComException("A compra possui produtos duplicados.");
			}
		}

		Compra compra = new Compra();
		int numCompra;
		numCompra = gerarNumCompraSequencial();

		compra = new Compra(fornecedor, itens, numCompra, new Date());

		//adicionar quantidade comprada no estoque
		for (ItemCompra itemCompra : itens) {
			itemCompra.getProduto().adicionaQuantidadeDeProdutoNoEstoque(itemCompra.getQuantCompra());
		}
		boolean adicionar = getListaCompras().add(compra);
	}

	//BUSCAS ~ PESQUISAS
	public Cliente pesquisarClientesPorCpf(String cpf) throws Exception{
		for (Pessoa pessoa1 : listaPessoas) {
			if (pessoa1.getTipoPessoa() == 0) {
				Cliente cliente = (Cliente) pessoa1;
				if (cliente.getCpf().equals(cpf)) {
					return cliente;
				}
				else{ 
					throw new Exception("Não foi encontrado cliente com o CPF informado.");
				}
			}
		}
		return null;
	}

	public Fornecedor pesquisarFornecedorPorCnpj(String cnpj) throws Exception{
		for (Pessoa pessoa : listaPessoas) {
			if (pessoa.getTipoPessoa() == 2) {
				Fornecedor fornecedor = (Fornecedor) pessoa;
				if (fornecedor.getCnpj().equals(cnpj)) {
					return fornecedor;
				}
				else{ 
					throw new Exception("Não foi encontrado fornecedor com o CNPJ informado.");
				}
			}
		}
		return null;
	}

	public Vendedor pesquisarVendedorPorCpf(String cpf) throws Exception{
		for (Pessoa pessoa : listaPessoas) {
			if (pessoa.getTipoPessoa() == 1) {
				Vendedor vendedor = (Vendedor) pessoa;
				if (vendedor.getCpf().equals(cpf)) {
					return vendedor;
				}
				else{ 
					throw new Exception("Não foi encontrado vendedor com o CPF informado.");
				}
			}
		}
		return null;
	}

	public Produto pesquisarProdutoPorCodigo(int codigo) throws Exception{
		for (Produto produto : listaProdutos) {
			if (produto.getCodigo() == codigo) {
				return produto;
			}
			else{ 
				throw new Exception("Não foi encontrado produto com o código informado.");
			}
		}
		return null;
	}

	public Venda pesquisarVendaPeloNumVenda(int numVenda) throws Exception{
		for (Venda venda : listaVendas) {
			if (venda.getNumVenda() == numVenda) {
				return venda;
			}
			else{ 
				throw new Exception("Não foi encontrada venda com o número informado.");
			}
		}
		return null;
	}

	public Compra pesquisarCompraPeloNumCompra(int numCompra) throws Exception{
		for (Compra compra : listaCompras) {
			if (compra.getNumCompra() == numCompra) {
				return compra;
			}
			else{ 
				throw new Exception("Não foi encontrada compra com o número informado.");
			}
		}
		return null;
	}

	//DELETAR ~ EXCLUSÕES
	public void excluirCompraPeloNumCompra(int numCompra) throws Exception{
		//pesquisa e pega o num da compra informado
		Compra compra = pesquisarCompraPeloNumCompra(numCompra);
		//verifica se existe compra com o parametro informado
		if (compra == null) {
			throw new Exception("Não foi encontrada compra com o número informado.");
		}
		else{ //se existir deleta e decrementa do estoque
			for (ItemCompra item : compra.getCompraItens()) {
				item.getProduto().decrementaQuantidadeDeProdutoNoEstoque(item.getQuantCompra());
			}
			boolean remove = getListaCompras().remove(compra);
			if (!remove) {
				throw new Exception("Erro ao excluir compra. Tente novamente.");
			}
		}
	}

	public void excluirVendaPeloNumVenda(int numVenda) throws Exception{
		Venda venda = pesquisarVendaPeloNumVenda(numVenda);
		if (venda == null) {
			throw new Exception("Não foi encontrada venda com o número informado.");
		}
		else{ 
			for (ItemVenda item : venda.getVendaItens()) {
				item.getProduto().adicionaQuantidadeDeProdutoNoEstoque(item.getQuantVenda());
			}
			boolean remove = getListaVendas().remove(venda);
			if (!remove) {
				throw new Exception("Erro ao excluir venda. Tente novamente.");
			}
		}
	}

	public void excluirProdutoPeloCodigo(int codigo) throws Exception{
		Produto produto = pesquisarProdutoPorCodigo(codigo);
		if (produto == null) {
			throw new Exception("Não foi encontrado produto com o código informado.");
		} else{
			for (Compra compra : listaCompras) {
				for (ItemCompra item : compra.getCompraItens()){
					if (item.getProduto().getCodigo() == codigo) {
						throw new Exception("Não é possível excluir este produto. Ele está vinculado a uma COMPRA.");
					}
				}
			}
			for (Venda venda : listaVendas) {
				for (ItemVenda item : venda.getVendaItens()) {
					if (item.getProduto().getCodigo() == codigo) {
						throw new Exception("Não é possível excluir este produto. Ele está vinculado a uma VENDA.");
					}
				}
			}
			boolean remove = getListaProdutos().remove(produto);
			if (!remove) {
				throw new Exception("Erro ao excluir produto. Tente novamente.");
			}
		}
	}

	public void excluirPessoa(Pessoa pessoa) throws Exception{
		if(pessoa.getTipoPessoa() == 0){
			Venda venda = new Venda();
			Cliente cliente = (Cliente) pessoa;
			if (venda.getCliente() == cliente){
				throw new Exception("O cliente está vinculado à uma venda. Não é possível excluir.");
			}
			else{
				for (Pessoa pessoa1 : listaPessoas) {
					if (pessoa1.getTipoPessoa() == 0) {
						Cliente aux = (Cliente) pessoa1;
						if (cliente.getCpf().equals(aux.getCpf())){
							boolean remove = getListaPessoas().remove(pessoa);
							if (!remove) {
								throw new Exception("Erro ao excluir cliente. Tente novamente.");
							}
						}
					}
				}
			}
		}
		else if (pessoa.getTipoPessoa() == 1){
			Venda venda = new Venda();
			Vendedor vendedor = (Vendedor) pessoa;
			if (venda.getVendedor() == vendedor){
				throw new Exception("O vendedor está vinculado à uma venda. Não é possível excluir.");
			}
			else{
				for (Pessoa pessoa1 : listaPessoas) {
					if (pessoa1.getTipoPessoa() == 1) {
						Vendedor aux = (Vendedor) pessoa1;
						if (vendedor.getCpf().equals(aux.getCpf())){
							boolean remove = getListaPessoas().remove(pessoa);
							if (!remove) {
								throw new Exception("Erro ao excluir vendedor. Tente novamente.");
							}
						}
					}
				}
			}
		}
		else if(pessoa.getTipoPessoa() == 2){
			Compra compra = new Compra();
			Fornecedor forn = (Fornecedor) pessoa;
			if(compra.getFornecedor() == forn){
				throw new Exception("O fornecedor está vinculado à uma compra. Não é possível excluir.");
			}
			else{
				for(Pessoa pessoa1 : listaPessoas){
					if (pessoa1.getTipoPessoa() == 2) {
						Fornecedor aux = (Fornecedor) pessoa1;
						if (forn.getCnpj().equals(aux.getCnpj())){
							boolean remove = getListaPessoas().remove(pessoa);
							if (!remove) {
								throw new Exception("Erro ao excluir fornecedor. Tente novamente.");
							}
						}
					}
				}
			}

		}
	}

	//MÉTODOS DE LISTAGEM COM PARÂMETRO
	public ArrayList<Pessoa> listarPessoasEmOrdemAlfabetica() throws Exception{
		Collections.sort(listaPessoas, new Comparator<Pessoa>() {
			@Override
			public int compare(Pessoa o1, Pessoa o2) {
				return o1.getNome().compareTo(o2.getNome());
			}
		});
		return listaPessoas;
	}

	public ArrayList<Produto> listarProdutosEmOrdemAlfabetica() throws Exception{
		Collections.sort(listaProdutos, new Comparator<Produto>() {
			@Override
			public int compare(Produto o1, Produto o2) {
				return o1.getNome().compareTo(o2.getNome());
			}
		});
		return listaProdutos;
	}

	public ArrayList<Produto> listarProdutosForaEstoqueAlfabetica() throws Exception{
		Produto prd = new Produto();
		if(prd.getEstoque() < prd.getEstoqueMinimo()){
			Collections.sort(listaProdutos, new Comparator<Produto>() {
				@Override
				public int compare(Produto o1, Produto o2) {
					return o1.getNome().compareTo(o2.getNome());
				}
			});
		}
		return listaProdutos;
	}

	//MÉTODOS DE ESTATISTICA
	public ArrayList<Venda> listarVendasPorNomeClienteEDataDecrescente(Pessoa pessoa, Venda venda) throws Exception{
		//TODO
		return listaVendas;
	}

	public ArrayList<Venda> listarVendasPorNomeVendedorEDataDecrescente(Pessoa pessoa, Venda venda) throws Exception{
		//TODO
		return listaVendas;
	}

	public ArrayList<Compra> listarComprasPorNomeFornecedorEDataDecrescente(Pessoa pessoa, Compra compra) throws Exception{
		//TODO
		return listaCompras;
	}


} //fim da classe comercial NÃO DELETAR ESTA CHAVES
