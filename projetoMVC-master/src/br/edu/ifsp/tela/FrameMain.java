package br.edu.ifsp.tela;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class FrameMain extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameMain frame = new FrameMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrameMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 213, 194);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenu mnMenu = new JMenu("Menu");
		mnMenu.setBounds(0, 11, 82, 26);
		contentPane.add(mnMenu);
		
		JMenuItem mntmGerenciar = new JMenuItem("Gerenciar");
		mnMenu.add(mntmGerenciar);
		
		JMenuItem mntmInserir = new JMenuItem("Inserir");
		mnMenu.add(mntmInserir);
		
		JMenuItem mntmconsultar = new JMenuItem("consultar");
		mnMenu.add(mntmconsultar);
	}
}
