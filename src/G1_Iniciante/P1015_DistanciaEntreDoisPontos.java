package G1_Iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
Problema
	Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, 
	p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais após a 
	vírgula, segundo a fórmula:
	Distancia =raiz( (x2 - x1) ^ 2 + (y2 - y1) ^2 )

Entrada
	O arquivo de entrada contém duas linhas de dados. A primeira linha contém dois valores de 
	ponto flutuante: x1 y1 e a segunda linha contém dois valores de ponto flutuante x2 y2.

Saída
	Calcule e imprima o valor da distância segundo a fórmula fornecida, com 4 casas após o ponto 
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