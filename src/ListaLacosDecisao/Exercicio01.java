package ListaLacosDecisao;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num1, num2, num3, maior = 0;
		
		System.out.println("Insira o 1� n�mero: ");
		num1 = ler.nextInt();
		
		System.out.println("Insira o 2� n�mero: ");
		num2 = ler.nextInt();
		
		System.out.println("Insira o 3� n�mero: ");
		num3 = ler.nextInt();
		
		if(num1 > maior) {
			System.out.println("O n�mero " + num1 + " � o maior n�mero.");
		}
		else if(num2 > maior) {
			System.out.println("O n�mero " + num2 + " � o maior n�mero.");
		}
		else {
			System.out.println("O n�mero " + num3 + " � o maior n�mero.");
		}
	ler.close();
	}
}
