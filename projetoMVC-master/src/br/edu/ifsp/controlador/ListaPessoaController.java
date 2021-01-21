package br.edu.ifsp.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;

import br.edu.ifsp.dao.PessoaDAO;

import br.edu.ifsp.modelo.Pessoa;
import br.edu.ifsp.tela.FrameLista;

public class ListaPessoaController implements ActionListener {
	
	private FrameLista tela;
	
	public ListaPessoaController(FrameLista fl) {
		this.tela = fl;

		this.tela.getButtonBuscar().addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == this.tela.getButtonBuscar()) {		
			tela.mostrarPessoa(e);			
		
			//JOptionPane.showMessageDialog(null, "Pessoa consultada com Sucesso");
			
		}
	}

	 
}
