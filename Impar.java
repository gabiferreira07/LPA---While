package While;

import java.util.Scanner;

public class Impar {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n, i = 0;

		System.out.println("Informe o número final:");
		n = ler.nextInt();
		
		while(i <= n) {
			i++;
			if(i % 2 != 0) {
				System.out.println("O número " + i + " é impar!");
		}
		ler.close();
		}
	}
}
