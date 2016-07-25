package G1_Iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Problema:

	Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o 
	valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e 
	o salário do funcionário, com duas casas decimais.

Entrada:
	O arquivo de entrada contém 2 números inteiros e 1 número com duas casas decimais, 
	representando o número, quantidade de horas trabalhadas e o valor que o funcionário recebe por 
	hora trabalhada, respectivamente.

Saída:
	Imprima o número e o salário do funcionário, conforme exemplo fornecido, com um espaço em branco
	 antes e depois da igualdade. No caso do salário, também deve haver um espaço em branco após o $.  */

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