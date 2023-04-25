import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args){

		System.out.print("Digite um número inteiro: ");
		Scanner input = new Scanner(System.in);
		int counter = input.nextInt();
		do {
			System.out.printf("%d ", counter);
			counter = counter + 1;
		} while (counter <= 10);

		System.out.print("\nDepois do do..while: ");
		System.out.print(counter);
	}

}
