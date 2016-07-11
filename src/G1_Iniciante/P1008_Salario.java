package G1_Iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

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