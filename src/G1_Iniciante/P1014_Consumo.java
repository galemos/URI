package G1_Iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
Problema
	Calcule o consumo m�dio de um autom�vel sendo fornecidos a dist�ncia total percorrida (em Km) 
	e o total de combust�vel gasto (em litros).

Entrada
	O arquivo de entrada cont�m dois valores: um valor inteiro X representando a dist�ncia total 
	percorrida (em Km), e um valor real Y representando o total de combust�vel gasto, com um d�gito
	ap�s o ponto decimal.

Sa�da
	Apresente o valor que representa o consumo m�dio do autom�vel com 3 casas ap�s a v�rgula, 
	seguido da mensagem "km/l".  */

public class P1014_Consumo {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
        
        int i;
        
        i = s.nextInt();
        
        double j;
        
        j = s.nextDouble();
        
		double g = i / j;
		
		DecimalFormat d = new DecimalFormat("0.000");
		
		System.out.println(d.format(g) + " km/l");
		
		s.close();
	}

}

//Tempo 0.052