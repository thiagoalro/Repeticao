/*
Construa um algoritmo que calcula a média aritmética de um
conjunto de números positivos pares fornecidos pelo usuário. O
usuário pode digitar qualquer número inteiro e digita -1 para
terminar.
*/

import java.util.Scanner;

public class MediaParesPositivos {

	public static void main(String[] args){
		int numeroDigitado;
		double soma = 0;
		int contador = 0;
		Scanner input = new Scanner(System.in);

		do {
			System.out.print("Digite um número inteiro (-1 para encerrar): ");
			numeroDigitado = input.nextInt();
			if (numeroDigitado > 0 && numeroDigitado % 2 == 0){
				System.out.println("O número digitado ENTRARÁ na média dos pares positivos.");
				soma = soma + numeroDigitado;
				contador++;
			}
			else {
				System.out.println("O número digitado NÃO entrará na média dos pares positivos.");
			}
		} while (numeroDigitado != -1);

		if (contador > 0){
			System.out.printf("A soma dos pares positivos digitados é: %.2f%n", soma);
			System.out.printf("A média dos pares positivos digitados é: %.2f", soma/contador);
		}
		else {
			System.out.print("Você não digitou nenhum par positivo.");
		}



	}
}
