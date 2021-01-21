package edu.br.ifsp.main;


import br.edu.ifsp.tela.FrameMenu;



public class ConexaoInsert {

	public static void main(String[] args)  {
		
			
			javax.swing.SwingUtilities.invokeLater(new Runnable() 
	        {
	            public void run() 
	            {
	                FrameMenu fm = new FrameMenu();
	                fm.setVisible(true);
	            }
	        });
	}

}
