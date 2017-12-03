package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;

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
import model.Fornecedor;
import model.Pessoa;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaFornecedorAction extends JFrame {
	public TelaFornecedorAction() {
		getContentPane().setBackground(Color.WHITE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\_Faculdade\\LTPIII\\WorkspaceJava\\Siscom_\\Icones\\icons8-Funcion\u00E1rio da alf\u00E2ndega-64.png"));
		setTitle("Jokenpo - Fornecedor");
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		setSize(new Dimension(444,301));

		JMenuBar menuBarFornecedor = new JMenuBar();
		menuBarFornecedor.setBounds(0, 0, 434, 21);
		menuBarFornecedor.setBackground(Color.WHITE);
		getContentPane().add(menuBarFornecedor);

		JMenu mnPessoa = new JMenu("Pessoa");
		menuBarFornecedor.add(mnPessoa);

		JMenuItem mntmCliente = new JMenuItem("Cliente");
		mntmCliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaClientesAction tca = new TelaClientesAction();
				tca.mostraTela();
				fechaTelaForn();
			}
		});
		mnPessoa.add(mntmCliente);

		JMenuItem mntmFornecedor = new JMenuItem("Fornecedor");
		mntmFornecedor.setEnabled(false);
		mnPessoa.add(mntmFornecedor);

		JMenuItem mntmVendedor = new JMenuItem("Vendedor");
		mntmVendedor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				TelaVendedorAction tva = new TelaVendedorAction();
				tva.mostraEssaTela();
				fechaTelaForn();
			}
		});
		mnPessoa.add(mntmVendedor);

		JMenu mnProduto = new JMenu("Produto");
		menuBarFornecedor.add(mnProduto);

		JMenu mnCompra = new JMenu("Compra");
		menuBarFornecedor.add(mnCompra);

		JMenuItem mntmCompra = new JMenuItem("Compra");
		mntmCompra.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaCompraAction compra = new TelaCompraAction();
				compra.mostraEssaTela();
				fechaTelaForn();
			}
		});
		mnCompra.add(mntmCompra);

		JMenuItem mntmItemCompra = new JMenuItem("Item da Compra");
		mntmItemCompra.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaItCompraAction itcompra = new TelaItCompraAction();
				itcompra.mostraEssaTela();
				fechaTelaForn();
			}
		});
		mnCompra.add(mntmItemCompra);

		JMenu mnVenda = new JMenu("Venda");
		menuBarFornecedor.add(mnVenda);

		JMenuItem mntmVenda = new JMenuItem("Venda");
		mnVenda.add(mntmVenda);

		JMenuItem mntmItemVenda = new JMenuItem("Item da Venda");
		mnVenda.add(mntmItemVenda);

		JMenu mnEstatistica = new JMenu("Estat\u00EDsticas");
		menuBarFornecedor.add(mnEstatistica);

		JMenu mnSair = new JMenu("Sair");
		mnSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		menuBarFornecedor.add(mnSair);

		JButton btnAdd = new JButton("");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Comercial com = new Comercial();
				Date data = new Date();
				try {
					com.inserirNovaPessoa(new Fornecedor(com.gerarCodPessoaSequencial(), txtNomeCad.getText(), txtTelefoneCad.getText(), txtEmailCad.getText(), data, txtCnpjCad.getText(), txtNomeCttCad.getText()));
				} catch (Exception e1) {
					e1.getMessage();
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
				//com.excluirPessoa(Fornecedor(txtCnpjDel.getText()));
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
					com.pesquisarFornecedorPorCnpj(txtCnpjSearch.getText());
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
					com.listarPessoasEmOrdemAlfabetica();
				} catch (Exception e1) {
					e1.getMessage();
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

		JTabbedPane tabbedPaneForn = new JTabbedPane(JTabbedPane.TOP);
		tabbedPaneForn.setBorder(null);
		tabbedPaneForn.setBackground(Color.WHITE);
		tabbedPaneForn.setBounds(50, 22, 368, 230);
		getContentPane().add(tabbedPaneForn);

		JPanel panelCadastrar = new JPanel();
		panelCadastrar.setLayout(null);
		panelCadastrar.setToolTipText("Cadastrar");
		panelCadastrar.setBackground(SystemColor.menu);
		tabbedPaneForn.addTab("Cadastrar", null, panelCadastrar, null);

		JLabel lblCodCad = new JLabel("C\u00F3digo: ");
		lblCodCad.setBounds(10, 11, 46, 14);
		panelCadastrar.add(lblCodCad);

		JLabel lblCnpjCad = new JLabel("CNPJ:");
		lblCnpjCad.setBounds(10, 36, 46, 14);
		panelCadastrar.add(lblCnpjCad);

		JLabel lblNomeCad = new JLabel("Nome: ");
		lblNomeCad.setBounds(10, 61, 106, 14);
		panelCadastrar.add(lblNomeCad);

		JLabel lblTelefoneCad = new JLabel("Telefones:");
		lblTelefoneCad.setBounds(10, 111, 84, 14);
		panelCadastrar.add(lblTelefoneCad);

		JLabel lblEmailCad = new JLabel("E-mail: ");
		lblEmailCad.setBounds(10, 136, 64, 14);
		panelCadastrar.add(lblEmailCad);

		JLabel lblDataCadCad = new JLabel("Data do Cadastro: ");
		lblDataCadCad.setBounds(10, 161, 106, 14);
		panelCadastrar.add(lblDataCadCad);

		txtCodCad = new JTextField();
		txtCodCad.setEditable(false);
		txtCodCad.setColumns(10);
		txtCodCad.setBounds(158, 5, 86, 20);
		panelCadastrar.add(txtCodCad);

		txtCnpjCad = new JTextField();
		txtCnpjCad.setToolTipText("00.000.000/0000-00");
		txtCnpjCad.setColumns(10);
		txtCnpjCad.setBounds(131, 30, 113, 20);
		panelCadastrar.add(txtCnpjCad);

		txtTelefoneCad = new JTextField();
		txtTelefoneCad.setToolTipText("(00) 00000-0000");
		txtTelefoneCad.setColumns(10);
		txtTelefoneCad.setBounds(158, 105, 86, 20);
		panelCadastrar.add(txtTelefoneCad);

		txtEmailCad = new JTextField();
		txtEmailCad.setColumns(10);
		txtEmailCad.setBounds(158, 130, 86, 20);
		panelCadastrar.add(txtEmailCad);

		txtDtCadCad = new JTextField();
		txtDtCadCad.setToolTipText("dd/MM/aaaa");
		txtDtCadCad.setColumns(10);
		txtDtCadCad.setBounds(158, 155, 86, 20);
		panelCadastrar.add(txtDtCadCad);

		txtNomeCad = new JTextField();
		txtNomeCad.setColumns(10);
		txtNomeCad.setBounds(104, 55, 140, 20);
		panelCadastrar.add(txtNomeCad);

		JLabel lblNomeContato = new JLabel("Nome do Contato:");
		lblNomeContato.setBounds(10, 86, 106, 14);
		panelCadastrar.add(lblNomeContato);

		txtNomeCttCad = new JTextField();
		txtNomeCttCad.setToolTipText("R$ 00,00");
		txtNomeCttCad.setColumns(10);
		txtNomeCttCad.setBounds(114, 80, 130, 20);
		panelCadastrar.add(txtNomeCttCad);

		JPanel panelExcluir = new JPanel();
		panelExcluir.setLayout(null);
		panelExcluir.setToolTipText("Excluir");
		panelExcluir.setBackground(SystemColor.menu);
		tabbedPaneForn.addTab("Excluir", null, panelExcluir, null);

		tableDelForn = new JTable();
		tableDelForn.setBounds(354, 191, -345, -146);
		panelExcluir.add(tableDelForn);

		txtCnpjDel = new JTextField();
		txtCnpjDel.setColumns(10);
		txtCnpjDel.setBounds(47, 11, 125, 20);
		panelExcluir.add(txtCnpjDel);

		JLabel lblCnpjDel = new JLabel("CNPJ:");
		lblCnpjDel.setBounds(10, 14, 46, 14);
		panelExcluir.add(lblCnpjDel);

		JPanel panelPesquisar = new JPanel();
		panelPesquisar.setLayout(null);
		panelPesquisar.setToolTipText("Pesquisar");
		panelPesquisar.setBackground(SystemColor.menu);
		tabbedPaneForn.addTab("Pesquisar", null, panelPesquisar, null);

		txtCnpjSearch = new JTextField();
		txtCnpjSearch.setColumns(10);
		txtCnpjSearch.setBounds(47, 11, 125, 20);
		panelPesquisar.add(txtCnpjSearch);

		JLabel lblCnpjSearch = new JLabel("CNPJ:");
		lblCnpjSearch.setBounds(10, 14, 46, 14);
		panelPesquisar.add(lblCnpjSearch);

		tableSearch = new JTable();
		tableSearch.setBounds(10, 187, 343, -142);
		panelPesquisar.add(tableSearch);

		JPanel panelList = new JPanel();
		tabbedPaneForn.addTab("Listar", null, panelList, null);
		panelList.setLayout(null);

		tableListForn = new JTable();
		tableListForn.setBounds(356, 190, -345, -178);
		panelList.add(tableListForn);
	}

	private JTextField txtCodCad;
	private JTextField txtCnpjCad;
	private JTextField txtTelefoneCad;
	private JTextField txtEmailCad;
	private JTextField txtDtCadCad;
	private JTextField txtNomeCad;
	private JTextField txtNomeCttCad;
	private JTable tableDelForn;
	private JTextField txtCnpjDel;
	private JTextField txtCnpjSearch;
	private JTable tableSearch;
	private JTable tableListForn;


	private static final long serialVersionUID = 1L;

	public void mostraEssaTela(){
		setVisible(true);
	}

	public void fechaTelaForn(){
		this.dispose();
	}
}
