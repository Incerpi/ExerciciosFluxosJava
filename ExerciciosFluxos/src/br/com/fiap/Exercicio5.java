package br.com.fiap;

import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {
		int positivo = 0;
		int negativo = 0;
		int zeros = 0;
		
		for (int i = 0; i < 5; i++) {
			int num = Integer.valueOf(JOptionPane.showInputDialog("Digite um número: "));
			
			if (num > 0) {
				positivo++;
				
			}else if (num < 0) {
				negativo++;
				
			}else {
				zeros++;
				
			}
				
		System.out.println(
				"Quantidade de positivos: " + positivo + 
				"; Quantidade de Negativos: " + negativo + 
				"; Quantidade de Zeros: " + zeros);
				
				
			}
			
		}

	}
