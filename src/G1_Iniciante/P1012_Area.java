package G1_Iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
Problema
	Escreva um programa que leia tr�s valores com ponto flutuante de dupla precis�o: A, B e C. 
	Em seguida, calcule e mostre:
	a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
	b) a �rea do c�rculo de raio C. (pi = 3.14159)
	c) a �rea do trap�zio que tem A e B por bases e C por altura.
	d) a �rea do quadrado que tem lado B.
	e) a �rea do ret�ngulo que tem lados A e B.

Entrada
	O arquivo de entrada cont�m tr�s valores com um d�gito ap�s o ponto decimal.

Sa�da
	O arquivo de sa�da dever� conter 5 linhas de dados. Cada linha corresponde a uma das �reas 
	descritas acima, sempre com mensagem correspondente e um espa�o entre os dois pontos e o valor. 
	O valor calculado deve ser apresentado com 3 d�gitos ap�s o ponto decimal.  */

public class P1012_Area {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double c, b, a = s.nextDouble();
		b = s.nextDouble();
		c = s.nextDouble();
		DecimalFormat d = new DecimalFormat("0.000");
		System.out.println("TRIANGULO: " + d.format(((a * c) / 2)) + "\nCIRCULO: " + d.format((3.14159 * (c * c)))
				+ "\nTRAPEZIO: " + d.format((((a + b) * c) / 2)) + "\nQUADRADO: " + d.format((b * b)) + "\nRETANGULO: "
				+ d.format((a * b)));
		s.close();
	}
}

//Tempo 0.056