package Iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
Problema:
	Fa�a um programa que leia o nome de um vendedor, o seu sal�rio fixo e o total de vendas 
	efetuadas por ele no m�s (em dinheiro). Sabendo que este vendedor ganha 15% de comiss�o sobre 
	suas vendas efetuadas, informar o total a receber no final do m�s, com duas casas decimais.

Entrada:
O arquivo de entrada cont�m um texto (primeiro nome do vendedor) e 2 valores de dupla precis�o (double) 
com duas casas decimais, representando o sal�rio fixo do vendedor e montante total das vendas efetuadas 
por este vendedor, respectivamente.

Sa�da:
Imprima o total que o funcion�rio dever� receber, conforme exemplo fornecido.  */

public class P1009_SalarioComBonus {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String nome = s.next();
		double salario = s.nextDouble();
		salario = salario + (0.15 * s.nextDouble());
		
		DecimalFormat d = new DecimalFormat("0.00");
		System.out.println("TOTAL = R$ " + d.format(salario));
		s.close();
	}

}
