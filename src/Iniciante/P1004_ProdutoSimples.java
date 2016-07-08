package Iniciante;

import java.util.Scanner;

public class P1004_ProdutoSimples {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		a *= s.nextInt();
		System.out.println("PROD = " + a);
		
		s.close();
	}

}
