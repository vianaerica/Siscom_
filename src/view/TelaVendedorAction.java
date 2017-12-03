package view;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import java.awt.Color;
import java.awt.Dimension;
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
import model.Vendedor;

import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaVendedorAction extends JFrame {
	public TelaVendedorAction() {
		getContentPane().setBackground(Color.WHITE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\_Faculdade\\LTPIII\\WorkspaceJava\\Siscom_\\Icones\\icons8-Gerente-64.png"));
		setTitle("Jokenpo - Vendedor");
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		setSize(new Dimension(444,301));

		JMenuBar menuBarVendedor = new JMenuBar();
		menuBarVendedor.setBounds(0, 0, 434, 21);
		menuBarVendedor.setBackground(Color.WHITE);
		getContentPane().add(menuBarVendedor);

		JMenu mnPessoa = new JMenu("Pessoa");
		menuBarVendedor.add(mnPessoa);

		JMenuItem mntmCliente = new JMenuItem("Cliente");
		mntmCliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaClientesAction tca = new TelaClientesAction();
				tca.mostraTela();
				fechaTelaVend();
			}
		});
		mnPessoa.add(mntmCliente);

		JMenuItem mntmFornecedor = new JMenuItem("Fornecedor");
		mntmFornecedor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaFornecedorAction tfa = new TelaFornecedorAction();
				tfa.mostraEssaTela();
				fechaTelaVend();
			}
		});
		mnPessoa.add(mntmFornecedor);

		JMenuItem mntmVendedor = new JMenuItem("Vendedor");
		mntmVendedor.setEnabled(false);
		mnPessoa.add(mntmVendedor);

		JMenu mnProduto = new JMenu("Produto");
		menuBarVendedor.add(mnProduto);

		JMenu mnCompra = new JMenu("Compra");
		menuBarVendedor.add(mnCompra);

		JMenuItem mntmCompra = new JMenuItem("Compra");
		mnCompra.add(mntmCompra);

		JMenuItem mntmItemCompra = new JMenuItem("Item da Compra");
		mnCompra.add(mntmItemCompra);

		JMenu mnVenda = new JMenu("Venda");
		menuBarVendedor.add(mnVenda);

		JMenuItem mntmVenda = new JMenuItem("Venda");
		mnVenda.add(mntmVenda);

		JMenuItem mntmItemVenda = new JMenuItem("Item da Venda");
		mnVenda.add(mntmItemVenda);

		JMenu mnEstatistica = new JMenu("Estat\u00EDsticas");
		menuBarVendedor.add(mnEstatistica);

		JMenu mnSair = new JMenu("Sair");
		mnSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		menuBarVendedor.add(mnSair);

		JButton btnAdd = new JButton("");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Comercial com = new Comercial();
				Date data = new Date();
				try {
					com.inserirNovaPessoa(new Vendedor(com.gerarCodPessoaSequencial(), txtNomeCad.getText(), txtTelefoneCad.getText(), txtEmailCad.getText(), data, txtCpfCad.getText(), Double.parseDouble( txtMetaMCad.getText())));
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
			//	com.excluirPessoa(Vendedor(txtCpfDel.getText()));
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
					com.pesquisarVendedorPorCpf(txtCpfSearch.getText());
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

		JLabel lblCpfCad = new JLabel("CPF:");
		lblCpfCad.setBounds(10, 36, 46, 14);
		panelCadastrar.add(lblCpfCad);

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

		txtCpfCad = new JTextField();
		txtCpfCad.setToolTipText("000.000.000-00");
		txtCpfCad.setColumns(10);
		txtCpfCad.setBounds(158, 30, 86, 20);
		panelCadastrar.add(txtCpfCad);

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

		JLabel lblMetaMCad = new JLabel("Meta Mensal:");
		lblMetaMCad.setBounds(10, 86, 106, 14);
		panelCadastrar.add(lblMetaMCad);

		txtMetaMCad = new JTextField();
		txtMetaMCad.setToolTipText("R$ 00,00");
		txtMetaMCad.setColumns(10);
		txtMetaMCad.setBounds(158, 80, 86, 20);
		panelCadastrar.add(txtMetaMCad);

		JPanel panelExcluir = new JPanel();
		panelExcluir.setLayout(null);
		panelExcluir.setToolTipText("Excluir");
		panelExcluir.setBackground(SystemColor.menu);
		tabbedPaneVendedor.addTab("Excluir", null, panelExcluir, null);

		tableDelVend = new JTable();
		tableDelVend.setBounds(354, 191, -345, -146);
		panelExcluir.add(tableDelVend);

		txtCpfDel = new JTextField();
		txtCpfDel.setColumns(10);
		txtCpfDel.setBounds(47, 11, 125, 20);
		panelExcluir.add(txtCpfDel);

		JLabel lblCpfDel = new JLabel("CPF: ");
		lblCpfDel.setBounds(10, 14, 46, 14);
		panelExcluir.add(lblCpfDel);

		JPanel panelPesquisar = new JPanel();
		panelPesquisar.setLayout(null);
		panelPesquisar.setToolTipText("Pesquisar");
		panelPesquisar.setBackground(SystemColor.menu);
		tabbedPaneVendedor.addTab("Pesquisar", null, panelPesquisar, null);

		txtCpfSearch = new JTextField();
		txtCpfSearch.setColumns(10);
		txtCpfSearch.setBounds(47, 11, 125, 20);
		panelPesquisar.add(txtCpfSearch);

		JLabel lblCpfSearch = new JLabel("CPF: ");
		lblCpfSearch.setBounds(10, 14, 46, 14);
		panelPesquisar.add(lblCpfSearch);

		tableSearch = new JTable();
		tableSearch.setBounds(10, 187, 343, -142);
		panelPesquisar.add(tableSearch);

		JPanel panelList = new JPanel();
		tabbedPaneVendedor.addTab("Listar", null, panelList, null);
		panelList.setLayout(null);

		tableListVend = new JTable();
		tableListVend.setBounds(356, 190, -345, -178);
		panelList.add(tableListVend);
	}
	private static final long serialVersionUID = 1L;
	private JTextField txtCodCad;
	private JTextField txtCpfCad;
	private JTextField txtTelefoneCad;
	private JTextField txtEmailCad;
	private JTextField txtDtCadCad;
	private JTextField txtNomeCad;
	private JTextField txtMetaMCad;
	private JTable tableDelVend;
	private JTextField txtCpfDel;
	private JTextField txtCpfSearch;
	private JTable tableSearch;
	private JTable tableListVend;

	public void mostraEssaTela(){
		setVisible(true);
	}
	public void fechaTelaVend(){
		this.dispose();
	}

}
