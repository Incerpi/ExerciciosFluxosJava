package br.com.fiap;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		int numero1 = Integer.valueOf(JOptionPane.showInputDialog("Digite o primeiro n�mero:"));
		
		int numero2 = Integer.valueOf(JOptionPane.showInputDialog("Digite o segundo n�mero: "));
	
		int soma = numero1 + numero2;
		
		int subtracao = numero1 - numero2;
		
		int multiplicacao = numero1 * numero2;
		
		double divisao = numero1/numero2;
		
		System.out.println("Soma: " + soma + "; subtra��o: " + subtracao + "; multiplica��o: " + 
		multiplicacao + "; divis�o: " + divisao + ";");

	}

}
