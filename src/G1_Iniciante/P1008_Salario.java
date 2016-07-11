package G1_Iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
Problema:

	Escreva um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o 
	valor que recebe por hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e 
	o sal�rio do funcion�rio, com duas casas decimais.

Entrada:
	O arquivo de entrada cont�m 2 n�meros inteiros e 1 n�mero com duas casas decimais, 
	representando o n�mero, quantidade de horas trabalhadas e o valor que o funcion�rio recebe por 
	hora trabalhada, respectivamente.

Sa�da:
	Imprima o n�mero e o sal�rio do funcion�rio, conforme exemplo fornecido, com um espa�o em branco
	 antes e depois da igualdade. No caso do sal�rio, tamb�m deve haver um espa�o em branco ap�s o $.  */

public class P1008_Salario {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int q, n = s.nextInt();
		q = s.nextInt();
		double h = s.nextDouble() * q;
		DecimalFormat d = new DecimalFormat("0.00");
		
		System.out.println("NUMBER = " + n + "\nSALARY = U$ " + d.format(h));
		s.close();
	}

}

//Tempo 0.056