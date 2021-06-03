package ListaLacosDecisao;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num1, num2, num3, maior = 0;
		
		System.out.println("Insira o 1° número: ");
		num1 = ler.nextInt();
		
		System.out.println("Insira o 2° número: ");
		num2 = ler.nextInt();
		
		System.out.println("Insira o 3° número: ");
		num3 = ler.nextInt();
		
		if(num1 > maior) {
			System.out.println("O número " + num1 + " é o maior número.");
		}
		else if(num2 > maior) {
			System.out.println("O número " + num2 + " é o maior número.");
		}
		else {
			System.out.println("O número " + num3 + " é o maior número.");
		}
	ler.close();
	}
}
