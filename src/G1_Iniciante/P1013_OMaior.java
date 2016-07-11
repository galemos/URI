package G1_Iniciante;

import java.util.Scanner;

/*
Problema:
	Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da 
	mensagem “eh o maior”. Utilize a fórmula:
	MaiorAB = (a+b+abs(a-b))/2

Entrada
	O arquivo de entrada contém três valores inteiros.

Saída
	Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".  */
public class P1013_OMaior {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m,n,c,b,a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		m = (a + b + Math.abs(a-b))/2;
		n = (m + c + Math.abs(m-c))/2;
		System.out.println(n + " eh o maior");
		s.close();
	}

}

//Tempo 0.060