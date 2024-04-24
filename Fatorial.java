package While;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n, fatorial = 1 , i = 1;

		System.out.print("Informe um número: ");
		n = ler.nextInt();
		
		while (i <= n) {
			i++;
			fatorial *= i;
		}
		System.out.println(n + "! = " + fatorial);
		ler.close();
	}

}
