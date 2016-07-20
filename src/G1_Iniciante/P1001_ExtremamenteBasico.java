package G1_Iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Problema:

	Leia 2 valores inteiros e armazene-os nas vari�veis A e B. Efetue a soma de A e B atribuindo 
	o seu resultado na vari�vel X. Imprima X conforme exemplo apresentado abaixo. N�o apresente 
	mensagem alguma al�m daquilo que est� sendo especificado e n�o esque�a de imprimir o fim de 
	linha ap�s o resultado, caso contr�rio, voc� receber� "Presentation Error".

Entrada:

	A entrada cont�m 2 valores inteiros.

Sa�da:

	Imprima a vari�vel X conforme exemplo abaixo, com um espa�o em branco antes e depois da 
	igualdade. Obs: O X est� em mai�sculo e deve ter um espa�o antes e um espa�o depois do 
	sinal de igualdade. */

public class P1001_ExtremamenteBasico {

	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int a, b;
		
		a = Integer.parseInt(in.readLine());
		b = Integer.parseInt(in.readLine());
		
		System.out.printf("X = %d\n", a+b);

	}

}


//Tempo 0.036