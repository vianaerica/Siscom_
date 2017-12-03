package view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MenuVenda extends JFrame {
	private static final long serialVersionUID = 1L;

	public MenuVenda() {
		setTitle("Jokenpo - Venda");
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\_Faculdade\\LTPIII\\WorkspaceJava\\Siscom_\\Icones\\icons8-M\u00E3o fazendo sinal de tesoura-64.png"));
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		setSize(new Dimension(444, 301));
		setLocationRelativeTo(null);

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
		menuBarVenda.add(mnProduto);

		JMenu mnCompra = new JMenu("Compra");
		menuBarVenda.add(mnCompra);

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
			public void mouseClicked(MouseEvent arg0) {
				TelaItCompraAction itcompra = new TelaItCompraAction();
				itcompra.mostraEssaTela();
				fecharMenu();
			}
		});
		mnCompra.add(mntmItemDaCompra);

		JMenu mnVenda = new JMenu("Venda");
		menuBarVenda.add(mnVenda);

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

		JLabel lblJokenpo = new JLabel("Sistema Comercial - Papelaria JOKENPO");
		lblJokenpo.setVerticalAlignment(SwingConstants.BOTTOM);
		lblJokenpo.setFont(new Font("Arial", Font.ITALIC, 10));
		lblJokenpo.setBounds(127, 244, 193, 13);
		getContentPane().add(lblJokenpo);

		JButton btnVenda = new JButton("");
		btnVenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaCompraAction tca = new TelaCompraAction();
				tca.mostraEssaTela();
				fecharMenu();
			}
		});
		btnVenda.setIcon(new ImageIcon("D:\\_Faculdade\\LTPIII\\WorkspaceJava\\Siscom_\\Icones\\icons8-Caixa registradora antiga-64.png"));
		btnVenda.setToolTipText("Compra");
		btnVenda.setBackground(Color.WHITE);
		btnVenda.setBounds(145, 32, 140, 90);
		getContentPane().add(btnVenda);

		JButton btnItemVenda = new JButton("");
		btnItemVenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaItCompraAction itca = new TelaItCompraAction();
				itca.mostraEssaTela();
				fecharMenu();
			}
		});
		btnItemVenda.setIcon(new ImageIcon("D:\\_Faculdade\\LTPIII\\WorkspaceJava\\Siscom_\\Icones\\icons8-C\u00F3digo de barras-50.png"));
		btnItemVenda.setToolTipText("Item da Venda");
		btnItemVenda.setBackground(Color.WHITE);
		btnItemVenda.setBounds(145, 145, 140, 90);
		getContentPane().add(btnItemVenda);

		JLabel lblVenda = new JLabel("Venda");
		lblVenda.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblVenda.setBounds(295, 71, 56, 14);
		getContentPane().add(lblVenda);

		JLabel lblItVenda1 = new JLabel("Item da ");
		lblItVenda1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblItVenda1.setBounds(295, 173, 88, 14);
		getContentPane().add(lblItVenda1);

		JLabel lblItVenda2 = new JLabel("Venda");
		lblItVenda2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblItVenda2.setBounds(300, 187, 46, 14);
		getContentPane().add(lblItVenda2);
	}

	public void mostraMenu(){
		setVisible(true);
	}
	public void fecharMenu() {
		this.dispose();
	}
}
