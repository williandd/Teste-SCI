package testeSci;

import java.util.Scanner;

public class DoisJava {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite 5 números");
		int[] num = new int[5];
		int numMaior = 0;
		int numMenor = 0;

		for (int i = 0; i < 5; i++) {
			num[i] = in.nextInt();
			if (i == 0) {
				numMenor = num[i];
			} 
			if (num[i] > numMaior) {
				numMaior = num[i];
			}
			if (num[i] < numMenor) {
				numMenor = num[i];
			}
		}

		System.out.println("O número maior é: " + numMaior);
		System.out.println("O número menor é: " + numMenor);
		in.close();

	}

}
