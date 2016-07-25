package G1_Iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
 Problema: 
	Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua 
	esta operação à variável PROD. A seguir mostre a variável PROD com mensagem correspondente.   

Entrada:
	O arquivo de entrada contém 2 valores inteiros.

Saída:
	Imprima a variável PROD conforme exemplo abaixo, com um espaço em branco antes e depois da 
	igualdade. Não esqueça de imprimir o fim de linha após o produto, caso contrário seu 
	programa apresentará a mensagem: “Presentation Error”. */

public class P1004_ProdutoSimples {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		a *= Integer.parseInt(br.readLine());
		
		System.out.printf("PROD = %d\n", a);
	}
}

//Tempo 0.044