package exercicio07tarefaflamingo;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/*4) Ler 3 valores (considere que n�o ser�o informados valores iguais) e escrev�-los em ordem
		crescente.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero :");
		int numero1 = sc.nextInt ();
		System.out.println("Digite o segundo n�mero :");
		int numero2 = sc.nextInt ();
		System.out.println("Digite o terceiro n�mero :");
		int numero3 = sc.nextInt ();
	   
	    if((numero1<numero2)&&(numero2<numero3)){
	      System.out.println("Os n�meros digitados na ordem crescente s�o: "+numero1+" , "+numero2+" e "+numero3);
	    }else if ((numero2<numero3)&&(numero3<numero1)){
	    	System.out.println("Os n�meros digitados na ordem crescente s�o: "+numero2+" , "+numero3+" e "+numero1);
	    }else if ((numero3<numero1)&&(numero1<numero2)){
	    	System.out.println("Os n�meros digitados na ordem crescente s�o: "+numero3+" , "+numero1+" e "+numero2);
	    	 }else if ((numero3<numero2)&&(numero2<numero1)){
	    		 System.out.println("Os n�meros digitados na ordem crescente s�o: "+numero3+" , "+numero2+" e "+numero1);
	    	 }else if ((numero1<numero3)&&(numero3<numero2)){
	    		 System.out.println("Os n�meros digitados na ordem crescente s�o: "+numero3+" , "+numero2+" e "+numero1);
	    	sc.close();
	    }

	}

}
