package exercicio07tarefaflamingo;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		/*13) Fa�a um algoritmo para ler: a descri��o do produto (nome), a quantidade adquirida e o pre�o unit�rio. 
		Calcular e escrever o total (total = quantidade adquirida * pre�o unit�rio), o desconto e o total a pagar 
		(total a pagar = total - desconto), sabendo-se que:
		- Se quantidade <= 5 o desconto ser� de 2%
		- Se quantidade > 5 e quantidade <=10 o desconto ser� de 3%
		- Se quantidade > 10 o desconto ser� de 5%.*/
		
		double valorfinal;
		
	    Scanner sc = new Scanner (System.in);
        System.out.println("Digite o produto");
        String produto = sc.nextLine();
		System.out.println("Digite a quantidade do produto");
        double quantidadedoproduto = sc.nextDouble();
        System.out.println("Digite o valor do produto");
        double custodoproduto = sc.nextDouble();
        
        if (quantidadedoproduto <= 5) {
        valorfinal = quantidadedoproduto*(custodoproduto-(custodoproduto*2/100)); 
        System.out.println(" O valor total do(a) "+produto+ " � " +valorfinal); 
	    }
	    else if (quantidadedoproduto >5 && (quantidadedoproduto<= 10)) {
        valorfinal = quantidadedoproduto*(custodoproduto-(custodoproduto*3/100));
	    System.out.println(" O valor total do(a) "+produto+ " � " +valorfinal); 
        }
         else if (quantidadedoproduto > 10 ) {
         valorfinal = quantidadedoproduto*(custodoproduto-(custodoproduto*5/100));
         System.out.println(" O valor total do(a) "+produto+ " � " +valorfinal);
         
         sc.close();
         }

	}

}
