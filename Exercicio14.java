package exercicio07tarefaflamingo;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		/*14) Fa�a um algoritmo para ler as 3 notas obtidas por um aluno nas 3 verifica��es e a m�dia 
		dos exerc�cios que fazem parte da avalia��o. Calcular a m�dia de aproveitamento, 
		usando a f�rmula abaixo e escrever o conceito do aluno de acordo com a tabela de conceitos mais abaixo:*/
		
		Scanner sc = new Scanner (System.in);
	    
	     System.out.println("Digite nome do aluno");
        String nomedoaluno = sc.nextLine();
       
        System.out.println ( " Digite a primeira nota do aluno" );
        
        double nota1 =  sc.nextDouble();
           
        System.out.println ( " Digite a segunda nota do aluno" );
       
        double  nota2 =   sc.nextDouble();
       
        System.out.println ( " Digite a terceira nota do aluno" );
          
        double nota3 =  sc.nextDouble();
           
           
           double mediaaluno = ( nota1 + nota2 + nota3 ) / 3 ;
           System.out.println ( "A m�dia do aluno "+nomedoaluno+ " � "+ mediaaluno+ "." );
           
          
           if ( ( mediaaluno >= 0 ) && ( mediaaluno < 5.9) ){
           	System.out.println ( "Nota D" );
           } else  if ( ( mediaaluno >= 6 ) && ( mediaaluno < 7.4 ) ){
           	System.out.println ( "Nota C" );
           } else  if ( ( mediaaluno >= 7.5 ) && ( mediaaluno < 8.9 ) ){
           	System.out.println ( "Nota B" );
           } else  if  ( mediaaluno >= 9 ) {
           	System.out.println ( "Nota A" );
           	sc.close();
           }

	}

}
