package testeSci;

import java.util.Scanner;

public class TresJava {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String aluno;
		double nota1, nota2, nota3, nota4;
		double media;
		boolean x = true;
		double continuar;

		while (x) {
			
			System.out.println("Digite o nome do aluno ");
			aluno = in.next();
			System.out.println("Qual a primeira nota? ");
			nota1 = in.nextDouble();
			System.out.println("Qual a segunda nota? ");
			nota2 = in.nextDouble();
			System.out.println("Qual a terceira nota? ");
			nota3 = in.nextDouble();
			System.out.println("Qual a quarta nota? ");
			nota4 = in.nextDouble();
			
			

			media = (nota1 + nota2 + nota3 + nota4) / 4;

			if (media >= 6) {
				System.out.println(aluno + " foi aprovado com média " + media);
			} else {
				System.out.println(aluno + " foi reprovado com média " + media);
			}

			System.out.println("Digite (1) para saber o resultado de mais algum aluno"
					+ " ou qualquer outro número para encerrar o programa");
			continuar = in.nextDouble();
			if (continuar == 1) {
				x = true;
			} else {
				x = false;
				
			}
		}

		in.close();
	}

}
