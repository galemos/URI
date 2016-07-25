package G1_Iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Problema: 
	Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferen�a do produto de 
	A e B pelo produto de C e D segundo a f�rmula: DIFERENCA = (A * B - C * D).
	
Entrada
	O arquivo de entrada cont�m 4 valores inteiros.
	
Sa�da
	Imprima a mensagem DIFERENCA com todas as letras mai�sculas, conforme exemplo abaixo, 
	com um espa�o em branco antes e depois da igualdade.  */

public class P1007_Diferenca {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b, c, d,resp;
		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());
		c = Integer.parseInt(br.readLine());
		d = Integer.parseInt(br.readLine());
		resp = a * b - c * d;
		
		System.out.printf("DIFERENCA = %d\n", resp);
	}
}

//Tempo 0.040