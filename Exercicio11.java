package exercicio07tarefaflamingo;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		/*11) Uma fruteira está vendendo frutas com a seguinte tabela de preços:*/
		
		double  valordamaca,valordomorango;
		Scanner sc = new Scanner (System.in);
				
		System.out.println("Digite a quantidade de kilos do morango");
		double quantidadedomorango = sc.nextDouble(); 
		
		System.out.println("Digite a quantidade da maçã: ");
		double quantidadedamaca = sc.nextDouble();
		double quantidadedefrutas = quantidadedomorango+quantidadedamaca;
	    
		if (quantidadedomorango<=5)
	    {
        valordomorango=2.50*quantidadedomorango;       
	    }
	    else
	    {
	    valordomorango=2.20*quantidadedomorango;
	    }
	    if (quantidadedamaca<=5)
	    {
	    valordamaca=1.80*quantidadedamaca;
	    }
	    else
	    {
	    valordamaca=1.50*quantidadedamaca;
	    }
	    double valortotalpago = valordomorango+valordamaca;
	    System.out.println("O valor total a ser pago será de R$"+valortotalpago+ " e a quantidade total de kilos de frutas foi "+quantidadedefrutas+".");
	    sc.close();

	}
		 

	}


