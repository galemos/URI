package G1_Iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 Problema:
 	Leia dois valores inteiros, no caso para variáveis A e B. A seguir, calcule a soma entre 
 	elas e atribua à variável SOMA. A seguir escrever o valor desta variável.
 	
Entrada:
	O arquivo de entrada contém 2 valores inteiros.
	
Saída:
	Imprima a variável SOMA com todas as letras maiúsculas, com um espaço em branco antes e 
	depois da igualdade seguido pelo valor correspondente à soma de A e B. Como todos os 
	problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você 
	receberá "Presentation Error". */

public class P1003_SomaSimples {	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		a += Integer.parseInt(br.readLine());	
		
		System.out.printf("SOMA = %d\n",a);
	}

}

//Tempo 0.060