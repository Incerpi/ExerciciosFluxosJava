package br.com.fiap;

import javax.swing.JOptionPane;

public class Exercicio6 {

	public static void main(String[] args) {
		int populacaoMundial = Integer.valueOf(JOptionPane.showInputDialog(
				"Digite o valor da população mundial: ")); 
		double taxaCrescimento = Double.valueOf(JOptionPane.showInputDialog(
				"Digite a taxa de crescimento anual: "));
		
		double estimativa = populacaoMundial + (populacaoMundial * (taxaCrescimento / 100) * 5);
		
		System.out.println(estimativa);

	}

}
