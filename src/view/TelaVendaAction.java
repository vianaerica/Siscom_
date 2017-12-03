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
import javax.swing.JTextField;

import controller.Comercial;
import model.Cliente;
import model.Venda;

import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.SystemColor;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaVendaAction extends JFrame {
	public TelaVendaAction() {
		getContentPane().setBackground(Color.WHITE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\_Faculdade\\LTPIII\\Icones\\icons8-Caixa registradora antiga-64.png"));
		setTitle("Jokenpo - Venda");
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		setSize(new Dimension(444, 301));

		JMenuBar menuBarVenda = new JMenuBar();
		menuBarVenda.setBounds(0, 0, 434, 21);
		getContentPane().add(menuBarVenda);

		JMenu mnPessoa = new JMenu("Pessoa");
		menuBarVenda.add(mnPessoa);

		JMenuItem mntmCliente = new JMenuItem("Cliente");
		mntmCliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				TelaClientesAction tca = new TelaClientesAction();
				tca.mostraTela();
				fechaTela();
			}
		});
		mnPessoa.add(mntmCliente);

		JMenuItem mntmFornecedor = new JMenuItem("Fornecedor");
		mntmFornecedor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaFornecedorAction tfa = new TelaFornecedorAction();
				tfa.mostraEssaTela();
				fechaTela();
			}
		});
		mnPessoa.add(mntmFornecedor);

		JMenuItem mntmVendedor = new JMenuItem("Vendedor");
		mntmVendedor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaVendedorAction tva = new TelaVendedorAction();
				tva.mostraEssaTela();
				fechaTela();
			}
		});
		mnPessoa.add(mntmVendedor);

		JMenu mnProduto = new JMenu("Produto");
		menuBarVenda.add(mnProduto);

		JMenu mnCompra = new JMenu("Compra");
		menuBarVenda.add(mnCompra);

		JMenuItem mntmCompra = new JMenuItem("Compra");
		mntmCompra.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaCompraAction compra = new TelaCompraAction();
				compra.mostraEssaTela();
				fechaTela();
			}
		});
		mnCompra.add(mntmCompra);

		JMenuItem mntmItemDaCompra = new JMenuItem("Item da Compra");
		mntmItemDaCompra.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				TelaItCompraAction itcompra = new TelaItCompraAction();
				itcompra.mostraEssaTela();
			}
		});
		mnCompra.add(mntmItemDaCompra);

		JMenu mnVenda = new JMenu("Venda");
		menuBarVenda.add(mnVenda);

		JMenuItem mntmVenda = new JMenuItem("Venda");
		mntmVenda.setEnabled(false);
		mnVenda.add(mntmVenda);

		JMenuItem mntmItemDaVenda = new JMenuItem("Item da Venda");
		mnVenda.add(mntmItemDaVenda);

		JMenu mnEstatsticas = new JMenu("Estat\u00EDsticas");
		menuBarVenda.add(mnEstatsticas);

		JMenu mnSair = new JMenu("Sair");
		mnSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(DISPOSE_ON_CLOSE);
			}
		});
		menuBarVenda.add(mnSair);

		JButton btnAdd = new JButton("");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Comercial com = new Comercial();
				Date data = new Date();
				try {
					//com.inserirNovaVenda(new Venda(com.gerarNumVendaSequencial(), txtCliente.getText(), txtVendedor.getText(), txtItVenda.getText(), Integer.parseInt(comboBoxFormaPgto), data));
				} catch (Exception e1) {
					e1.getMessage();
				}
			}
		});
		btnAdd.setToolTipText("Adicionar");
		btnAdd.setBackground(Color.WHITE);
		btnAdd.setIcon(new ImageIcon("D:\\_Faculdade\\LTPIII\\Icones\\icons8-Mais-26.png"));
		btnAdd.setBounds(5, 45, 30, 27);
		getContentPane().add(btnAdd);

		JButton btnDelete = new JButton("");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Comercial com = new Comercial();
				try {
					com.excluirVendaPeloNumVenda(Integer.parseInt(txtNumVendaDel.getText()));
				} catch (Exception e1) {
					e1.getMessage();
				}
			}
		});
		btnDelete.setBackground(Color.WHITE);
		btnDelete.setToolTipText("Excluir");
		btnDelete.setIcon(new ImageIcon("D:\\_Faculdade\\LTPIII\\Icones\\icons8-Apagar Arquivo-24.png"));
		btnDelete.setBounds(5, 71, 30, 27);
		getContentPane().add(btnDelete);

		JButton btnPesquisa = new JButton("");
		btnPesquisa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Comercial com = new Comercial();
				try {
					com.pesquisarVendaPeloNumVenda(Integer.parseInt(txtNumVendaSearch.getText()));
				} catch (Exception e1) {
					e1.getMessage();
				}
			}
		});
		btnPesquisa.setToolTipText("Pesquisar");
		btnPesquisa.setIcon(new ImageIcon("D:\\_Faculdade\\LTPIII\\Icones\\icons8-Pesquisa Google na Web-24.png"));
		btnPesquisa.setBackground(Color.WHITE);
		btnPesquisa.setBounds(5, 97, 30, 27);
		getContentPane().add(btnPesquisa);

		JButton btnList = new JButton("");
		btnList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Comercial com = new Comercial();
				com.getListaCompras();
			}
		});
		btnList.setToolTipText("Listar");
		btnList.setBackground(Color.WHITE);
		btnList.setIcon(new ImageIcon("D:\\_Faculdade\\LTPIII\\Icones\\icons8-Lista-24.png"));
		btnList.setBounds(5, 123, 30, 27);
		getContentPane().add(btnList);

		JLabel lblAcoes = new JLabel("A\u00E7\u00F5es");
		lblAcoes.setBackground(Color.WHITE);
		lblAcoes.setBounds(5, 28, 46, 14);
		getContentPane().add(lblAcoes);

		JTabbedPane tabbedPaneItCompra = new JTabbedPane(JTabbedPane.TOP);
		tabbedPaneItCompra.setBorder(null);
		tabbedPaneItCompra.setBackground(Color.WHITE);
		tabbedPaneItCompra.setBounds(50, 23, 368, 230);
		getContentPane().add(tabbedPaneItCompra);

		JPanel panelCadastrar = new JPanel();
		panelCadastrar.setLayout(null);
		panelCadastrar.setToolTipText("Cadastrar");
		panelCadastrar.setBackground(SystemColor.menu);
		tabbedPaneItCompra.addTab("Cadastrar", null, panelCadastrar, null);

		JLabel lblNumVendaCad = new JLabel("N\u00FAmero da Venda:");
		lblNumVendaCad.setBounds(10, 15, 98, 14);
		panelCadastrar.add(lblNumVendaCad);

		JLabel lblCliente = new JLabel("Cliente:");
		lblCliente.setBounds(10, 42, 48, 14);
		panelCadastrar.add(lblCliente);

		JLabel lblVendedor = new JLabel("Vendedor:");
		lblVendedor.setBounds(10, 70, 67, 14);
		panelCadastrar.add(lblVendedor);

		txtNumVenda = new JTextField();
		txtNumVenda.setEditable(false);
		txtNumVenda.setBounds(144, 12, 86, 20);
		panelCadastrar.add(txtNumVenda);
		txtNumVenda.setColumns(10);

		txtCliente = new JTextField();
		txtCliente.setBounds(103, 39, 127, 20);
		panelCadastrar.add(txtCliente);
		txtCliente.setColumns(10);

		txtVendedor = new JTextField();
		txtVendedor.setBounds(103, 67, 127, 20);
		panelCadastrar.add(txtVendedor);
		txtVendedor.setColumns(10);

		JLabel lblItensVenda = new JLabel("Itens da Venda: ");
		lblItensVenda.setBounds(10, 98, 98, 14);
		panelCadastrar.add(lblItensVenda);

		txtItVenda = new JTextField();
		txtItVenda.setBounds(132, 95, 98, 20);
		panelCadastrar.add(txtItVenda);
		txtItVenda.setColumns(10);

		JLabel lblFormaPgto = new JLabel("Forma de Pagto.:");
		lblFormaPgto.setBounds(10, 126, 98, 14);
		panelCadastrar.add(lblFormaPgto);

		JComboBox comboBoxFormaPgto = new JComboBox();
		comboBoxFormaPgto.setModel(new DefaultComboBoxModel(new String[] {"Pagto. a Vista", "Pagto. a Prazo"}));
		comboBoxFormaPgto.setBounds(132, 123, 98, 20);
		panelCadastrar.add(comboBoxFormaPgto);

		JLabel lblDtVenda = new JLabel("Data da Venda:");
		lblDtVenda.setBounds(10, 154, 86, 14);
		panelCadastrar.add(lblDtVenda);

		txtDtVenda = new JTextField();
		txtDtVenda.setToolTipText("dd/MM/aaaa");
		txtDtVenda.setBounds(132, 151, 98, 20);
		panelCadastrar.add(txtDtVenda);
		txtDtVenda.setColumns(10);

		JPanel panelExcluir = new JPanel();
		panelExcluir.setBackground(SystemColor.menu);
		panelExcluir.setToolTipText("Excluir");
		tabbedPaneItCompra.addTab("Excluir", null, panelExcluir, null);
		panelExcluir.setLayout(null);

		JLabel lblNumVendaDel = new JLabel("N\u00FAmero da Venda: ");
		lblNumVendaDel.setBounds(10, 11, 106, 14);
		panelExcluir.add(lblNumVendaDel);

		txtNumVendaDel = new JTextField();
		txtNumVendaDel.setBounds(126, 8, 106, 20);
		panelExcluir.add(txtNumVendaDel);
		txtNumVendaDel.setColumns(10);

		tableDelete = new JTable();
		tableDelete.setBounds(10, 36, 343, 155);
		panelExcluir.add(tableDelete);

		JPanel panelPesquisa = new JPanel();
		panelPesquisa.setBackground(SystemColor.menu);
		panelPesquisa.setToolTipText("Pesquisar");
		tabbedPaneItCompra.addTab("Pesquisar", null, panelPesquisa, null);
		panelPesquisa.setLayout(null);

		JLabel lblNumVendaSearch = new JLabel("N\u00FAmero da Venda: ");
		lblNumVendaSearch.setBounds(10, 14, 106, 14);
		panelPesquisa.add(lblNumVendaSearch);

		txtNumVendaSearch = new JTextField();
		txtNumVendaSearch.setColumns(10);
		txtNumVendaSearch.setBounds(126, 11, 106, 20);
		panelPesquisa.add(txtNumVendaSearch);

		tableSearch = new JTable();
		tableSearch.setBounds(10, 39, 343, 152);
		panelPesquisa.add(tableSearch);

		JPanel panelListar = new JPanel();
		panelListar.setBackground(SystemColor.menu);
		panelListar.setLayout(null);
		tabbedPaneItCompra.addTab("Listar", null, panelListar, null);

		tableList = new JTable();
		tableList.setBounds(10, 191, 343, -179);
		panelListar.add(tableList);

	}
	private static final long serialVersionUID = 1L;
	private JTextField txtNumVenda;
	private JTextField txtCliente;
	private JTextField txtVendedor;
	private JTextField txtItVenda;
	private JTextField txtDtVenda;
	private JTable tableList;
	private JTextField txtNumVendaDel;
	private JTable tableDelete;
	private JTextField txtNumVendaSearch;
	private JTable tableSearch;

	public void mostraEssaTela() {
		setVisible(true);
	}

	public void fechaTela(){
		this.dispose();
	}
}
