package ListaLacosDecisao;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double numero, potencia, raizQuadrada;
		
		System.out.println("Insira um número: ");
		numero = ler.nextDouble();
		
		if(numero % 2 != 0) {
			potencia = Math.pow(numero, 2);
			System.out.println("O número " + numero + " é ímpar. \nE " + numero + " ao quadrado é " + potencia);
		}else {
			raizQuadrada = Math.sqrt(numero);
			System.out.println("O número " + numero + " é par. \nE a raiz quadrada de " + numero + " é " + raizQuadrada);
		}
ler.close();
	}

}
