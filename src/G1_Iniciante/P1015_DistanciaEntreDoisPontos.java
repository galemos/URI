package G1_Iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
Problema
	Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, 
	p1(x1,y1) e p2(x2,y2) e calcule a dist�ncia entre eles, mostrando 4 casas decimais ap�s a 
	v�rgula, segundo a f�rmula:
	Distancia =raiz( (x2 - x1) ^ 2 + (y2 - y1) ^2 )

Entrada
	O arquivo de entrada cont�m duas linhas de dados. A primeira linha cont�m dois valores de 
	ponto flutuante: x1 y1 e a segunda linha cont�m dois valores de ponto flutuante x2 y2.

Sa�da
	Calcule e imprima o valor da dist�ncia segundo a f�rmula fornecida, com 4 casas ap�s o ponto 
	decimal.  */

public class P1015_DistanciaEntreDoisPontos {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		double x1,y1,x2,y2,d;
		
		x1 = s.nextFloat();
		y1 = s.nextFloat();
		x2 = s.nextFloat();
		y2 = s.nextFloat();	
		d = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
		
		DecimalFormat df = new DecimalFormat("0.0000");
		System.out.println(df.format(d));
		s.close();
	}

}

//Tempo 0.060