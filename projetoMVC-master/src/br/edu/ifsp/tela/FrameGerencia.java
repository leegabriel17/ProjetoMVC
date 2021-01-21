package br.edu.ifsp.tela;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;

public class FrameGerecia extends JFrame {

	private JPanel contentPane;
	private JTextField txtInsiraOId;
	private JTextField txtNome;
	private JTextField txtIdade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameGerecia frame = new FrameGerecia();
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
	public FrameGerecia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 321, 265);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConsultar.setBounds(107, 28, 89, 23);
		contentPane.add(btnConsultar);
		
		txtInsiraOId = new JTextField();
		txtInsiraOId.setBounds(23, 29, 74, 20);
		contentPane.add(txtInsiraOId);
		txtInsiraOId.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setBounds(23, 108, 231, 23);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtIdade = new JTextField();
		txtIdade.setBounds(23, 156, 102, 23);
		contentPane.add(txtIdade);
		txtIdade.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome Completo");
		lblNewLabel.setBounds(23, 93, 102, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Idade");
		lblNewLabel_1.setBounds(23, 142, 48, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Insira o Id da Pessoa Desejada");
		lblNewLabel_2.setBounds(23, 11, 153, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(29, 190, 68, 23);
		contentPane.add(btnEditar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(107, 190, 69, 23);
		contentPane.add(btnSalvar);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.setBounds(186, 190, 83, 23);
		contentPane.add(btnRemover);
	}
}
