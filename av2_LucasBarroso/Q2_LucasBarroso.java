package av2_LucasBarroso;

import java.util.*;

public class Q2_LucasBarroso {
	public static void main ( String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("digite quantos numeros vc quer somar: ");
		int n = s.nextInt();//quantos numeros vai somar	
		int soma = 0;
		for (int i = 0 ; i < n;i++) {
			System.out.println("digite o "+ (i+1) + " numero");
			int num = s.nextInt();
			soma += num;
			
		}
		System.out.println("a soma foi "+ soma);
	}

}
