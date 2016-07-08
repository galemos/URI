package Iniciante;

import java.util.Scanner;

/*
Problema:

	Leia 2 valores inteiros e armazene-os nas variáveis A e B. Efetue a soma de A e B atribuindo 
	o seu resultado na variável X. Imprima X conforme exemplo apresentado abaixo. Não apresente 
	mensagem alguma além daquilo que está sendo especificado e não esqueça de imprimir o fim de 
	linha após o resultado, caso contrário, você receberá "Presentation Error".

Entrada:

	A entrada contém 2 valores inteiros.

Saída:

	Imprima a variável X conforme exemplo abaixo, com um espaço em branco antes e depois da 
	igualdade. Obs: O X está em maiúsculo e deve ter um espaço antes e um espaço depois do 
	sinal de igualdade. */

public class P1001_ExtremamenteBasico {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt()+s.nextInt();
		
		System.out.println("X = " + x);
		s.close();
	}

}
