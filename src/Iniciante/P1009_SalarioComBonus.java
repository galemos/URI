package Iniciante;

import java.util.Scanner;

/*
Problema:
	Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas 
	efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre 
	suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais.

Entrada:
O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores de dupla precisão (double) 
com duas casas decimais, representando o salário fixo do vendedor e montante total das vendas efetuadas 
por este vendedor, respectivamente.

Saída:
Imprima o total que o funcionário deverá receber, conforme exemplo fornecido.  */

public class P1009_SalarioComBonus {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String n = s.next();
		double v = s.nextDouble() + (s.nextDouble() * 0.15);
		System.out.println(v);
		s.close();
	}

}
