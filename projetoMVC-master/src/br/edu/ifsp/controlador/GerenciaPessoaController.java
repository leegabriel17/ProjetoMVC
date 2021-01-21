package br.edu.ifsp.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import br.edu.ifsp.dao.PessoaDAO;
import br.edu.ifsp.modelo.Pessoa;
import br.edu.ifsp.tela.FrameGerencia;

public class GerenciaPessoaController implements ActionListener {
	
	private FrameGerencia tela;
	private Pessoa modelo;
	private int i;
	
	public GerenciaPessoaController(FrameGerencia fg) {
		this.tela = fg;
		modelo = new Pessoa();
		this.tela.getBtnconsultar().addActionListener(this);
		this.tela.getBtneditar().addActionListener(this);
		this.tela.getBtnremover().addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == this.tela.getBtnconsultar()) {
			
			int i = Integer.parseInt(tela.getTxtInsiraOId().getText());
			
			PessoaDAO dao = new PessoaDAO();
			
			Pessoa p = dao.consultarPessoaPorId(i); 
			
			
			tela.getTxtNome().setText(p.getNome());
			tela.getTxtIdade().setText(""+p.getIdade());
			tela.setId(i);
		
			
			
		} else if(e.getSource() == this.tela.getBtneditar()) {
			i = this.tela.getId();
			
			modelo.setNome(this.tela.getTxtNome().getText());
			modelo.setIdade(Integer.parseInt(this.tela.getTxtIdade().getText()));
			modelo.setId(i);
			PessoaDAO dao = new PessoaDAO();
			dao.editarPessoaPorId(i, modelo);
			
		
			JOptionPane.showMessageDialog(null, "Pessoa atualizado com Sucesso");
			
		} else if(e.getSource() == this.tela.getBtnremover()) {
			i = this.tela.getId();
			PessoaDAO dao = new PessoaDAO();
			dao.removerPessoaPorId(i);
		
			JOptionPane.showMessageDialog(null, "Pessoa removido com Sucesso");
		}
	}
}
