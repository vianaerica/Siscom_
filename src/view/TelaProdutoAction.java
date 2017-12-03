package view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import controller.Comercial;
import model.Produto;

import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaProdutoAction extends JFrame {
	public TelaProdutoAction() {
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\_Faculdade\\LTPIII\\WorkspaceJava\\Siscom_\\Icones\\icons8-Produto-50.png"));
		setTitle("Jokenpo - Produto");
		setSize(new Dimension(444, 301));
		setLocationRelativeTo(null);

		JMenuBar menuBarProduto = new JMenuBar();
		menuBarProduto.setBounds(0, 0, 428, 21);
		menuBarProduto.setBackground(Color.WHITE);
		getContentPane().add(menuBarProduto);

		JMenu mnPessoa = new JMenu("Pessoa");
		menuBarProduto.add(mnPessoa);

		JMenuItem mntmCliente = new JMenuItem("Cliente");
		mntmCliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaClientesAction tca = new TelaClientesAction();
				tca.mostraTela();
				fechaTelaPrd();
			}
		});
		mnPessoa.add(mntmCliente);

		JMenuItem mntmFornecedor = new JMenuItem("Fornecedor");
		mntmFornecedor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaFornecedorAction tfa = new TelaFornecedorAction();
				tfa.mostraEssaTela();
				fechaTelaPrd();
			}
		});
		mnPessoa.add(mntmFornecedor);

		JMenuItem mntmVendedor = new JMenuItem("Vendedor");
		mntmVendedor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaVendedorAction tva = new TelaVendedorAction();
				tva.mostraEssaTela();
				fechaTelaPrd();
			}
		});
		mnPessoa.add(mntmVendedor);

		JMenu mnProduto = new JMenu("Produto");
		mnProduto.setEnabled(false);
		menuBarProduto.add(mnProduto);

		JMenu mnCompra = new JMenu("Compra");
		menuBarProduto.add(mnCompra);

		JMenuItem mntmCompra = new JMenuItem("Compra");
		mntmCompra.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaCompraAction compra = new TelaCompraAction();
				compra.mostraEssaTela();
				fechaTelaPrd();
			}
		});
		mnCompra.add(mntmCompra);

		JMenuItem mntmItCompra = new JMenuItem("Item da Compra");
		mntmItCompra.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaItCompraAction itcompra = new TelaItCompraAction();
				itcompra.mostraEssaTela();
				fechaTelaPrd();
			}
		});
		mnCompra.add(mntmItCompra);

		JMenu mnVenda = new JMenu("Venda");
		menuBarProduto.add(mnVenda);

		JMenuItem mntmVenda = new JMenuItem("Venda");
		mntmVenda.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				TelaVendaAction tva = new TelaVendaAction();
				tva.mostraEssaTela();
				fechaTelaPrd();
			}
		});
		mnVenda.add(mntmVenda);

		JMenuItem mntmItVenda = new JMenuItem("Item da Venda");
		mntmItVenda.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaItVendaAction itvenda = new TelaItVendaAction();
				itvenda.mostraEssaTela();
				fechaTelaPrd();
			}
		});
		mnVenda.add(mntmItVenda);

		JMenu mnEstatisticas = new JMenu("Estat\u00EDsticas");
		mnEstatisticas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaEstatisticaAction tea = new TelaEstatisticaAction();
				tea.mostraEssaTela();
				fechaTelaPrd();
			}
		});
		menuBarProduto.add(mnEstatisticas);

		JMenu mnSair = new JMenu("Sair");
		mnSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		menuBarProduto.add(mnSair);

		JButton btnAdd = new JButton("");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Comercial com = new Comercial();
				Date data = new Date();
				try {
					com.inserirNovoProduto(new Produto(com.gerarCodProdutoSequencial(), txtNomeCad.getText(), Double.parseDouble(txtPrecoUni.getText()), Integer.parseInt(txtEstoque.getText()), Integer.parseInt(txtEstoqueMinimo.getText()),data));
				} catch (Exception e) {
					e.getMessage();
				}
			}
		});
		btnAdd.setIcon(new ImageIcon("D:\\_Faculdade\\LTPIII\\WorkspaceJava\\Siscom_\\Icones\\icons8-Mais-26.png"));
		btnAdd.setToolTipText("Cadastrar");
		btnAdd.setBackground(Color.WHITE);
		btnAdd.setBounds(5, 45, 30, 27);
		getContentPane().add(btnAdd);

		JButton btnDelete = new JButton("");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Comercial com = new Comercial();
				try {
					com.excluirProdutoPeloCodigo(Integer.parseInt(txtCodDel.getText()));
				} catch (Exception e1) {
					e1.getMessage();
				}
			}
		});
		btnDelete.setIcon(new ImageIcon("D:\\_Faculdade\\LTPIII\\WorkspaceJava\\Siscom_\\Icones\\icons8-Apagar Arquivo-24.png"));
		btnDelete.setToolTipText("Excluir");
		btnDelete.setBackground(Color.WHITE);
		btnDelete.setBounds(5, 71, 30, 27);
		getContentPane().add(btnDelete);

		JButton btnSearch = new JButton("");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Comercial com = new Comercial();
				try {
					com.pesquisarProdutoPorCodigo(Integer.parseInt(txtCodSearch.getText()));
				} catch (Exception e1) {
					e1.getMessage();
				}
			}
		});
		btnSearch.setIcon(new ImageIcon("D:\\_Faculdade\\LTPIII\\WorkspaceJava\\Siscom_\\Icones\\icons8-Pesquisa Google na Web-24.png"));
		btnSearch.setToolTipText("Pesquisar");
		btnSearch.setBackground(Color.WHITE);
		btnSearch.setBounds(5, 97, 30, 27);
		getContentPane().add(btnSearch);

		JButton btnList = new JButton("");
		btnList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Comercial com = new Comercial();
				try {
					com.listarProdutosEmOrdemAlfabetica();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnList.setIcon(new ImageIcon("D:\\_Faculdade\\LTPIII\\WorkspaceJava\\Siscom_\\Icones\\icons8-Lista-24.png"));
		btnList.setToolTipText("Listar");
		btnList.setBackground(Color.WHITE);
		btnList.setBounds(5, 123, 30, 27);
		getContentPane().add(btnList);

		JLabel lblAcoes = new JLabel("A\u00E7\u00F5es");
		lblAcoes.setBackground(Color.WHITE);
		lblAcoes.setBounds(5, 28, 46, 14);
		getContentPane().add(lblAcoes);

		JTabbedPane tabbedPaneVendedor = new JTabbedPane(JTabbedPane.TOP);
		tabbedPaneVendedor.setBorder(null);
		tabbedPaneVendedor.setBackground(Color.WHITE);
		tabbedPaneVendedor.setBounds(50, 22, 368, 230);
		getContentPane().add(tabbedPaneVendedor);

		JPanel panelCadastrar = new JPanel();
		panelCadastrar.setLayout(null);
		panelCadastrar.setToolTipText("Cadastrar");
		panelCadastrar.setBackground(SystemColor.menu);
		tabbedPaneVendedor.addTab("Cadastrar", null, panelCadastrar, null);

		JLabel lblCodCad = new JLabel("C\u00F3digo: ");
		lblCodCad.setBounds(10, 11, 46, 14);
		panelCadastrar.add(lblCodCad);

		JLabel lblNomeCad = new JLabel("Nome: ");
		lblNomeCad.setBounds(10, 36, 76, 14);
		panelCadastrar.add(lblNomeCad);

		JLabel lblEstoqueCad = new JLabel("Estoque:");
		lblEstoqueCad.setBounds(10, 96, 84, 14);
		panelCadastrar.add(lblEstoqueCad);

		JLabel lblEstoqueMinimo = new JLabel("Estoque M\u00EDnimo:");
		lblEstoqueMinimo.setBounds(10, 125, 106, 14);
		panelCadastrar.add(lblEstoqueMinimo);

		JLabel lblDataCadCad = new JLabel("Data do Cadastro: ");
		lblDataCadCad.setBounds(10, 155, 106, 14);
		panelCadastrar.add(lblDataCadCad);

		txtCodCad = new JTextField();
		txtCodCad.setEditable(false);
		txtCodCad.setColumns(10);
		txtCodCad.setBounds(158, 5, 86, 20);
		panelCadastrar.add(txtCodCad);

		txtEstoque = new JTextField();
		txtEstoque.setToolTipText("(00) 00000-0000");
		txtEstoque.setColumns(10);
		txtEstoque.setBounds(158, 93, 86, 20);
		panelCadastrar.add(txtEstoque);

		txtEstoqueMinimo = new JTextField();
		txtEstoqueMinimo.setColumns(10);
		txtEstoqueMinimo.setBounds(158, 122, 86, 20);
		panelCadastrar.add(txtEstoqueMinimo);

		txtDtCadCad = new JTextField();
		txtDtCadCad.setToolTipText("dd/MM/aaaa");
		txtDtCadCad.setColumns(10);
		txtDtCadCad.setBounds(158, 152, 86, 20);
		panelCadastrar.add(txtDtCadCad);

		txtNomeCad = new JTextField();
		txtNomeCad.setColumns(10);
		txtNomeCad.setBounds(104, 33, 140, 20);
		panelCadastrar.add(txtNomeCad);

		JLabel lblPrecoUni = new JLabel("Pre\u00E7o Unit\u00E1rio:");
		lblPrecoUni.setBounds(10, 67, 106, 14);
		panelCadastrar.add(lblPrecoUni);

		txtPrecoUni = new JTextField();
		txtPrecoUni.setToolTipText("R$ 00,00");
		txtPrecoUni.setColumns(10);
		txtPrecoUni.setBounds(158, 64, 86, 20);
		panelCadastrar.add(txtPrecoUni);

		JPanel panelExcluir = new JPanel();
		panelExcluir.setLayout(null);
		panelExcluir.setToolTipText("Excluir");
		panelExcluir.setBackground(SystemColor.menu);
		tabbedPaneVendedor.addTab("Excluir", null, panelExcluir, null);

		tableDelPrd = new JTable();
		tableDelPrd.setBounds(354, 191, -345, -146);
		panelExcluir.add(tableDelPrd);

		txtCodDel = new JTextField();
		txtCodDel.setColumns(10);
		txtCodDel.setBounds(55, 11, 125, 20);
		panelExcluir.add(txtCodDel);

		JLabel lblCodDel = new JLabel("C\u00F3digo:");
		lblCodDel.setBounds(10, 14, 46, 14);
		panelExcluir.add(lblCodDel);

		JPanel panelPesquisar = new JPanel();
		panelPesquisar.setLayout(null);
		panelPesquisar.setToolTipText("Pesquisar");
		panelPesquisar.setBackground(SystemColor.menu);
		tabbedPaneVendedor.addTab("Pesquisar", null, panelPesquisar, null);

		txtCodSearch = new JTextField();
		txtCodSearch.setColumns(10);
		txtCodSearch.setBounds(55, 11, 125, 20);
		panelPesquisar.add(txtCodSearch);

		JLabel lblCodSearch = new JLabel("C\u00F3digo: ");
		lblCodSearch.setBounds(10, 14, 46, 14);
		panelPesquisar.add(lblCodSearch);

		tableSearch = new JTable();
		tableSearch.setBounds(10, 187, 343, -142);
		panelPesquisar.add(tableSearch);

		JPanel panelList = new JPanel();
		tabbedPaneVendedor.addTab("Listar", null, panelList, null);
		panelList.setLayout(null);

		tableListPrd = new JTable();
		tableListPrd.setBounds(356, 190, -345, -178);
		panelList.add(tableListPrd);
	}

	private JTextField txtCodCad;
	private JTextField txtEstoque;
	private JTextField txtEstoqueMinimo;
	private JTextField txtDtCadCad;
	private JTextField txtNomeCad;
	private JTextField txtPrecoUni;
	private JTable tableDelPrd;
	private JTextField txtCodDel;
	private JTextField txtCodSearch;
	private JTable tableSearch;
	private JTable tableListPrd;


	public void mostraEssaTela(){
		setVisible(true);
	}
	public void fechaTelaPrd(){
		this.dispose();
	}

	private static final long serialVersionUID = 1L;

}
