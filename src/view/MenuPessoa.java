package view;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import view.TelaClientesAction;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.SwingConstants;

public class MenuPessoa extends JFrame {
	private static final long serialVersionUID = 1L;

	public MenuPessoa() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\_Faculdade\\LTPIII\\WorkspaceJava\\Siscom_\\Icones\\icons8-M\u00E3o fazendo sinal de tesoura-64.png"));
		setTitle("Jokenpo - Pessoa");
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		setSize(new Dimension(444, 301));
		setLocationRelativeTo(null); //abrir no meio da tela

		JMenuBar menuBarPessoa = new JMenuBar();
		menuBarPessoa.setBounds(0, 0, 434, 21);
		getContentPane().add(menuBarPessoa);

		JMenu mnPessoa = new JMenu("Pessoa");
		menuBarPessoa.add(mnPessoa);

		JMenuItem mntmCliente = new JMenuItem("Cliente");
		mntmCliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
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
			public void mouseClicked(MouseEvent arg0) {
				TelaProdutoAction tpa = new TelaProdutoAction();
				tpa.mostraEssaTela();
				fecharMenu();
			}
		});
		menuBarPessoa.add(mnProduto);

		JMenu mnCompra = new JMenu("Compra");
		menuBarPessoa.add(mnCompra);

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

		JMenuItem mntmItemDaCompra = new JMenuItem("Item da Compra");
		mntmItemDaCompra.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaItCompraAction itcompra = new TelaItCompraAction();
				itcompra.mostraEssaTela();
				fecharMenu();
			}
		});
		mnCompra.add(mntmItemDaCompra);

		JMenu mnVenda = new JMenu("Venda");
		menuBarPessoa.add(mnVenda);

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

		JMenuItem mntmItemDaVenda = new JMenuItem("Item da Venda");
		mntmItemDaVenda.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaItVendaAction itvenda = new TelaItVendaAction();
				itvenda.mostraEssaTela();
				fecharMenu();
			}
		});
		mnVenda.add(mntmItemDaVenda);

		JMenu mnEstatsticas = new JMenu("Estat\u00EDsticas");
		mnEstatsticas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaEstatisticaAction tea = new TelaEstatisticaAction();
				tea.mostraEssaTela();
				fecharMenu();
			}
		});
		menuBarPessoa.add(mnEstatsticas);

		JMenu mnSair = new JMenu("Sair");
		mnSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(DISPOSE_ON_CLOSE);
			}
		});
		menuBarPessoa.add(mnSair);

		JButton btnCliente = new JButton("");
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaClientesAction tca = new TelaClientesAction();
				tca.mostraTela();
				fecharMenu();
			}
		});
		btnCliente.setToolTipText("Cliente");
		btnCliente.setIcon(new ImageIcon("D:\\_Faculdade\\LTPIII\\WorkspaceJava\\Siscom_\\Icones\\icons8-Fila-64.png"));
		btnCliente.setBackground(Color.WHITE);
		btnCliente.setBounds(168, 26, 90, 65);
		getContentPane().add(btnCliente);

		JButton btnFornecedor = new JButton("");
		btnFornecedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaFornecedorAction tfa = new TelaFornecedorAction();
				tfa.mostraEssaTela();
				fecharMenu();
			}
		});
		btnFornecedor.setToolTipText("Fornecedor");
		btnFornecedor.setIcon(new ImageIcon("D:\\_Faculdade\\LTPIII\\WorkspaceJava\\Siscom_\\Icones\\icons8-Funcion\u00E1rio da alf\u00E2ndega-64.png"));
		btnFornecedor.setBackground(Color.WHITE);
		btnFornecedor.setBounds(168, 97, 90, 65);
		getContentPane().add(btnFornecedor);

		JButton btnVendedor = new JButton("");
		btnVendedor.setBackground(Color.WHITE);
		btnVendedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaVendedorAction tva = new TelaVendedorAction();
				tva.mostraEssaTela();
				fecharMenu();
			}
		});
		btnVendedor.setToolTipText("Vendedor");
		btnVendedor.setIcon(new ImageIcon("D:\\_Faculdade\\LTPIII\\WorkspaceJava\\Siscom_\\Icones\\icons8-Gerente-64.png"));
		btnVendedor.setBounds(168, 168, 90, 65);
		getContentPane().add(btnVendedor);

		JButton btnAdd = new JButton("");
		btnAdd.setEnabled(false);
		btnAdd.setToolTipText("Adicionar");
		btnAdd.setBackground(Color.WHITE);
		btnAdd.setIcon(new ImageIcon("D:\\_Faculdade\\LTPIII\\WorkspaceJava\\Siscom_\\Icones\\icons8-Mais-26.png"));
		btnAdd.setBounds(5, 45, 30, 27);
		getContentPane().add(btnAdd);

		JButton btnDelete = new JButton("");
		btnDelete.setEnabled(false);
		btnDelete.setBackground(Color.WHITE);
		btnDelete.setToolTipText("Excluir");
		btnDelete.setIcon(new ImageIcon("D:\\_Faculdade\\LTPIII\\WorkspaceJava\\Siscom_\\Icones\\icons8-Apagar Arquivo-24.png"));
		btnDelete.setBounds(5, 71, 30, 27);
		getContentPane().add(btnDelete);

		JButton btnPesquisa = new JButton("");
		btnPesquisa.setEnabled(false);
		btnPesquisa.setToolTipText("Pesquisar");
		btnPesquisa.setIcon(new ImageIcon("D:\\_Faculdade\\LTPIII\\WorkspaceJava\\Siscom_\\Icones\\icons8-Pesquisa Google na Web-24.png"));
		btnPesquisa.setBackground(Color.WHITE);
		btnPesquisa.setBounds(5, 97, 30, 27);
		getContentPane().add(btnPesquisa);

		JButton btnList = new JButton("");
		btnList.setEnabled(false);
		btnList.setToolTipText("Listar");
		btnList.setBackground(Color.WHITE);
		btnList.setIcon(new ImageIcon("D:\\_Faculdade\\LTPIII\\WorkspaceJava\\Siscom_\\Icones\\icons8-Lista-24.png"));
		btnList.setBounds(5, 123, 30, 27);
		getContentPane().add(btnList);

		JLabel lblAcoes = new JLabel("A\u00E7\u00F5es");
		lblAcoes.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAcoes.setBackground(Color.WHITE);
		lblAcoes.setBounds(5, 28, 46, 14);
		getContentPane().add(lblAcoes);

		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setBounds(268, 45, 46, 14);
		getContentPane().add(lblCliente);

		JLabel lblFornecedor = new JLabel("Fornecedor");
		lblFornecedor.setBounds(268, 110, 71, 14);
		getContentPane().add(lblFornecedor);

		JLabel lblVendedor = new JLabel("Vendedor");
		lblVendedor.setBounds(268, 181, 71, 14);
		getContentPane().add(lblVendedor);

		JLabel lblJokenpo = new JLabel("Sistema Comercial - Papelaria JOKENPO");
		lblJokenpo.setVerticalAlignment(SwingConstants.BOTTOM);
		lblJokenpo.setFont(new Font("Arial", Font.ITALIC, 10));
		lblJokenpo.setBounds(127, 244, 193, 13);
		getContentPane().add(lblJokenpo);
	}

	public void mostraEssaTela(){
		setVisible(true);
	}
	public void fecharMenu(){
		this.dispose();
	}
}
