package ListaLacosDecisao;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double numero, potencia, raizQuadrada;
		
		System.out.println("Insira um n�mero: ");
		numero = ler.nextDouble();
		
		if(numero % 2 != 0) {
			potencia = Math.pow(numero, 2);
			System.out.println("O n�mero " + numero + " � �mpar. \nE " + numero + " ao quadrado � " + potencia);
		}else {
			raizQuadrada = Math.sqrt(numero);
			System.out.println("O n�mero " + numero + " � par. \nE a raiz quadrada de " + numero + " � " + raizQuadrada);
		}
ler.close();
	}

}
