package exercicio07tarefaflamingo;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		/*12) Fa�a um algoritmo para ler um n�mero que � um c�digo de usu�rio. Caso este c�digo seja
		diferente de um c�digo armazenado internamente no algoritmo (igual a 1234) deve ser apresentada a mensagem
		�Usu�rio inv�lido!�. Caso o C�digo seja correto, deve ser lido outro valor que � a senha. Se esta senha estiver 
		incorreta (a certa � 9999) deve ser mostrada a mensagem �senha incorreta�. Caso a senha esteja correta, 
		deve ser mostrada a mensagem �Acesso permitido�.*/
		
		int codigo, senha;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira o c�digo de acesso: ");
		codigo = entrada.nextInt();
		
		if (codigo == 1234) {
			System.out.print("Insira a senha de acesso: ");
			senha = entrada.nextInt();
			if(senha == 9999) {
				System.out.println("Acesso permitido");
			} else {
				System.out.println("Senha incorreta");
			}
		} else {
			System.out.println("C�digo incorreto");
		}
		
		entrada.close();
	}

	}

