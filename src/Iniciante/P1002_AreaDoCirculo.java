package Iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P1002_AreaDoCirculo {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		double a = s.nextDouble();
		a = (a*a)*3.14159;
		DecimalFormat d = new DecimalFormat("0.0000");
		System.out.println("A=" + d.format(a));
		
		s.close();
	}

}
