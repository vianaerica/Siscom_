package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import view.TelaInicialMenu;

public class Splash extends JFrame{
	public Splash() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\_Faculdade\\LTPIII\\WorkspaceJava\\Siscom_\\Icones\\icons8-Processo-26.png"));
		setTitle("CARREGANDO...");
	}
	private static final long serialVersionUID = 1;

	public void mostraSplash(){
		JPanel content = (JPanel) getContentPane();
		content.setBackground(Color.gray);

		//Definir posição e tamanho da janela
		int width = 450;
		int height = 140;
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (screen.width - width) / 2;
		int y = (screen.height - height) / 2;
		setBounds(x, y, width, height);

		//Constrói o splash screen
		JLabel label = new JLabel(new ImageIcon("LogoSplash.png"));
		JLabel txt = new JLabel("Sistema Comercial. Copyright 2017, Viana Inc.", JLabel.CENTER);
		txt.setFont(new Font("Arial", Font.ITALIC, 10));
		content.add(label, BorderLayout.CENTER);
		content.add(txt, BorderLayout.SOUTH);
		Color cor = new Color(192, 192, 192, 192);
		content.setBorder(BorderFactory.createLineBorder(cor, 3));
		//Visibilidade
		setVisible(true);


		//Deixa splash na tela por 10s
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
		}
		setVisible(false);
	}

	public void showSplashAndExit() {
		TelaInicialMenu menu = new TelaInicialMenu();
		menu.setVisible(false);
		mostraSplash();
		this.dispose();
		menu.mostraMenu();
	}

}
