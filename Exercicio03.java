package exercicio07tarefaflamingo;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// 3) Ler 3 valores (considere que n�o ser�o informados valores iguais) e escrever a soma dos 2 maiores.*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero :");
		int numero1 = sc.nextInt ();
		System.out.println("Digite o segundo n�mero :");
		int numero2 = sc.nextInt ();
		System.out.println("Digite o terceiro n�mero :");
		int numero3 = sc.nextInt ();
		if (numero3 < numero1 && (numero1 < numero2)) {
	        System.out.print(numero1 + numero2);
	    }
	    if (numero2 < numero1 && (numero1 < numero3)) {
	        System.out.print(numero1 + numero3);
	    } else {
	        System.out.print(numero2 + numero3);
	        sc.close();
	    }
		

	}

}
