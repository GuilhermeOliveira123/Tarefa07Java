package exercicio07tarefaflamingo;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		/*6) Ler o nome de 2 times e o número de gols marcados na partida (para cada time).
		Escrever o nome do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE.*/
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digte o número de gols do time 1");
		int time1 = sc.nextInt();
		
		System.out.println("Digte o número de gols do time 2");
		int time2 = sc.nextInt();
		
		if(time1 > time2) {
			System.out.println("O time 1 e o vencedor");
		}else if ( time2 > time1) {
			System.out.println("O time 2 e o vencedor");
		}else {
			System.out.println("Empate");
			sc.close();
		}

	}

}
