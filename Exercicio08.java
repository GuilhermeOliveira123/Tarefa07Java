package exercicio07tarefaflamingo;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		/*8) Seja o seguinte algoritmo: in�cio ler x ler y z <- (x*y) + 5 se z <= 0 ent�o resposta <- �A� sen�o
		se z <= 100 ent�o resposta <- �B� sen�o resposta <- �C� fim_se fim_se escrever z, resposta
		fim Fa�a um teste de mesa e complete o quadro a seguir para os seguintes valores:*/
		
	    Scanner sc = new Scanner (System.in);
		
			System.out.println("Digte o valor de x");
			int x = sc.nextInt();
			System.out.println("Digte o valor de y");
			int y = sc.nextInt();
	        int z = (x*y)+5;
	        if (z<=0) {
		    System.out.println("Resposta A");
	        } else if  (z<=100) {
	        System.out.println("Resposta B");
	        }else {
	       System.out.println("Resposta C");
	       sc.close();
		

	        }


	}

}
