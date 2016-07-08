package Iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
Problema:
	Leia 3 valores, no caso, vari�veis A, B e C, que s�o as tr�s notas de um aluno. A seguir, 
	calcule a m�dia do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C 
	tem peso 5. Considere que cada nota pode ir de 0 at� 10.0, sempre com uma casa decimal.

Entrada
	O arquivo de entrada cont�m 3 valores com uma casa decimal, de dupla precis�o (double).

Sa�da
	Imprima a vari�vel MEDIA conforme exemplo abaixo, com 1 d�gito ap�s o ponto decimal e com um 
	espa�o em branco antes e depois da igualdade. Assim como todos os problemas, n�o esque�a de 
	imprimir o fim de linha ap�s o resultado, caso contr�rio, voc� receber� "Presentation Error".  */

public class P1006_Media2 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		double a = s.nextDouble() * 0.2 + s.nextDouble() * 0.3 + s.nextDouble() * 0.5;
		DecimalFormat d = new DecimalFormat("0.0");
		
		System.out.println("MEDIA = " + d.format(a));		
		s.close();
	}

}

//Tempo 0.092