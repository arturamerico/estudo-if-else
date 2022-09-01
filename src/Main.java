import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		String cachorro = "Artur";

		if (number < 0) {
			System.out.println(cachorro +  " NEGATIVO");
		} else {
			System.out.println(cachorro + " REPROVADO");
		}

		sc.close();

	}

}