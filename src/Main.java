import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int number = input.nextInt();

		while (number <= 20) {
			System.out.println(number);
			number = number + 2;
		}
		System.out.print("Depois do while: ");
		System.out.println(number);
	}
}