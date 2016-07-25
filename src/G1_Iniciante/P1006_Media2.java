package G1_Iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Problema:
	Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno. A seguir, 
	calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C 
	tem peso 5. Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

Entrada
	O arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão (double).

Saída
	Imprima a variável MEDIA conforme exemplo abaixo, com 1 dígito após o ponto decimal e com um 
	espaço em branco antes e depois da igualdade. Assim como todos os problemas, não esqueça de 
	imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".  */

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