package br.com.ada.aula_5;

import java.text.DecimalFormat;
import java.util.Scanner;

import br.com.ada.exception.FrutasZeradasException;
import br.com.ada.exception.QuantidadeNegativaFrutasException;

public class Aula_5_exercicio_1 {

	public static void main(String[] args) {
		String[] frutas = { "Peras", "Laranjas", "Maçãs", "Tomates", "Caquis" };
		int[] quantidade = new int[frutas.length];
		double total = 0;
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");

		for (int i = 0; i < frutas.length; i++) {
			System.out.println("Quantas " + frutas[i] + " você deseja comprar?");
			quantidade[i] = sc.nextInt();
			verificarQuantidadeNegativa(quantidade[i]);
			total += calcularPreco(quantidade[i]);
		}

		verificarTodasZero(quantidade);

		for (int i = 0; i < frutas.length; i++) {
			double precoFruta = calcularPreco(quantidade[i]);
			System.out.println("Você comprou " + quantidade[i] + " " + frutas[i] + " por R$" + df.format(precoFruta));
		}

		System.out.println("O valor total da compra é: R$" + df.format(total));
		System.out.println("Obrigado pela compra! Volte sempre!");
		sc.close();
	}

	public static void verificarQuantidadeNegativa(int quantidade) {
		if (quantidade < 0) {
			throw new QuantidadeNegativaFrutasException("Quantidade não pode ser negativa.");
		}
	}

	public static void verificarTodasZero(int[] quantidade) {
		boolean todasZero = true;
		for (int q : quantidade) {
			if (q != 0) {
				todasZero = false;
				break;
			}
		}
		if (todasZero) {
			throw new FrutasZeradasException("Você deve comprar pelo menos uma fruta.");
		}
	}

	public static double calcularPreco(int quantidade) {
		double preco;
		if (quantidade > 9) {
			preco = quantidade * 1.25;
		} else {
			preco = quantidade * 1.45;
		}
		return preco;
	}

}
