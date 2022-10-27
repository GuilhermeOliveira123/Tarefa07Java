package exercicio07tarefaflamingo;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		//2) Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles./
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número :");
		int numero1 = sc.nextInt ();
 		System.out.println("Digite o segundo número :");
		int numero2 = sc.nextInt ();
		System.out.println("Digite o terceiro número :");
		int numero3 = sc.nextInt ();
		if (numero1>numero2) {
		System.out.println("O maior digitado é. "+numero1);
		}else if (numero2>numero3) {
			System.out.println("O maior digitado é: "+numero2);
		}else if (numero3>numero2) {
				System.out.println("O maior digitado é: "+numero3);
			}else if  (numero2>numero1) {
					System.out.println("O maior digitado é: "+numero2);
				
	    sc.close();
	    
			}

		}

}
