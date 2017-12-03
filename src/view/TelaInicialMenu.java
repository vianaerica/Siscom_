package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaInicialMenu extends JFrame {
	private static final long serialVersionUID = 1L;

	public TelaInicialMenu() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\_Faculdade\\LTPIII\\WorkspaceJava\\Siscom_\\Icones\\icons8-M\u00E3o fazendo sinal de pedra-64.png"));
		mostraMenu();
		setTitle("Jokenpo - Menu");
		getContentPane().setLayout(null);
		setSize(new Dimension(408, 296));
		setLocationRelativeTo(null);

		JPanel panelTelaInicial = new JPanel();
		panelTelaInicial.setBackground(Color.WHITE);
		panelTelaInicial.setBounds(0, 0, 399, 263);
		getContentPane().add(panelTelaInicial);
		panelTelaInicial.setLayout(null);

		JLabel lblSisComJokenpo = new JLabel("Sistema Comercial - Papelaria JOKENPO");
		lblSisComJokenpo.setBounds(115, 239, 193, 13);
		lblSisComJokenpo.setVerticalAlignment(SwingConstants.BOTTOM);
		lblSisComJokenpo.setFont(new Font("Arial", Font.ITALIC, 10));
		panelTelaInicial.add(lblSisComJokenpo);

		JButton btnPessoa = new JButton("");
		btnPessoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MenuPessoa mPessoa = new MenuPessoa();
				mPessoa.mostraEssaTela();
				fecharMenu();
			}
		});
		btnPessoa.setToolTipText("Pessoa");
		btnPessoa.setBackground(Color.WHITE);
		btnPessoa.setForeground(Color.WHITE);
		btnPessoa.setIcon(new ImageIcon("D:\\_Faculdade\\LTPIII\\WorkspaceJava\\Siscom_\\Icones\\icons8-Usu\u00E1rio homem com c\u00EDrculo-64.png"));
		btnPessoa.setBounds(110, 31, 63, 60);
		panelTelaInicial.add(btnPessoa);

		JLabel lblPessoa = new JLabel("Pessoa");
		lblPessoa.setBounds(120, 90, 49, 14);
		panelTelaInicial.add(lblPessoa);

		JButton btnCompra = new JButton("");
		btnCompra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuCompra mnc = new MenuCompra();
				mnc.mostraEssaTela();
				fecharMenu();
			}
		});
		btnCompra.setToolTipText("Compra");
		btnCompra.setForeground(Color.WHITE);
		btnCompra.setBackground(Color.WHITE);
		btnCompra.setIcon(new ImageIcon("D:\\_Faculdade\\LTPIII\\WorkspaceJava\\Siscom_\\Icones\\icons8-Comprar-48.png"));
		btnCompra.setBounds(256, 31, 63, 60);
		panelTelaInicial.add(btnCompra);

		JLabel lblCompra = new JLabel("Compra");
		lblCompra.setBounds(266, 90, 46, 14);
		panelTelaInicial.add(lblCompra);

		JButton btnVenda = new JButton("");
		btnVenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MenuVenda mVenda = new MenuVenda();
				mVenda.mostraMenu();
				fecharMenu();
			}
		});
		btnVenda.setToolTipText("Venda");
		btnVenda.setIcon(new ImageIcon("D:\\_Faculdade\\LTPIII\\WorkspaceJava\\Siscom_\\Icones\\icons8-Caixa registradora antiga-64.png"));
		btnVenda.setForeground(Color.WHITE);
		btnVenda.setBackground(Color.WHITE);
		btnVenda.setBounds(145, 108, 63, 60);
		panelTelaInicial.add(btnVenda);

		JLabel lblVenda = new JLabel("Venda");
		lblVenda.setBounds(162, 169, 46, 14);
		panelTelaInicial.add(lblVenda);

		JButton btnEstatistica = new JButton("");
		btnEstatistica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaEstatisticaAction tea = new TelaEstatisticaAction();
				tea.mostraEssaTela();
				fecharMenu();
			}
		});
		btnEstatistica.setToolTipText("Estat\u00EDstica");
		btnEstatistica.setIcon(new ImageIcon("D:\\_Faculdade\\LTPIII\\WorkspaceJava\\Siscom_\\Icones\\icons8-Futuros-64.png"));
		btnEstatistica.setForeground(Color.WHITE);
		btnEstatistica.setBackground(Color.WHITE);
		btnEstatistica.setBounds(214, 108, 63, 60);
		panelTelaInicial.add(btnEstatistica);

		JLabel lblEstatstca = new JLabel("Estat\u00EDstca");
		lblEstatstca.setBounds(218, 169, 63, 14);
		panelTelaInicial.add(lblEstatstca);

		JLabel lblImgBg = new JLabel("");
		lblImgBg.setIcon(new ImageIcon("D:\\_Faculdade\\LTPIII\\WorkspaceJava\\Siscom_\\Icones\\BG_Icons.png"));
		lblImgBg.setBackground(Color.WHITE);
		lblImgBg.setBounds(0, 0, 63, 261);
		panelTelaInicial.add(lblImgBg);

		JButton btnProduto = new JButton("");
		btnProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaProdutoAction prd = new TelaProdutoAction();
				prd.mostraEssaTela();
				fecharMenu();
			}
		});
		btnProduto.setIcon(new ImageIcon("D:\\_Faculdade\\LTPIII\\WorkspaceJava\\Siscom_\\Icones\\icons8-Produto-50.png"));
		btnProduto.setToolTipText("Produto");
		btnProduto.setForeground(Color.WHITE);
		btnProduto.setBackground(Color.WHITE);
		btnProduto.setBounds(183, 31, 63, 60);
		panelTelaInicial.add(btnProduto);

		JLabel lblProduto = new JLabel("Produto");
		lblProduto.setBounds(193, 90, 46, 14);
		panelTelaInicial.add(lblProduto);
	}

	public void mostraMenu(){
		setVisible(true);
	}

	public void fecharMenu(){
		this.dispose();
	}
}
