package exercicio07tarefaflamingo;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		/*5) Ler 3 valores (A, B e C) representando as medidas dos lados de um tri�ngulo e 
		escrever se formam ou n�o um tri�ngulo. OBS: para formar um tri�ngulo, o valor 
		de cada lado deve ser menor que a soma dos outros 2 lados.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o valor do lado A: ");   
		int ladoA = sc.nextInt ();    
		System.out.print("Insira o valor do lado B: ");  
		int ladoB= sc.nextInt();     
		System.out.print("Insira o valor do lado C: ");   
		int ladoC = sc.nextInt();          
		if ( ladoA >= ladoB + ladoC || ladoB >= ladoA + ladoC ||  ladoC >= ladoA + ladoB )  {       
			System.out.print("N�o � um triangulo");    
			} else {       
				System.out.print(" � um triangulo ");   
				sc.close();
			}    

	}

}
