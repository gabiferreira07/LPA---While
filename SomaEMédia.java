package While;

import java.util.Scanner;

public class SomaEMédia {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double soma = 0, media;

		for (int i = 0; i < 5; i++) {
			System.out.print("Digite o número: ");
			soma += ler.nextDouble();
		}
		media = soma / 5;

		System.out.println("A soma é: " + soma);
		System.out.println("A média é: " + media);

		ler.close();
		}
	}

