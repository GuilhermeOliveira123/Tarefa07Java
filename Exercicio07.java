package exercicio07tarefaflamingo;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		/*7) Ler dois valores e imprimir uma das tr�s mensagens a seguir:
			�N�meros iguais�, caso os n�meros sejam iguais
			�Primeiro � maior�, caso o primeiro seja maior que o segundo;
			�Segundo maior�, caso o segundo seja maior que o primeiro.*/
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digte o primeiro n�mero");
		int numero1 = sc.nextInt();
		System.out.println("Digte o segundo n�mero");
		int numero2 = sc.nextInt();
		if(numero1 > numero2) {
			System.out.println("O Primeiro numero � maior");
		}else if ( numero2 > numero1) {
			System.out.println("O Segundo numero � maior");
		}else {
			System.out.println("N�meros iguais");
			sc.close();
		}
		

	}

}
