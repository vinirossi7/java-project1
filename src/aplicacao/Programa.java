package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Banco;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Banco banco;
		
		System.out.println("Bem vindo ao banco Rossi!!");
		System.out.println("Qual nome do titular?");
		String nome = sc.nextLine();
		System.out.println("Digite o numero da conta: ");
		int numConta = sc.nextInt();
		
		System.out.println("é o deposito inicial?");
		char resposta = sc.next().charAt(0); 
		if(resposta == 's') {
			System.out.println("O valor inicial é: ");
			double saldoInicial = sc.nextDouble();
			banco = new Banco(nome, numConta, saldoInicial);
		}else {
			banco = new Banco(nome, numConta);
		}
		
		System.out.println("Qual valor de deposito: ");
		double deposit =sc.nextDouble();
		banco.deposito(deposit);
		System.out.println("Dados do titular: "+banco);
		
		System.out.println("Valor de saque: ");
		double saq = sc.nextDouble();
		banco.saque(saq);
		System.out.println("Dados do titular: "+banco);
		
		banco.setNome("Vinicius Voshida Rossi");
		System.out.println("Nome alterado para: "+banco.getNome());
		System.out.println("Dados do titular: "+banco);

		sc.close();
		
	}

}
