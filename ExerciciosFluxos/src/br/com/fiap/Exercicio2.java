package br.com.fiap;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		int numero1 = Integer.valueOf(JOptionPane.showInputDialog("Digite um n�mero:"));
		
		int numero2 = Integer.valueOf(JOptionPane.showInputDialog("Digite outro n�mero:"));
		
		if (numero1%numero2 == 0) {
			System.out.println("Os n�meros " + numero1 + " e " + numero2 + " s�o m�ltiplos");
			
		}else {
			System.out.println("Os n�meros " + numero1 + " e " + numero2 + " N�O s�o m�ltiplos");
			
		}

		
		

	}

}
