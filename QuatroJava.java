package testeSci;

import java.util.Scanner;

public class QuatroJava {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] num = new int[5];
		System.out.println("Digite 5 números");
		for (int i = 0; i < 5; i++) {
			num[i] = in.nextInt();
		}
		System.out.println("O número correspondente a terceira posicão é " + num[3]);
		
		in.close();
		
	}

}
