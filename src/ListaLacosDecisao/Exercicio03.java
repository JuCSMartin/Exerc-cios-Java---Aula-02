package ListaLacosDecisao;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Informe sua idade: ");
		idade = ler.nextInt();
		
		if(idade >= 10 && idade <= 14) {
			System.out.println("Voc� se encontra na categoria infantil.");
		}
		else if(idade >= 15 && idade <= 17) {
			System.out.println("Voc� se encontra na categoria juvenil.");
		}
		else if(idade >=18 && idade <= 25) {
			System.out.println("Voc� se encontra na categoria adulto");
		}
		else {
			System.out.println("Voc� n�o se encontra em nenhuma das categorias oferecidas.");
		}
ler.close();
	}
}
