/*
Faça um programa que recebe do usuário o salário de todos os
20 funcionários de uma empresa. O programa deve mostrar o
gasto da empresa com o salário dos funcionários.
*/

import java.util.Scanner;

public class Salarios {

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		double salario;

		double gasto = 0;

		int i = 0;
		while (i < 3){
			System.out.printf("Digite o salário do %dº funcionário(a): ", i+1);
			salario = input.nextDouble();
			gasto = gasto + salario;
			i++;
		}

		System.out.printf("O gasto da empresa com salários é: %.2f%n", gasto);
	}

}
