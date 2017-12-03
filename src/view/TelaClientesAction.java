package view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.JTextField;
import controller.Comercial;
import model.Cliente;
import model.Pessoa;
import model.Produto;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class TelaClientesAction extends JFrame{
	public TelaClientesAction() {
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);


		JTabbedPane tabbedPaneCliente = new JTabbedPane(JTabbedPane.TOP);
		tabbedPaneCliente.setBorder(null);
		tabbedPaneCliente.setBackground(Color.WHITE);
		tabbedPaneCliente.setBounds(50, 0, 368, 230);
		getContentPane().add(tabbedPaneCliente);

		JPanel panelCadastra = new JPanel();
		panelCadastra.setBackground(SystemColor.menu);
		panelCadastra.setToolTipText("Cadastrar");
		tabbedPaneCliente.addTab("Cadastrar", null, panelCadastra, null);
		panelCadastra.setLayout(null);

		JLabel lblCodCad = new JLabel("C\u00F3digo: ");
		lblCodCad.setBounds(10, 11, 46, 14);
		panelCadastra.add(lblCodCad);

		JLabel lblCpfCad = new JLabel("CPF:");
		lblCpfCad.setBounds(10, 36, 46, 14);
		panelCadastra.add(lblCpfCad);

		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setBounds(10, 61, 46, 14);
		panelCadastra.add(lblNome);

		JLabel lblLimiteCrdCad = new JLabel("Limite de Cr\u00E9dito: ");
		lblLimiteCrdCad.setBounds(10, 86, 106, 14);
		panelCadastra.add(lblLimiteCrdCad);

		JLabel lblTelCad = new JLabel("Telefones:");
		lblTelCad.setBounds(10, 111, 84, 14);
		panelCadastra.add(lblTelCad);

		JLabel lblEmailCad = new JLabel("E-mail: ");
		lblEmailCad.setBounds(10, 136, 64, 14);
		panelCadastra.add(lblEmailCad);

		JLabel lblDtCadCad = new JLabel("Data do Cadastro: ");
		lblDtCadCad.setBounds(10, 161, 106, 14);
		panelCadastra.add(lblDtCadCad);

		txtCodCad = new JTextField();
		txtCodCad.setEditable(false);
		txtCodCad.setBounds(119, 8, 86, 20);
		panelCadastra.add(txtCodCad);
		txtCodCad.setColumns(10);

		txtCpfCad = new JTextField();
		txtCpfCad.setToolTipText("000.000.000-00");
		txtCpfCad.setBounds(119, 33, 86, 20);
		panelCadastra.add(txtCpfCad);
		txtCpfCad.setColumns(10);

		txtNomeCad = new JTextField();
		txtNomeCad.setBounds(82, 58, 123, 20);
		panelCadastra.add(txtNomeCad);
		txtNomeCad.setColumns(10);

		txtLimiteCrdCad = new JTextField();
		txtLimiteCrdCad.setToolTipText("R$ 00,00");
		txtLimiteCrdCad.setBounds(119, 83, 86, 20);
		panelCadastra.add(txtLimiteCrdCad);
		txtLimiteCrdCad.setColumns(10);

		txtTelCad = new JTextField();
		txtTelCad.setToolTipText("(00) 00000-0000");
		txtTelCad.setBounds(119, 108, 86, 20);
		panelCadastra.add(txtTelCad);
		txtTelCad.setColumns(10);

		txtEmailCad = new JTextField();
		txtEmailCad.setBounds(119, 133, 86, 20);
		panelCadastra.add(txtEmailCad);
		txtEmailCad.setColumns(10);

		txtDtCadCad = new JTextField();
		txtDtCadCad.setToolTipText("dd/MM/aaaa");
		txtDtCadCad.setBounds(119, 158, 86, 20);
		panelCadastra.add(txtDtCadCad);
		txtDtCadCad.setColumns(10);

		JPanel panelDelete = new JPanel();
		panelDelete.setBackground(SystemColor.menu);
		tabbedPaneCliente.addTab("Excluir", null, panelDelete, null);
		panelDelete.setLayout(null);

		tableClienteDel = new JTable();
		tableClienteDel.setBounds(354, 191, -345, -146);
		panelDelete.add(tableClienteDel);

		txtCpfDel = new JTextField();
		txtCpfDel.setColumns(10);
		txtCpfDel.setBounds(47, 11, 125, 20);
		panelDelete.add(txtCpfDel);

		JLabel lblCpfDel = new JLabel("CPF: ");
		lblCpfDel.setBounds(10, 14, 46, 14);
		panelDelete.add(lblCpfDel);

		JPanel panelSearch = new JPanel();
		panelSearch.setToolTipText("000.000.000-00");
		panelSearch.setBackground(SystemColor.menu);
		tabbedPaneCliente.addTab("Pesquisar", null, panelSearch, null);
		panelSearch.setLayout(null);

		txtCpfSearch = new JTextField();
		txtCpfSearch.setBounds(47, 11, 125, 20);
		panelSearch.add(txtCpfSearch);
		txtCpfSearch.setColumns(10);

		JLabel lblCpfSearch = new JLabel("CPF: ");
		lblCpfSearch.setBounds(10, 14, 46, 14);
		panelSearch.add(lblCpfSearch);

		tableClienteSearch = new JTable();
		tableClienteSearch.setBounds(10, 187, 343, -142);
		panelSearch.add(tableClienteSearch);

		JPanel panelList = new JPanel();
		tabbedPaneCliente.addTab("Listar", null, panelList, null);
		panelList.setLayout(null);

		tableClienteList = new JTable();
		tableClienteList.setBounds(345, 194, -334, -183);
		panelList.add(tableClienteList);

		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\_Faculdade\\LTPIII\\Icones\\icons8-Fila-64.png"));
		setTitle("Jokenpo - Cliente");
		setSize(new Dimension(444, 301));

		JMenuBar menuBarCliente = new JMenuBar();
		setJMenuBar(menuBarCliente);

		JMenu mnPessoa = new JMenu("Pessoa");
		mnPessoa.setBackground(Color.WHITE);
		menuBarCliente.add(mnPessoa);

		JMenuItem mntmCliente = new JMenuItem("Cliente");
		mntmCliente.setEnabled(false);
		mnPessoa.add(mntmCliente);

		JMenuItem mntmFornecedor = new JMenuItem("Fornecedor");
		mntmFornecedor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				TelaFornecedorAction tfa = new TelaFornecedorAction();
				tfa.mostraEssaTela();
				fecharTelaCliente();
			}
		});
		mnPessoa.add(mntmFornecedor);

		JMenuItem mntmVendedor = new JMenuItem("Vendedor");
		mntmVendedor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaVendedorAction tva = new TelaVendedorAction();
				tva.mostraEssaTela();
				fecharTelaCliente();
			}
		});
		mnPessoa.add(mntmVendedor);

		JMenu mnProduto = new JMenu("Produto");
		mnProduto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaProdutoAction prd = new TelaProdutoAction();
				prd.mostraEssaTela();
				fecharTelaCliente();
			}
		});
		menuBarCliente.add(mnProduto);

		JMenu mnCompra = new JMenu("Compra");
		mnCompra.setBackground(Color.WHITE);
		menuBarCliente.add(mnCompra);

		JMenuItem mntmCompra = new JMenuItem("Compra");
		mntmCompra.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaCompraAction compra = new TelaCompraAction();
				compra.mostraEssaTela();
				fecharTelaCliente();
			}
		});
		mnCompra.add(mntmCompra);

		JMenuItem mntmItemDaCompra = new JMenuItem("Item da Compra");
		mntmItemDaCompra.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaItCompraAction itcompra = new TelaItCompraAction();
				itcompra.mostraEssaTela();
				fecharTelaCliente();
			}
		});
		mnCompra.add(mntmItemDaCompra);

		JMenu mnVenda = new JMenu("Venda");
		mnVenda.setBackground(Color.WHITE);
		menuBarCliente.add(mnVenda);

		JMenuItem mntmVenda = new JMenuItem("Venda");
		mntmVenda.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaVendaAction tva = new TelaVendaAction();
				tva.mostraEssaTela();
				fecharTelaCliente();
			}
		});
		mnVenda.add(mntmVenda);

		JMenuItem mntmItemDaVenda = new JMenuItem("Item da Venda");
		mntmItemDaVenda.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaItVendaAction itvenda = new TelaItVendaAction();
				itvenda.mostraEssaTela();
				fecharTelaCliente();
			}
		});
		mnVenda.add(mntmItemDaVenda);

		JMenu mnEstatsticas = new JMenu("Estat\u00EDsticas");
		mnEstatsticas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaEstatisticaAction tea = new TelaEstatisticaAction();
				tea.mostraEssaTela();
				fecharTelaCliente();
			}
		});
		mnEstatsticas.setBackground(Color.WHITE);
		menuBarCliente.add(mnEstatsticas);

		JMenu mnSair = new JMenu("Sair");
		mnSair.setBackground(Color.WHITE);
		menuBarCliente.add(mnSair);
		mnSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(DISPOSE_ON_CLOSE);
			}
		});

		JButton btnAdd = new JButton("");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Comercial com = new Comercial();
				Date data = new Date();
				try {
					com.inserirNovaPessoa(new Cliente(com.gerarCodPessoaSequencial(), txtNomeCad.getText(), txtTelCad.getText(), txtEmailCad.getText(), data, txtCpfCad.getText(), Double.parseDouble(txtLimiteCrdCad.getText())));
				} catch (Exception e) {
					e.getMessage();
				}
			}
		});
		btnAdd.setToolTipText("Adicionar");
		btnAdd.setBackground(Color.WHITE);
		btnAdd.setIcon(new ImageIcon("D:\\_Faculdade\\LTPIII\\WorkspaceJava\\Siscom_\\Icones\\icons8-Mais-26.png"));
		btnAdd.setBounds(5, 45, 30, 27);
		getContentPane().add(btnAdd);

		JButton btnDelete = new JButton("");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Comercial com = new Comercial();
			//	com.excluirPessoa(Cliente(txtCpfDel.getText()));
			}
		});
		btnDelete.setBackground(Color.WHITE);
		btnDelete.setToolTipText("Excluir");
		btnDelete.setIcon(new ImageIcon("D:\\_Faculdade\\LTPIII\\WorkspaceJava\\Siscom_\\Icones\\icons8-Apagar Arquivo-24.png"));
		btnDelete.setBounds(5, 71, 30, 27);
		getContentPane().add(btnDelete);

		JButton btnPesquisa = new JButton("");
		btnPesquisa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Comercial com = new Comercial();
				try {
					com.pesquisarClientesPorCpf(txtCpfSearch.getText());
				} catch (Exception e) {
					e.getMessage();
				}
			}
		});
		btnPesquisa.setToolTipText("Pesquisar");
		btnPesquisa.setIcon(new ImageIcon("D:\\_Faculdade\\LTPIII\\WorkspaceJava\\Siscom_\\Icones\\icons8-Pesquisa Google na Web-24.png"));
		btnPesquisa.setBackground(Color.WHITE);
		btnPesquisa.setBounds(5, 97, 30, 27);
		getContentPane().add(btnPesquisa);

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
		btnList.setToolTipText("Listar");
		btnList.setBackground(Color.WHITE);
		btnList.setIcon(new ImageIcon("D:\\_Faculdade\\LTPIII\\WorkspaceJava\\Siscom_\\Icones\\icons8-Lista-24.png"));
		btnList.setBounds(5, 123, 30, 27);
		getContentPane().add(btnList);

		JLabel lblAcoes = new JLabel("A\u00E7\u00F5es");
		lblAcoes.setBackground(Color.WHITE);
		lblAcoes.setBounds(5, 28, 46, 14);
		getContentPane().add(lblAcoes);
	}


	private static final long serialVersionUID = 1L;
	private JTextField txtCodCad;
	private JTextField txtCpfCad;
	private JTextField txtNomeCad;
	private JTextField txtLimiteCrdCad;
	private JTextField txtTelCad;
	private JTextField txtEmailCad;
	private JTextField txtDtCadCad;
	private JTable tableClienteList;
	private JTextField txtCpfSearch;
	private JTable tableClienteSearch;
	private JTable tableClienteDel;
	private JTextField txtCpfDel;

	public void mostraTela(){
		setVisible(true);
	}

	public void fecharTelaCliente(){
		this.dispose();
	}
}
