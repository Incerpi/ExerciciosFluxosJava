package br.com.fiap;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		int raio = Integer.valueOf(JOptionPane.showInputDialog("Digite o raio do c�rculo:"));
		
		int diametro = 2 * raio;
		
		double area = 3.14 * (raio * raio);
		
		double circuferencia = 3.14 * raio * 2;
		
		System.out.println("Di�metro: " + diametro + "; area: " + area + "; circuferencia: " + circuferencia);
		
		

	}

}
