package Banco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, digite o número do banco:");
		var NumeroConta = sc.nextInt();
		System.out.println("Por favor, digite o número da Agência: ");
		var NumeroAgencia = sc.next();
		System.out.println("Digite seu nome: ");
		var NomeCliente = sc.next();
		System.out.println("Digite seu saldo: ");
		var SaldoCliente = sc.nextDouble();
		
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque \n",NomeCliente, NumeroAgencia, NumeroConta, SaldoCliente);
		sc.close();
		
	}

}
