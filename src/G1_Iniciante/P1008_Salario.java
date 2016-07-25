package G1_Iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n,q;
		double h,sal;
		n = Integer.parseInt(br.readLine());
		q = Integer.parseInt(br.readLine());		
		h = Double.parseDouble(br.readLine());
		sal = q*h;
		
		
		System.out.printf("NUMBER = %d\nSALARY = U$ %1.2f\n",n,sal);
	}
}

//Tempo 0.048