package testeSci;

import java.util.Scanner;

public class UmJava {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Digite cinco números");

		int[] num = new int[5];
		int[] numPares = new int[5];
		int[] numImpares = new int[5];
		double mediaPares = 0;
		double mediaImpares = 0;
		int quantosPares = 0;
		int quantosImpares = 0;

		for (int i = 0; i < 5; i++) {

			num[i] = in.nextInt();
		}

		System.out.println("Números pares");

		for (int i = 0; i < 5; i++) {
			if (num[i] % 2 == 0) {
				numPares[i] = num[i];
				mediaPares += num[i]; 
				quantosPares++;
				System.out.print(numPares[i] + " ");
			}
		}

		System.out.println("\nMédia dos pares: " + mediaPares / quantosPares);

		System.out.println("\nNúmeros ímpares");

		for (int i = 0; i < 5; i++) {
			if (num[i] % 2 != 0) {
				numImpares[i] = num[i];
				mediaImpares += num[i];
				quantosImpares++;
				System.out.print(numImpares[i] + " ");
			}
		}

		System.out.println("\nMédia dos ímpares: " + mediaImpares / quantosImpares);
		in.close();

	}

}
