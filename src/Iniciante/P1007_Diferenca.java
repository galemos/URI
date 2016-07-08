package Iniciante;

import java.util.Scanner;

/*
Problema: 
	Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de 
	A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
	
Entrada
	O arquivo de entrada contém 4 valores inteiros.
	
Saída
	Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo abaixo, 
	com um espaço em branco antes e depois da igualdade.  */

public class P1007_Diferenca {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt() * s.nextInt() - s.nextInt() * s.nextInt();
		
		System.out.println("DIFERENCA = " + a);
		s.close();		
	}

}

//Tempo 0.064