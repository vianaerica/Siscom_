package view;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuCompra extends JFrame {
	public MenuCompra() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\_Faculdade\\LTPIII\\WorkspaceJava\\Siscom_\\Icones\\icons8-M\u00E3o fazendo sinal de tesoura-64.png"));
		setTitle("Jokenpo - Compra");
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		setSize(new Dimension(444, 301));
		setLocationRelativeTo(null);

		JMenuBar menuBarCompra = new JMenuBar();
		menuBarCompra.setBackground(Color.WHITE);
		menuBarCompra.setBounds(0, 0, 434, 21);
		getContentPane().add(menuBarCompra);

		JMenu mnPessoa = new JMenu("Pessoa");
		menuBarCompra.add(mnPessoa);

		JMenuItem mntmCliente = new JMenuItem("Cliente");
		mntmCliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaClientesAction tca = new TelaClientesAction();
				tca.mostraTela();
				fecharMenu();
			}
		});
		mnPessoa.add(mntmCliente);

		JMenuItem mntmFornecedor = new JMenuItem("Fornecedor");
		mntmFornecedor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaFornecedorAction tfa = new TelaFornecedorAction();
				tfa.mostraEssaTela();
				fecharMenu();
			}
		});
		mnPessoa.add(mntmFornecedor);

		JMenuItem mntmVendedor = new JMenuItem("Vendedor");
		mntmVendedor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaVendedorAction tva = new TelaVendedorAction();
				tva.mostraEssaTela();
				fecharMenu();
			}
		});
		mnPessoa.add(mntmVendedor);

		JMenu mnProduto = new JMenu("Produto");
		mnProduto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaProdutoAction prd = new TelaProdutoAction();
				prd.mostraEssaTela();
				fecharMenu();
			}
		});
		menuBarCompra.add(mnProduto);

		JMenu mnCompra = new JMenu("Compra");
		menuBarCompra.add(mnCompra);

		JMenuItem mntmCompra = new JMenuItem("Compra");
		mntmCompra.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaCompraAction compra = new TelaCompraAction();
				compra.mostraEssaTela();
				fecharMenu();
			}
		});
		mnCompra.add(mntmCompra);

		JMenuItem mntmItemCompra = new JMenuItem("Item da Compra");
		mntmItemCompra.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaItCompraAction itca = new TelaItCompraAction();
				itca.mostraEssaTela();
				fecharMenu();
			}
		});
		mnCompra.add(mntmItemCompra);

		JMenu mnVenda = new JMenu("Venda");
		menuBarCompra.add(mnVenda);

		JMenuItem mntmVenda = new JMenuItem("Venda");
		mntmVenda.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaVendaAction tva = new TelaVendaAction();
				tva.mostraEssaTela();
				fecharMenu();
			}
		});
		mnVenda.add(mntmVenda);

		JMenuItem mntmItemVenda = new JMenuItem("Item da Venda");
		mntmItemVenda.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaItVendaAction itvenda = new TelaItVendaAction();
				itvenda.mostraEssaTela();
				fecharMenu();
			}
		});
		mnVenda.add(mntmItemVenda);

		JMenu mnEstatistica = new JMenu("Estat\u00EDsticas");
		mnEstatistica.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaEstatisticaAction tea = new TelaEstatisticaAction();
				tea.mostraEssaTela();
				fecharMenu();
			}
		});
		menuBarCompra.add(mnEstatistica);

		JMenu mnSair = new JMenu("Sair");
		mnSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		menuBarCompra.add(mnSair);

		JButton btnAdd = new JButton("");
		btnAdd.setEnabled(false);
		btnAdd.setIcon(new ImageIcon("D:\\_Faculdade\\LTPIII\\WorkspaceJava\\Siscom_\\Icones\\icons8-Mais-26.png"));
		btnAdd.setToolTipText("Adicionar");
		btnAdd.setBackground(Color.WHITE);
		btnAdd.setBounds(5, 45, 30, 30);
		getContentPane().add(btnAdd);

		JButton btnDelete = new JButton("");
		btnDelete.setEnabled(false);
		btnDelete.setIcon(new ImageIcon("D:\\_Faculdade\\LTPIII\\WorkspaceJava\\Siscom_\\Icones\\icons8-Apagar Arquivo-24.png"));
		btnDelete.setToolTipText("Excluir");
		btnDelete.setBackground(Color.WHITE);
		btnDelete.setBounds(5, 74, 30, 30);
		getContentPane().add(btnDelete);

		JButton btnSearch = new JButton("");
		btnSearch.setEnabled(false);
		btnSearch.setIcon(new ImageIcon("D:\\_Faculdade\\LTPIII\\WorkspaceJava\\Siscom_\\Icones\\icons8-Pesquisa Google na Web-24.png"));
		btnSearch.setToolTipText("Pesquisar");
		btnSearch.setBackground(Color.WHITE);
		btnSearch.setBounds(5, 103, 30, 30);
		getContentPane().add(btnSearch);

		JButton btnList = new JButton("");
		btnList.setEnabled(false);
		btnList.setIcon(new ImageIcon("D:\\_Faculdade\\LTPIII\\WorkspaceJava\\Siscom_\\Icones\\icons8-Lista-24.png"));
		btnList.setToolTipText("Listar");
		btnList.setBackground(Color.WHITE);
		btnList.setBounds(5, 132, 30, 30);
		getContentPane().add(btnList);

		JLabel lblAcoes = new JLabel("A\u00E7\u00F5es");
		lblAcoes.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAcoes.setBackground(Color.WHITE);
		lblAcoes.setBounds(5, 28, 46, 14);
		getContentPane().add(lblAcoes);

		JButton btnVenda = new JButton("");
		btnVenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaVendaAction tva = new TelaVendaAction();
				tva.mostraEssaTela();
				fecharMenu();
			}
		});
		btnVenda.setIcon(new ImageIcon("D:\\_Faculdade\\LTPIII\\WorkspaceJava\\Siscom_\\Icones\\icons8-Comprar-48.png"));
		btnVenda.setToolTipText("Compra");
		btnVenda.setBackground(Color.WHITE);
		btnVenda.setBounds(145, 32, 140, 90);
		getContentPane().add(btnVenda);

		JButton btnItemVenda = new JButton("");
		btnItemVenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaItVendaAction itvenda = new TelaItVendaAction();
				itvenda.mostraEssaTela();
				fecharMenu();
			}
		});
		btnItemVenda.setIcon(new ImageIcon("D:\\_Faculdade\\LTPIII\\WorkspaceJava\\Siscom_\\Icones\\icons8-Etiquetas Filled-50.png"));
		btnItemVenda.setToolTipText("Item da Venda");
		btnItemVenda.setBackground(Color.WHITE);
		btnItemVenda.setBounds(145, 145, 140, 90);
		getContentPane().add(btnItemVenda);

		JLabel lblCompra = new JLabel("Compra");
		lblCompra.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCompra.setBounds(295, 71, 56, 14);
		getContentPane().add(lblCompra);

		JLabel lblItCompra1 = new JLabel("Item da ");
		lblItCompra1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblItCompra1.setBounds(295, 173, 88, 14);
		getContentPane().add(lblItCompra1);

		JLabel lblItCompra2 = new JLabel("Compra");
		lblItCompra2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblItCompra2.setBounds(295, 187, 46, 14);
		getContentPane().add(lblItCompra2);

		JLabel label = new JLabel("Sistema Comercial - Papelaria JOKENPO");
		label.setVerticalAlignment(SwingConstants.BOTTOM);
		label.setFont(new Font("Arial", Font.ITALIC, 10));
		label.setBounds(127, 244, 193, 13);
		getContentPane().add(label);
	}

	public void mostraEssaTela(){
		setVisible(true);
	}
	public void fecharMenu(){
		this.dispose();
	}
	private static final long serialVersionUID = 1L;
}
