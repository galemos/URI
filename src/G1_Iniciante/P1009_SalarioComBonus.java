package G1_Iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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