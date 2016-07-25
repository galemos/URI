package G1_Iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Problema:
	A fórmula para calcular a área de uma circunferência é: area = π . raio2. Considerando para 
	este problema que π = 3.14159:

- Efetue o cálculo da área, elevando o valor de Raio ao quadrado e multiplicando por π.
Entrada

A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a variável raio.
Saída

Apresentar a mensagem "A=" seguido pelo valor da variável area, conforme exemplo abaixo, com 4 casas após o ponto decimal.
 Utilize variáveis de dupla precisão (double). Como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, 
 caso contrário, você receberá "Presentation Error". */

public class P1002_AreaDoCirculo {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
		
		double a = Double.parseDouble(cin.readLine());
		
		a = Math.pow(a, 2) * 3.14159;
		
        System.out.printf("A=%1.4f\n", a);
	}

}

//Tempo 0.044