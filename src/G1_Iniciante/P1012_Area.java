package G1_Iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
Problema
	Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. 
	Em seguida, calcule e mostre:
	a) a área do triângulo retângulo que tem A por base e C por altura.
	b) a área do círculo de raio C. (pi = 3.14159)
	c) a área do trapézio que tem A e B por bases e C por altura.
	d) a área do quadrado que tem lado B.
	e) a área do retângulo que tem lados A e B.

Entrada
	O arquivo de entrada contém três valores com um dígito após o ponto decimal.

Saída
	O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a uma das áreas 
	descritas acima, sempre com mensagem correspondente e um espaço entre os dois pontos e o valor. 
	O valor calculado deve ser apresentado com 3 dígitos após o ponto decimal.  */

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