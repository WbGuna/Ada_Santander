package br.com.ada.aula_1;

import java.util.Scanner;

public class Aula_1_exercicio_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em graus Fahrenheit: ");
		
		double fahrenheit = sc.nextDouble();
		double celsius = fahrenheitParaCelsius(fahrenheit);
		
		System.out.printf("A temperatura em graus Celsius é: %.2f", celsius);
					
		sc.close();
	}

	private static double fahrenheitParaCelsius(double fahrenheit) {
		return 5 * ((fahrenheit - 32) / 9);
	}

}
