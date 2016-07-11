package G1_Iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
Prolema
	Neste problema, deve-se ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de 
	cada pe�a 1, o c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. 
	Ap�s, calcule e mostre o valor a ser pago.

Entrada
	O arquivo de entrada cont�m duas linhas de dados. Em cada linha haver� 3 valores, respectivamente 
	dois inteiros e um valor com 2 casas decimais.

Sa�da
	A sa�da dever� ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espa�o 
	ap�s os dois pontos e um espa�o ap�s o $. O valor dever� ser apresentado com 2 casas ap�s o ponto.  */

public class P1010_CalculoSimples {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int cod = s.nextInt();
		double i = s.nextDouble()*s.nextDouble();
		cod = s.nextInt();
		i += s.nextDouble()*s.nextDouble();
		DecimalFormat d = new DecimalFormat("0.00");
		System.out.println("VALOR A PAGAR: R$ " + d.format(i));
		s.close();
	}

}

//Tempo 0.060