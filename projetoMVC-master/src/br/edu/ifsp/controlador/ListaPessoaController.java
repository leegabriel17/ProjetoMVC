package br.edu.ifsp.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
