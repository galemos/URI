package Iniciante;

import java.util.Scanner;

public class P1003_SomaSimples {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		a += s.nextInt();
		
		System.out.println("SOMA = " + a);
		s.close();
	}

}
