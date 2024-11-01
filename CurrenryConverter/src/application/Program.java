package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual é o preço do dólar? ");
		double dolarPrice  = sc.nextDouble();
		
		System.out.print("Quantos dólares serão comprados? ");
		double amount = sc.nextDouble();
		
		double result = CurrencyConverter.dolarToReal(amount, dolarPrice);
		
		System.out.printf("Valor a ser pago em reais = %.2f", result);
		
		sc.close();
	}

}
