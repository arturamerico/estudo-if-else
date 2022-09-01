import java.util.Locale;
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int entrada = sc.nextInt();

		if (entrada % 2 == 0)
			System.out.println("Par");
		else
			System.out.println("impar");

	}

}
