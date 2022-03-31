package br.com.fiap;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número com até seis casas de milhar: "));
		
		int  primeiro = num1 / 1000;
		num1 = num1 % 1000;
		
		int segundo = num1 / 100;
		num1 = num1 % 100;
		
		int terceiro = num1 / 10;
		num1 = num1 % 10;
		
		int quarto = num1;
		
		System.out.println("Milhar: " + primeiro + "; Centena: " + segundo + "; Dezena: " + terceiro + "; Unidade: " + quarto);

	}

}
