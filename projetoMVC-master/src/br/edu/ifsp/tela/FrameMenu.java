package br.edu.ifsp.tela;


import java.awt.event.ActionEvent;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;


import br.edu.ifsp.controlador.GerenciaPessoaController;
import br.edu.ifsp.controlador.InserePessoaController;
import br.edu.ifsp.controlador.ListaPessoaController;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class FrameMenu extends JFrame {
	


	public FrameMenu() {
		

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mndados = new JMenu("Dados");
		menuBar.add(mndados);
		
		JMenuItem mntmInserir = new JMenuItem("Inserir");
		mntmInserir.addActionListener(this::abrirFrameInserir);
		mndados.add(mntmInserir);
		
		JMenuItem mntmGerencia = new JMenuItem("Gerenciar");
		mntmGerencia.addActionListener(this::abrirFrameGerencia);
		mndados.add(mntmGerencia);
		
		JMenuItem mntmListagem = new JMenuItem("Listar");
		mntmListagem.addActionListener(this::abrirFrameListagem);
		mndados.add(mntmListagem);
		
		JMenuItem mntmFechar = new JMenuItem("Fechar");
		mntmFechar.addActionListener(this::FecharFrame);
		mndados.add(mntmFechar);
		
	}
	
	private void abrirFrameInserir(ActionEvent e) {
		
        FrameInserir fi = new FrameInserir();
        InserePessoaController ipc = new InserePessoaController(fi);
        carregarFrame(fi);
    }
	private void carregarFrame(JFrame fi) {
		fi.setVisible(true);

    }
	private void abrirFrameGerencia(ActionEvent e) {
        FrameGerencia fg = new FrameGerencia();
        GerenciaPessoaController gpc = new GerenciaPessoaController(fg);
        carregarFrame(fg);
    }
	private void carregarFrame(FrameGerencia fg) {
		fg.setVisible(true);
 
    }
	private void abrirFrameListagem(ActionEvent e) {
        FrameLista fl = new FrameLista();
        ListaPessoaController lpc = new ListaPessoaController(fl);
        carregarFrame(fl);
    }
	private void carregarFrame(FrameLista fl) {
        fl.setVisible(true);

    }
	private void FecharFrame(ActionEvent e) {
        dispose();
    }
	
}
