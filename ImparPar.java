package While;

import java.util.Scanner;

public class ImparPar {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n, par = 0,impar = 0, i = 1;

		while(i < 10) {
			i++;
			System.out.print("Digite um número: ");
			n = ler.nextInt();
			
			if (n % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		System.out.println("Quantidade de número par: " + par);
		System.out.println("Quantidade de número ímpar: " + impar);

		ler.close();
		}
	}
}
