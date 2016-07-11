package Iniciante;

import java.util.Scanner;

/*
Problema:
	Neste problema, deve-se ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, 
	o valor unit�rio de cada pe�a 1, o c�digo de uma pe�a 2, o n�mero de 
	pe�as 2 e o valor unit�rio de cada pe�a 2. Ap�s, calcule e mostre o valor 
	a ser pago.

Entrada
	O arquivo de entrada cont�m duas linhas de dados. Em cada linha haver� 
	3 valores, respectivamente dois inteiros e um valor com 2 casas decimais.

Sa�da
	A sa�da dever� ser uma mensagem conforme o exemplo fornecido abaixo, 
	lembrando de deixar um espa�o ap�s os dois pontos e um espa�o ap�s o $.
	 O valor dever� ser apresentado com 2 casas ap�s o ponto.  */

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
