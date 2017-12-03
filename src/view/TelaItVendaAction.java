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
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.SystemColor;
import javax.swing.JTextField;

import controller.Comercial;

import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaItVendaAction extends JFrame {
	public TelaItVendaAction() {
		getContentPane().setBackground(Color.WHITE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\_Faculdade\\LTPIII\\Icones\\icons8-C\u00F3digo de barras-50.png"));
		setTitle("Jokenpo - Item da Venda");
		getContentPane().setLayout(null);
		setSize(new Dimension(444, 301));
		setLocationRelativeTo(null);

		JMenuBar menuBarItVenda = new JMenuBar();
		menuBarItVenda.setBounds(0, 0, 434, 21);
		getContentPane().add(menuBarItVenda);

		JMenu mnPessoa = new JMenu("Pessoa");
		menuBarItVenda.add(mnPessoa);

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
		menuBarItVenda.add(mnProduto);

		JMenu mnCompra = new JMenu("Compra");
		menuBarItVenda.add(mnCompra);

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
		menuBarItVenda.add(mnVenda);

		JMenuItem mntmVenda = new JMenuItem("Venda");
		mnVenda.add(mntmVenda);

		JMenuItem mntmItemDaVenda = new JMenuItem("Item da Venda");
		mntmItemDaVenda.setEnabled(false);
		mnVenda.add(mntmItemDaVenda);

		JMenu mnEstatsticas = new JMenu("Estat\u00EDsticas");
		menuBarItVenda.add(mnEstatsticas);

		JMenu mnSair = new JMenu("Sair");
		mnSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(DISPOSE_ON_CLOSE);
			}
		});
		menuBarItVenda.add(mnSair);

		JButton btnAdd = new JButton("");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Comercial com = new Comercial();			
			}
		});
		btnAdd.setToolTipText("Adicionar");
		btnAdd.setBackground(Color.WHITE);
		btnAdd.setIcon(new ImageIcon("D:\\_Faculdade\\LTPIII\\Icones\\icons8-Mais-26.png"));
		btnAdd.setBounds(5, 45, 30, 27);
		getContentPane().add(btnAdd);

		JButton btnDelete = new JButton("");
		btnDelete.setEnabled(false);
		btnDelete.setBackground(Color.WHITE);
		btnDelete.setToolTipText("Excluir");
		btnDelete.setIcon(new ImageIcon("D:\\_Faculdade\\LTPIII\\Icones\\icons8-Apagar Arquivo-24.png"));
		btnDelete.setBounds(5, 71, 30, 27);
		getContentPane().add(btnDelete);

		JButton btnPesquisa = new JButton("");
		btnPesquisa.setEnabled(false);
		btnPesquisa.setToolTipText("Pesquisar");
		btnPesquisa.setIcon(new ImageIcon("D:\\_Faculdade\\LTPIII\\Icones\\icons8-Pesquisa Google na Web-24.png"));
		btnPesquisa.setBackground(Color.WHITE);
		btnPesquisa.setBounds(5, 97, 30, 27);
		getContentPane().add(btnPesquisa);

		JButton btnList = new JButton("");
		btnList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Comercial com = new Comercial();
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

		JLabel lblProduto = new JLabel("Produto: ");
		lblProduto.setBounds(10, 27, 57, 14);
		panelCadastrar.add(lblProduto);

		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setBounds(10, 79, 75, 14);
		panelCadastrar.add(lblQuantidade);

		JLabel lblValorVenda = new JLabel("Valor da Venda:");
		lblValorVenda.setBounds(10, 138, 98, 14);
		panelCadastrar.add(lblValorVenda);

		txtProdutoCad = new JTextField();
		txtProdutoCad.setBounds(77, 24, 123, 20);
		panelCadastrar.add(txtProdutoCad);
		txtProdutoCad.setColumns(10);

		txtQuantidadeCad = new JTextField();
		txtQuantidadeCad.setBounds(114, 76, 86, 20);
		panelCadastrar.add(txtQuantidadeCad);
		txtQuantidadeCad.setColumns(10);

		txtValorVendaCad = new JTextField();
		txtValorVendaCad.setBounds(114, 135, 86, 20);
		panelCadastrar.add(txtValorVendaCad);
		txtValorVendaCad.setColumns(10);


		JPanel panelListar = new JPanel();
		panelListar.setLayout(null);
		tabbedPaneItCompra.addTab("Listar", null, panelListar, null);

		tableList = new JTable();
		tableList.setBounds(346, 186, -335, -179);
		panelListar.add(tableList);


	}
	private static final long serialVersionUID = 1L;
	private JTextField txtProdutoCad;
	private JTextField txtQuantidadeCad;
	private JTextField txtValorVendaCad;
	private JTable tableList;

	public void mostraEssaTela() {
		setVisible(true);
	}

	public void fechaTela(){
		this.dispose();
	}
}
