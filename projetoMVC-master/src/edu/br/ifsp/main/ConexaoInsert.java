package edu.br.ifsp.main;

import java.util.ArrayList;

import br.edu.ifsp.controlador.InserePessoaController;
import br.edu.ifsp.dao.PessoaDAO;
import br.edu.ifsp.modelo.Pessoa;
import br.edu.ifsp.tela.FrameInserir;

public class ConexaoInsert {

	public static void main(String[] args)  {
		
			// Criado um modelo
			/*Pessoa pessoa = new Pessoa();
			pessoa.setNome("Jose Alfredo");
			pessoa.setIdade(12);
			
			PessoaDAO dao = new PessoaDAO();
			dao.salvarPessoa(pessoa);
			
			PessoaDAO dao = new PessoaDAO();
			ArrayList<Pessoa> lista = dao.consultarTodos();
			for(Pessoa p : lista) {
				System.out.println(p.getId() + " " + p.getNome() + " " + p.getIdade());
			}*/
		
			FrameInserir fp = new FrameInserir();
			InserePessoaController ipc = new InserePessoaController(fp);
			fp.setVisible(true);
		
	}

}
