package G1_Iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Problema:
	Leia 3 valores, no caso, vari�veis A, B e C, que s�o as tr�s notas de um aluno. A seguir, 
	calcule a m�dia do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C 
	tem peso 5. Considere que cada nota pode ir de 0 at� 10.0, sempre com uma casa decimal.

Entrada
	O arquivo de entrada cont�m 3 valores com uma casa decimal, de dupla precis�o (double).

Sa�da
	Imprima a vari�vel MEDIA conforme exemplo abaixo, com 1 d�gito ap�s o ponto decimal e com um 
	espa�o em branco antes e depois da igualdade. Assim como todos os problemas, n�o esque�a de 
	imprimir o fim de linha ap�s o resultado, caso contr�rio, voc� receber� "Presentation Error".  */

public class P1006_Media2 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double a,b,c,m; 
		a = Double.parseDouble(br.readLine());
		b = Double.parseDouble(br.readLine());
		c = Double.parseDouble(br.readLine());
		
		m = a * 0.2 + b * 0.3 + c * 0.5;
		
		System.out.printf("MEDIA = %1.1f\n", m);
	}
}

//Tempo 0.048