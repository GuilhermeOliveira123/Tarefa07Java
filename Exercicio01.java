package exercicio07tarefaflamingo;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// 1) Ler um valor e escrever se � positivo, negativo ou zero./
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor :");
		int valor = sc.nextInt ();
		if (valor>0) {
		
		System.out.println("O valor digitado positivo.");
		
		}else if (valor==0){
			System.out.println("O valor digitado � zero.");
		
		}else {
	   
			System.out.println("O valor digitado negativo.");
	   
			sc.close();
			
		}

	}

}
