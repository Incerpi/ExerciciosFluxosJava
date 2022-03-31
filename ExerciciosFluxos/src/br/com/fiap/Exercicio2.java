package br.com.fiap;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		int numero1 = Integer.valueOf(JOptionPane.showInputDialog("Digite um número:"));
		
		int numero2 = Integer.valueOf(JOptionPane.showInputDialog("Digite outro número:"));
		
		if (numero1%numero2 == 0) {
			System.out.println("Os números " + numero1 + " e " + numero2 + " são múltiplos");
			
		}else {
			System.out.println("Os números " + numero1 + " e " + numero2 + " NÃO são múltiplos");
			
		}

		
		

	}

}
