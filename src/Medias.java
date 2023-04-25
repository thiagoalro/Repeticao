/*Faça um programa para calcular e mostrar a média aritmética
das duas notas de cada aluno de uma turma de 100 alunos.
*/

import java.util.Scanner;

public class Medias {

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		double nota1;
		double nota2;

		int counter = 1;
		while (counter <= 3){
			System.out.print("Digite a nota 1 do aluno: ");
			nota1 = input.nextDouble();

			System.out.print("Digite a nota 2 do aluno: ");
			nota2 = input.nextDouble();

			System.out.printf("A média desse aluno foi: %.2f%n", (nota1 + nota2)/2.0);

			counter++; // counter = counter + 1;
		}
	}

}
