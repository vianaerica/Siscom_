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
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaItCompraAction extends JFrame{
	public TelaItCompraAction() {
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);

		JMenuBar menuBarItCompra = new JMenuBar();
		menuBarItCompra.setBounds(0, 0, 428, 21);
		menuBarItCompra.setBackground(Color.WHITE);
		getContentPane().add(menuBarItCompra);

		JMenu mnPessoa = new JMenu("Pessoa");
		menuBarItCompra.add(mnPessoa);

		JMenuItem mntmCliente = new JMenuItem("Cliente");
		mntmCliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaClientesAction tca = new TelaClientesAction();
				tca.mostraTela();
				fechaTelaItC();
			}
		});
		mnPessoa.add(mntmCliente);

		JMenuItem mntmFornecedor = new JMenuItem("Fornecedor");
		mntmFornecedor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaFornecedorAction tfa = new TelaFornecedorAction();
				tfa.mostraEssaTela();
				fechaTelaItC();
			}
		});
		mnPessoa.add(mntmFornecedor);

		JMenuItem mntmVendedor = new JMenuItem("Vendedor");
		mntmVendedor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaVendedorAction tva = new TelaVendedorAction();
				tva.mostraEssaTela();
				fechaTelaItC();
			}
		});
		mnPessoa.add(mntmVendedor);

		JMenu mnProduto = new JMenu("Produto");
		menuBarItCompra.add(mnProduto);

		JMenu mnCompra = new JMenu("Compra");
		menuBarItCompra.add(mnCompra);

		JMenuItem mntmCompra = new JMenuItem("Compra");
		mntmCompra.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaCompraAction compra = new TelaCompraAction();
				compra.mostraEssaTela();
				fechaTelaItC();
			}
		});
		mnCompra.add(mntmCompra);

		JMenuItem mntmItCompra = new JMenuItem("Item da Compra");
		mntmItCompra.setEnabled(false);
		mnCompra.add(mntmItCompra);

		JMenu mnVenda = new JMenu("Venda");
		menuBarItCompra.add(mnVenda);

		JMenuItem mntmVenda = new JMenuItem("Venda");
		mnVenda.add(mntmVenda);

		JMenuItem mntmItVenda = new JMenuItem("Item da Venda");
		mnVenda.add(mntmItVenda);

		JMenu mnEstatisticas = new JMenu("Estat\u00EDsticas");
		menuBarItCompra.add(mnEstatisticas);

		JMenu mnSair = new JMenu("Sair");
		mnSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		menuBarItCompra.add(mnSair);

		JButton btnAdd = new JButton("");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Comercial com = new Comercial();
			}
		});
		btnAdd.setIcon(new ImageIcon("D:\\_Faculdade\\LTPIII\\Icones\\icons8-Mais-26.png"));
		btnAdd.setToolTipText("Adicionar");
		btnAdd.setBackground(Color.WHITE);
		btnAdd.setBounds(5, 45, 30, 27);
		getContentPane().add(btnAdd);

		JButton btnDelete = new JButton("");
		btnDelete.setEnabled(false);
		btnDelete.setIcon(new ImageIcon("D:\\_Faculdade\\LTPIII\\Icones\\icons8-Apagar Arquivo-24.png"));
		btnDelete.setToolTipText("Excluir");
		btnDelete.setBackground(Color.WHITE);
		btnDelete.setBounds(5, 71, 30, 27);
		getContentPane().add(btnDelete);

		JButton btnSearch = new JButton("");
		btnSearch.setEnabled(false);
		btnSearch.setIcon(new ImageIcon("D:\\_Faculdade\\LTPIII\\Icones\\icons8-Pesquisa Google na Web-24.png"));
		btnSearch.setToolTipText("Pesquisar");
		btnSearch.setBackground(Color.WHITE);
		btnSearch.setBounds(5, 97, 30, 27);
		getContentPane().add(btnSearch);

		JButton btnList = new JButton("");
		btnList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Comercial com = new Comercial();
			}
		});
		btnList.setIcon(new ImageIcon("D:\\_Faculdade\\LTPIII\\Icones\\icons8-Lista-24.png"));
		btnList.setToolTipText("Listar");
		btnList.setBackground(Color.WHITE);
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

		txtProduto = new JTextField();
		txtProduto.setBounds(119, 24, 86, 20);
		panelCadastrar.add(txtProduto);
		txtProduto.setColumns(10);

		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setBounds(10, 79, 75, 14);
		panelCadastrar.add(lblQuantidade);

		txtQtdCompra = new JTextField();
		txtQtdCompra.setBounds(119, 76, 86, 20);
		panelCadastrar.add(txtQtdCompra);
		txtQtdCompra.setColumns(10);

		JLabel lblValorCompra = new JLabel("Valor da Compra:");
		lblValorCompra.setBounds(10, 138, 98, 14);
		panelCadastrar.add(lblValorCompra);

		txtValorCompra = new JTextField();
		txtValorCompra.setBounds(119, 135, 86, 20);
		panelCadastrar.add(txtValorCompra);
		txtValorCompra.setColumns(10);

		/*JPanel panelExcluir = new JPanel();
		panelExcluir.setLayout(null);
		panelExcluir.setBackground(SystemColor.menu);
		tabbedPaneItCompra.addTab("New tab", null, panelExcluir, null);

		tableDel = new JTable();
		tableDel.setBounds(354, 191, -345, -146);
		panelExcluir.add(tableDel);
		 */

		JPanel panelListar = new JPanel();
		panelListar.setLayout(null);
		tabbedPaneItCompra.addTab("Listar", null, panelListar, null);

		tableItCompra = new JTable();
		tableItCompra.setBounds(345, 194, -334, -183);
		panelListar.add(tableItCompra);
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\_Faculdade\\LTPIII\\Icones\\icons8-Etiqueta de pre\u00E7o-64.png"));
		setTitle("Jokenpo - Item da Compra");
		setSize(new Dimension(444, 301));
		setLocationRelativeTo(null);


	}

	public void mostraEssaTela(){
		setVisible(true);
	}
	public void fechaTelaItC(){
		this.dispose();
	}
	private static final long serialVersionUID = 1L;
	private JTable tableItCompra;
	private JTextField txtProduto;
	private JTextField txtQtdCompra;
	private JTextField txtValorCompra;
}
