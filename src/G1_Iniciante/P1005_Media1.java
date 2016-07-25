package G1_Iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Problema:
	Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2 notas de 
	um aluno. A seguir, calcule a média do aluno, sabendo que a nota A tem peso 3.5 e a nota 
	B tem peso 7.5 (A soma dos pesos portanto é 11). Assuma que cada nota pode ir de 0 até 10.0, 
	sempre com uma casa decimal.

Entrada
	O arquivo de entrada contém 2 valores com uma casa decimal cada um.

Saída
	Calcule e imprima a variável MEDIA conforme exemplo abaixo, com 5 dígitos após o ponto decimal 
	e com um espaço em branco antes e depois da igualdade. Utilize variáveis de dupla precisão 
	(double) e como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, 
	caso contrário, você receberá "Presentation Error".  */

public class P1005_Media1 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double a,b,m;
		a = Double.parseDouble(br.readLine());
		b = Double.parseDouble(br.readLine());
		m = ( a * 3.5 + b * 7.5 ) / 11;
		
		System.out.printf("MEDIA = %1.5f\n", m);
	}
}

//Tempo 0.040