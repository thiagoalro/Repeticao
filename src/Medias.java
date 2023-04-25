/*Faça um programa para calcular e mostrar a média aritmética
das duas notas de cada aluno de uma turma de 100 alunos.
*/

import java.util.Scanner;

public class Medias {

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		double nota1;
		double nota2;

		System.out.print("Digite a quantidade de alunos da turma: ");
		int quantidadeAlunos = input.nextInt();

		int counter = 0;
		while (counter < quantidadeAlunos){
			System.out.printf("Digite a nota 1 do %dº aluno(a): ", counter+1);
			nota1 = input.nextDouble();

			System.out.printf("Digite a nota 2 do %dº aluno(a): ", counter+1);
			nota2 = input.nextDouble();

			System.out.printf("A média desse aluno foi: %.2f%n", (nota1 + nota2)/2.0);

			counter++; // counter = counter + 1;
		}
	}

}
