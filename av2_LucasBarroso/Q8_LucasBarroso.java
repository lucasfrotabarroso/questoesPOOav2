package av2_LucasBarroso;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Q8_LucasBarroso implements ActionListener {
	
	private int numeroParaAdivinhar;
	private int numeroDeTentativas;
	private JFrame frame;
	private JPanel painel;
	private JButton[] botoes;
	private JTextField textField;
	
	public Q8_LucasBarroso () {
		numeroParaAdivinhar = (int)(Math.random()* 20 + 1);
		numeroDeTentativas = 0;
	
		frame = new JFrame("jogo de adivinhacao");//criei um objeto JFRAME(classe que cria uma janela de app com titulo,botoes de minimizar e etc
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		painel = new JPanel();
		painel.setLayout(new GridLayout(5,4));
		
		botoes = new JButton[20];
		for(int i = 0; i<20 ;i++) {
			botoes[i] = new JButton(Integer.toString(i+1)); //cria o botao
			botoes[i].addActionListener(this);
			painel.add(botoes[i]);//vai adicionar o botao criado  para essa (this) lista
			
		}
		textField = new JTextField("Tentativa 1"); //CRIA O TEXTO
		textField.setEditable(false); //DIZ QUE O TEXTO NAO E EDITAVEL
		frame.add(textField,BorderLayout.NORTH); //POSICIONA O TEXTO NO NORTE DA TELA
		
		frame.add(painel,BorderLayout.CENTER); //POSICIONA O PAINE COM BOTOES NO CENTRO DA TELA
		frame.pack();
		frame.setVisible(true);  
		//Juntos, esses dois métodos fazem com que o JFrame seja exibido na tela com o tamanho apropriado e todos os seus componentes visíveis.
						
	}
	public void actionPerformed (ActionEvent e) {
		numeroDeTentativas++;
		textField.setText("Tentativa " + numeroDeTentativas);
		
		JButton botao = (JButton)e.getSource();
		int tentativa = Integer.parseInt(botao.getText());
		
		if (tentativa == numeroParaAdivinhar) {
			JOptionPane.showMessageDialog(frame,"Parabéns, você acertou!", "Sucesso",JOptionPane.INFORMATION_MESSAGE);
	
		}
		else {
			JOptionPane.showMessageDialog(frame,"Numero errado, tente novamente!", "Erro",JOptionPane.ERROR_MESSAGE);
		}
		if (numeroDeTentativas == 5 ) {
            JOptionPane.showMessageDialog(frame, "Você usou todas as  tentativas. O número era " + numeroParaAdivinhar + ".", "Fim de Jogo", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);

		}
	}
	
	public static void main(String[] args) {
        Q8_LucasBarroso jogo = new Q8_LucasBarroso();
    }

   
}


	
