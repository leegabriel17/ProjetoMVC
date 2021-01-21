package br.edu.ifsp.tela;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import br.edu.ifsp.dao.PessoaDAO;
import br.edu.ifsp.modelo.Pessoa;


public class FrameLista extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JPanel panel;
    
    private JTable table;
    private DefaultTableModel defaultModel;
    private JScrollPane scroll;
    private JButton buttonBuscar;
    private JButton buttonFechar;
 
    
    
    public FrameLista() {
        criarComponentes();
        configurarJanela();
    }
    
    private void criarComponentes() {
        panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Listagem de Pessoas"));
        
        defaultModel = new DefaultTableModel();
        table = new JTable();
        table.setModel(defaultModel);
        table.setFillsViewportHeight(true);
       
        defaultModel.addColumn("Id da Pessoa");
        defaultModel.addColumn("Nome Completo");
        defaultModel.addColumn("Idade");
        
        
        scroll = new JScrollPane();
        scroll.setViewportView(table);

        scroll.setPreferredSize(new Dimension(600, 500));
       
        buttonBuscar = new JButton("Mostrar");
        buttonBuscar.setBounds(29, 190, 68, 23);
        getContentPane().add(buttonBuscar);
        
        buttonFechar = new JButton("Fechar");
        buttonFechar.setBounds(29, 190, 68, 23);
        getContentPane().add(buttonFechar);
        
        panel.add(buttonBuscar);
        panel.add(buttonFechar);
        panel.add(scroll);
        add(panel);
    }
    
    private void configurarJanela() {
        setVisible(true);

        pack();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

	public JButton getButtonBuscar() {
		return buttonBuscar;
	}

	public void setButtonBuscar(JButton buttonBuscar) {
		this.buttonBuscar = buttonBuscar;
	}

	public JButton getButtonFechar() {
		return buttonFechar;
	}

	public void setButtonFechar(JButton buttonFechar) {
		this.buttonFechar = buttonFechar;
	}
    
    
	public void mostrarPessoa(ActionEvent e) {
		defaultModel.setRowCount(0);
		defaultModel.setNumRows(0);
        PessoaDAO pessoaDao = new PessoaDAO();
        List<Pessoa> pessoas = pessoaDao.consultarTodos();
        for(Pessoa p: pessoas) {

        	Object[] array = {p.getId(), p.getNome(), p.getIdade()};
        	defaultModel.addRow(array);
        }
        
    }
    

	
}
