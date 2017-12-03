package view;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.JTextField;

import controller.Comercial;
import model.Compra;

import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCompraAction extends JFrame {
	public TelaCompraAction() {
		getContentPane().setBackground(Color.WHITE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\_Faculdade\\LTPIII\\WorkspaceJava\\Siscom_\\Icones\\icons8-Comprar-48.png"));
		setTitle("Jokenpo - Compra");
		getContentPane().setLayout(null);

		JMenuBar menuBarCompra = new JMenuBar();
		menuBarCompra.setBackground(Color.WHITE);
		menuBarCompra.setBounds(0, 0, 434, 21);
		getContentPane().add(menuBarCompra);

		JMenu mnPessoa = new JMenu("Pessoa");
		mnPessoa.setBackground(Color.WHITE);
		menuBarCompra.add(mnPessoa);

		JMenuItem mntmCliente = new JMenuItem("Cliente");
		mntmCliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaClientesAction tca = new TelaClientesAction();
				tca.mostraTela();
				fechaTelaCompra();
			}
		});
		mnPessoa.add(mntmCliente);

		JMenuItem mntmFornecedor = new JMenuItem("Fornecedor");
		mntmFornecedor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaFornecedorAction tfa = new TelaFornecedorAction();
				tfa.mostraEssaTela();
				fechaTelaCompra();
			}
		});
		mnPessoa.add(mntmFornecedor);

		JMenuItem mntmVendedor = new JMenuItem("Vendedor");
		mntmVendedor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaVendedorAction tva = new TelaVendedorAction();
				tva.mostraEssaTela();
				fechaTelaCompra();
			}
		});
		mnPessoa.add(mntmVendedor);

		JMenu mnProduto = new JMenu("Produto");
		menuBarCompra.add(mnProduto);

		JMenu mnCompra = new JMenu("Compra");
		menuBarCompra.add(mnCompra);

		JMenuItem mntmCompra = new JMenuItem("Compra");
		mntmCompra.setEnabled(false);
		mnCompra.add(mntmCompra);

		JMenuItem mntmItemCompra = new JMenuItem("Item da Compra");
		mnCompra.add(mntmItemCompra);

		JMenu mnVenda = new JMenu("Venda");
		menuBarCompra.add(mnVenda);

		JMenuItem mntmVenda = new JMenuItem("Venda");
		mnVenda.add(mntmVenda);

		JMenuItem mntmItemVenda = new JMenuItem("Item da Venda");
		mnVenda.add(mntmItemVenda);

		JMenu mnEstatistica = new JMenu("Estat\u00EDsticas");
		menuBarCompra.add(mnEstatistica);

		JMenu mnSair = new JMenu("Sair");
		mnSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		menuBarCompra.add(mnSair);

		JButton btnAdd = new JButton("");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Comercial com = new Comercial();
				//com.inserirNovaCompra(new Compra(txtFornecedor.getText(), txtItCompra.getText()));
			}
		});
		btnAdd.setIcon(new ImageIcon("D:\\_Faculdade\\LTPIII\\WorkspaceJava\\Siscom_\\Icones\\icons8-Mais-26.png"));
		btnAdd.setToolTipText("Adicionar");
		btnAdd.setBackground(Color.WHITE);
		btnAdd.setBounds(5, 45, 30, 27);
		getContentPane().add(btnAdd);

		JButton btnDelete = new JButton("");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Comercial com = new Comercial();
				try {
					com.excluirCompraPeloNumCompra(Integer.parseInt(txtNumCompraDel.getText()));
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
					com.pesquisarCompraPeloNumCompra(Integer.parseInt(txtNumCompraSearch.getText()));
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
				com.getListaCompras();
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

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBorder(null);
		tabbedPane.setBackground(Color.WHITE);
		tabbedPane.setBounds(50, 25, 368, 230);
		getContentPane().add(tabbedPane);

		JPanel panelCadastrar = new JPanel();
		panelCadastrar.setLayout(null);
		panelCadastrar.setToolTipText("Cadastrar");
		panelCadastrar.setBackground(SystemColor.menu);
		tabbedPane.addTab("Cadastrar", null, panelCadastrar, null);

		JLabel lblNumCompraCad = new JLabel("N\u00FAmero da Compra:");
		lblNumCompraCad.setBounds(10, 28, 123, 14);
		panelCadastrar.add(lblNumCompraCad);

		JLabel lblFornecedor = new JLabel("Fornecedor:");
		lblFornecedor.setBounds(10, 65, 75, 14);
		panelCadastrar.add(lblFornecedor);

		JLabel lblCompraIt = new JLabel("Itens da Compra:");
		lblCompraIt.setBounds(10, 111, 91, 14);
		panelCadastrar.add(lblCompraIt);

		JLabel lblDtCompra = new JLabel("Data da Compra:");
		lblDtCompra.setBounds(10, 153, 96, 14);
		panelCadastrar.add(lblDtCompra);

		JTextField txtNumCompraCad = new JTextField();
		txtNumCompraCad.setEditable(false);
		txtNumCompraCad.setColumns(10);
		txtNumCompraCad.setBounds(143, 25, 86, 20);
		panelCadastrar.add(txtNumCompraCad);

		txtFornecedor = new JTextField();
		txtFornecedor.setToolTipText("000.000.000-00");
		txtFornecedor.setColumns(10);
		txtFornecedor.setBounds(106, 62, 123, 20);
		panelCadastrar.add(txtFornecedor);

		txtItCompra = new JTextField();
		txtItCompra.setColumns(10);
		txtItCompra.setBounds(143, 108, 86, 20);
		panelCadastrar.add(txtItCompra);

		txtDtCompra = new JTextField();
		txtDtCompra.setToolTipText("dd/MM/aaaa");
		txtDtCompra.setColumns(10);
		txtDtCompra.setBounds(143, 150, 86, 20);
		panelCadastrar.add(txtDtCompra);

		JPanel panelExcluir = new JPanel();
		panelExcluir.setLayout(null);
		panelExcluir.setBackground(SystemColor.menu);
		tabbedPane.addTab("Excluir", null, panelExcluir, null);

		tableDelete = new JTable();
		tableDelete.setBounds(354, 191, -345, -146);
		panelExcluir.add(tableDelete);

		txtNumCompraDel = new JTextField();
		txtNumCompraDel.setColumns(10);
		txtNumCompraDel.setBounds(132, 11, 125, 20);
		panelExcluir.add(txtNumCompraDel);

		JLabel lblNumCompraDel = new JLabel("N\u00FAmero da Compra:");
		lblNumCompraDel.setBounds(10, 14, 120, 14);
		panelExcluir.add(lblNumCompraDel);

		JPanel panelPesquisa = new JPanel();
		panelPesquisa.setLayout(null);
		panelPesquisa.setToolTipText("000.000.000-00");
		panelPesquisa.setBackground(SystemColor.menu);
		tabbedPane.addTab("Pesquisar", null, panelPesquisa, null);

		txtNumCompraSearch = new JTextField();
		txtNumCompraSearch.setColumns(10);
		txtNumCompraSearch.setBounds(132, 11, 125, 20);
		panelPesquisa.add(txtNumCompraSearch);

		JLabel lblNumCompraSearch = new JLabel("N\u00FAmero da Compra:");
		lblNumCompraSearch.setBounds(10, 14, 119, 14);
		panelPesquisa.add(lblNumCompraSearch);

		tableSearch = new JTable();
		tableSearch.setBounds(10, 187, 343, -142);
		panelPesquisa.add(tableSearch);

		JPanel panelListar = new JPanel();
		panelListar.setLayout(null);
		tabbedPane.addTab("Listar", null, panelListar, null);

		tableList = new JTable();
		tableList.setBounds(345, 194, -334, -183);
		panelListar.add(tableList);
		setSize(new Dimension(444, 301));
		setLocationRelativeTo(null);
	}

	private static final long serialVersionUID = 1L;
	private JTextField txtFornecedor;
	private JTextField txtItCompra;
	private JTextField txtDtCompra;
	private JTable tableDelete;
	private JTextField txtNumCompraDel;
	private JTextField txtNumCompraSearch;
	private JTable tableSearch;
	private JTable tableList;

	public void mostraEssaTela(){
		setVisible(true);
	}

	public void fechaTelaCompra(){
		this.dispose();
	}
}
