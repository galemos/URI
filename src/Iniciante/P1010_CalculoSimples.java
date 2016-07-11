package Iniciante;

import java.util.Scanner;

/*
Problema:
	Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, 
	o valor unitário de cada peça 1, o código de uma peça 2, o número de 
	peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor 
	a ser pago.

Entrada
	O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 
	3 valores, respectivamente dois inteiros e um valor com 2 casas decimais.

Saída
	A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, 
	lembrando de deixar um espaço após os dois pontos e um espaço após o $.
	 O valor deverá ser apresentado com 2 casas após o ponto.  */

public class P1010_CalculoSimples {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int q = s.nextInt();
		
		int x,y=0;
		x=0;
		
		int n2,n1 = s.nextInt();
		n2 = s.nextInt();
		
		for (int i = 0; i < q; i++) {

			if (n1 % 2 == 0) {
				while (n1 != 0) {
					n1 /= 2;
					x++;
				}
			} 
			if (n2%2 == 0){
				while (n2 != 0) {
					n2 /= 2;
					y++;
				}
			}

		}
		if(x == y)
		{
			System.out.println(x);
		}
		s.close();
	}

}
