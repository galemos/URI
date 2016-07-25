package G1_Iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		String nome;
		double sal, venda, total;		
		nome = br.readLine();
		sal = Double.parseDouble(br.readLine());
		venda = Double.parseDouble(br.readLine());
		
		total = sal + (0.15 * venda);

		System.out.printf("TOTAL = R$ %1.2f\n",total);
	}

}

//Tempo 0.040