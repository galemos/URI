package G1_Iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
Problema
	Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida (em Km) 
	e o total de combustível gasto (em litros).

Entrada
	O arquivo de entrada contém dois valores: um valor inteiro X representando a distância total 
	percorrida (em Km), e um valor real Y representando o total de combustível gasto, com um dígito
	após o ponto decimal.

Saída
	Apresente o valor que representa o consumo médio do automóvel com 3 casas após a vírgula, 
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