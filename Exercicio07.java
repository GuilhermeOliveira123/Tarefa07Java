package exercicio07tarefaflamingo;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		/*7) Ler dois valores e imprimir uma das três mensagens a seguir:
			‘Números iguais’, caso os números sejam iguais
			‘Primeiro é maior’, caso o primeiro seja maior que o segundo;
			‘Segundo maior’, caso o segundo seja maior que o primeiro.*/
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digte o primeiro número");
		int numero1 = sc.nextInt();
		System.out.println("Digte o segundo número");
		int numero2 = sc.nextInt();
		if(numero1 > numero2) {
			System.out.println("O Primeiro numero é maior");
		}else if ( numero2 > numero1) {
			System.out.println("O Segundo numero é maior");
		}else {
			System.out.println("Números iguais");
			sc.close();
		}
		

	}

}
