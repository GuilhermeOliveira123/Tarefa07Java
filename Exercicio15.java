package exercicio07tarefaflamingo;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		/*15) Uma empresa quer verificar se um empregado est� qualificado para a aposentadoria ou n�o. 
		Para estar em condi��es, um dos seguintes requisitos deve ser satisfeito:*/
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite nome do solicitante");
        String solicitante = sc.nextLine();
        System.out.println ( "Digite o ano de nascimento do solicitante" );
        int anodenascimento = sc.nextInt();
        System.out.println ( "Digite o ano atual." );
        int anoatual = sc.nextInt();
        int idade = anoatual - anodenascimento;
        
		System.out.println ( "Digite o ano de admiss�o no trabalho" );
		int anodeadmissao = sc.nextInt();

		 int tempodetrabalho =anoatual - anodeadmissao;

	      if (idade >= 65) {

	    	System.out.println("O solicitante "+solicitante +","+"pode se aposentar.");

				}
				else if (tempodetrabalho >= 30) {
					System.out.println("O solicitante "+solicitante +","+"pode se aposentar.");
				}
				else if (idade >= 60 && tempodetrabalho >= 25) {
					System.out.println("O solicitante "+solicitante +","+"pode se aposentar.");

				}
				else {
					System.out.println("N�o requerer.");
				    		sc.close();
				}

	}

}
