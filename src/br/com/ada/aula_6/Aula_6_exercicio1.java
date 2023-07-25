package br.com.ada.aula_6;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import br.com.ada.enuns.Estado;

public class Aula_6_exercicio1 {
	public static void main(String[] args) {

		System.out.println(valorProdutoFinal(250.10, Estado.MG) == 267.607);
		System.out.println(valorProdutoFinal(250.10, Estado.RJ) == 287.615);
		System.out.println(valorProdutoFinal(250.10, Estado.SP) == 280.112);
	}

	public static double valorProdutoFinal(double valorProduto, Estado estado) {
		double taxa = 0;
		switch (estado) {
		case MG:
			taxa = 0.07;
			break;
		case SP:
			taxa = 0.12;
			break;
		case RJ:
			taxa = 0.15;
			break;
		}
		return arredondar(valorProduto + valorProduto * taxa);
	}

	public static double arredondar(double numero) {
		DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
		DecimalFormat decimalFormat = new DecimalFormat("#.####", symbols);
		return Double.parseDouble(decimalFormat.format(numero));
	}
}
