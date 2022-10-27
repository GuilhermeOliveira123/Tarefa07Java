package exercicio07tarefaflamingo;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		/*9) Um posto está vendendo combustíveis com a seguinte tabela de descontos:*/
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		double valor,valorpago;

		
		System.out.println("Informe qual combustivel o cliente abasteceu!");
		String combustivel = sc.next(); 
		
		System.out.println("Informe a quantidade de Litros: ");
		double litros = sc.nextInt();
		
		 
		 switch (combustivel) {
		
			case  ("Alcool"):
				
				if (litros <=20)
				{
					valor = (litros *2.95);
					valorpago = valor - valor *3/100;
					System.out.println("O Valor a ser pago é R$ " + valorpago);
				}
				else
				{
					valor = (litros *2.95);
					valorpago = valor - valor *5/100;
					System.out.println("O Valor a ser pago é R$ " + valorpago);
				}
				break;
				
			   case ("Gasolina"):
				
				if (litros <=20)
				{
					valor = (litros *4.27);
					valorpago = valor - valor *4/100;
					System.out.println("O Valor a ser pago é R$ " + valorpago);
				}
				else
				{
					valor = (litros *4.27);
					valorpago = valor - valor *6/100;
					System.out.println("O Valor a ser pago é R$ " + valorpago);
				}
				break;
				//System.out.println("Opção invalida!");

				//sc.close();
			
		}

	}

}
