package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Abertura_Conta;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Abertura_Conta account;
		
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		System.out.println("Enter accout name: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Is there an initial deposit (y/n) ?");
		char response = sc.next().charAt(0);//leitura do caracter
		
		if (response == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialdeposit = sc.nextDouble();
			account = new Abertura_Conta(number, name, initialdeposit);
		}
		else {
			account = new Abertura_Conta(number, name);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		System.out.println();
		System.out.println("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated accoutn data: ");
		System.out.println(account);
		
		System.out.println("Enter a whitdraw value: ");
		double whitdrawValue = sc.nextDouble();
		account.whitdraw(whitdrawValue);
		System.out.println("Updated accoutn data: ");
		System.out.println(account);
		
		
		
		sc.close();
	}
}
