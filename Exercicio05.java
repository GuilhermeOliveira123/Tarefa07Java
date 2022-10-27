package exercicio07tarefaflamingo;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		/*5) Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e 
		escrever se formam ou não um triângulo. OBS: para formar um triângulo, o valor 
		de cada lado deve ser menor que a soma dos outros 2 lados.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o valor do lado A: ");   
		int ladoA = sc.nextInt ();    
		System.out.print("Insira o valor do lado B: ");  
		int ladoB= sc.nextInt();     
		System.out.print("Insira o valor do lado C: ");   
		int ladoC = sc.nextInt();          
		if ( ladoA >= ladoB + ladoC || ladoB >= ladoA + ladoC ||  ladoC >= ladoA + ladoB )  {       
			System.out.print("Não é um triangulo");    
			} else {       
				System.out.print(" É um triangulo ");   
				sc.close();
			}    

	}

}
