package br.edu.ifsp.tela;




import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class FrameGerencia extends JFrame {


	private JTextField txtInsiraOId;
	private JTextField txtNome;
	private JTextField txtIdade;
	private JButton btnconsultar;
	private JButton btneditar;
	private JButton btnremover;
	private int id;
	
	public FrameGerencia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 321, 265);
		
		setContentPane(getContentPane());
		getContentPane().setLayout(null);
		
		btnconsultar = new JButton("Consultar");
		btnconsultar.setBounds(107, 28, 95, 23);
		getContentPane().add(btnconsultar);
		
		txtInsiraOId = new JTextField();
		txtInsiraOId.setBounds(23, 29, 74, 20);
		getContentPane().add(txtInsiraOId);
		txtInsiraOId.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setBounds(23, 108, 231, 23);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		txtIdade = new JTextField();
		txtIdade.setBounds(23, 156, 102, 23);
		getContentPane().add(txtIdade);
		txtIdade.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome Completo");
		lblNewLabel.setBounds(23, 93, 102, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Idade");
		lblNewLabel_1.setBounds(23, 142, 48, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Insira o Id da Pessoa Desejada");
		lblNewLabel_2.setBounds(23, 11, 153, 14);
		getContentPane().add(lblNewLabel_2);
		
		btneditar = new JButton("Editar");
		btneditar.setBounds(29, 190, 68, 23);
		getContentPane().add(btneditar);
		
		btnremover = new JButton("Remover");
		btnremover.setBounds(186, 190, 93, 23);
		getContentPane().add(btnremover);
		
		
		
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public JButton getBtneditar() {
		return btneditar;
	}

	public void setBtneditar(JButton btneditar) {
		this.btneditar = btneditar;
	}

	public JButton getBtnremover() {
		return btnremover;
	}

	public void setBtnremover(JButton btnremover) {
		this.btnremover = btnremover;
	}

	public JButton getBtnconsultar() {
		return btnconsultar;
	}

	public void setBtnconsultar(JButton btnconsultar) {
		this.btnconsultar = btnconsultar;
	}

	public JTextField getTxtInsiraOId() {
		
		return txtInsiraOId;
	}

	public void setTxtInsiraOId(JTextField txtInsiraOId) {
		this.txtInsiraOId = txtInsiraOId;
		
	}

	public JTextField getTxtNome() {
		return txtNome;
	}

	public void setTxtNome(JTextField txtNome) {
		this.txtNome = txtNome;
	}

	public JTextField getTxtIdade() {
		return txtIdade;
	}

	public void setTxtIdade(JTextField txtIdade) {
		this.txtIdade = txtIdade;
	}
	
}
