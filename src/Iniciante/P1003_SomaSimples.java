package Iniciante;

import java.util.Scanner;

/*
 Problema:
 	Leia dois valores inteiros, no caso para vari�veis A e B. A seguir, calcule a soma entre 
 	elas e atribua � vari�vel SOMA. A seguir escrever o valor desta vari�vel.
 	
Entrada:
	O arquivo de entrada cont�m 2 valores inteiros.
	
Sa�da:
	Imprima a vari�vel SOMA com todas as letras mai�sculas, com um espa�o em branco antes e 
	depois da igualdade seguido pelo valor correspondente � soma de A e B. Como todos os 
	problemas, n�o esque�a de imprimir o fim de linha ap�s o resultado, caso contr�rio, voc� 
	receber� "Presentation Error". */

public class P1003_SomaSimples {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		a += s.nextInt();
		
		System.out.println("SOMA = " + a);
		s.close();
	}

}
