package testeSci;

import java.util.Scanner;

public class CincoJava {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String[] alunos = new String[3];
		double[][] notas = new double[3][4];
		double[] medias = new double[3];
		int maiorAluno = 0;
		int menorAluno = 0;

		for (int i = 0; i < 3; i++) {

			System.out.println("Digite o nome do aluno");
			alunos[i] = in.next();
			System.out.println("Digite as notas do aluno");

			for (int j = 0; j < 4; j++) {

				notas[i][j] = in.nextDouble();
				medias[i] += notas[i][j];

			}

			medias[i] /= 4;

			System.out.println("Nome do aluno: " + alunos[i]);
			System.out.println("Média: " + medias[i]);

		}

		if (medias[0] > medias[1] & medias[0] > medias[2]) {
			maiorAluno = 0;
		} else if (medias[1] > medias[0] & medias[1] > medias[2]) {
			maiorAluno = 1;
		} else if (medias[2] > medias[0] & medias[2] > medias[1]) {
			maiorAluno = 2;
		}

		if (medias[0] < medias[1] & medias[0] < medias[2]) {
			menorAluno = 0;
		} else if (medias[1] < medias[0] & medias[1] < medias[2]) {
			menorAluno = 1;
		} else if (medias[2] < medias[0] & medias[2] < medias[1]) {
			menorAluno = 2;
		}

		System.out.println("Aluno com a maior média: " + alunos[maiorAluno]);
		System.out.println("Aluno com a menor média: " + alunos[menorAluno]);

		in.close();
	}

}