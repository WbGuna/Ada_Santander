package br.com.ada.aula_6;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import br.com.ada.enuns.Estado;
import br.com.ada.exception.EstadoInvalidoException;


public class Aula_6_exercicio_2 {

	public static void main(String[] args) {

		
		try {
			System.out.println(valorProdutoFinal(250.10, "MG") == 267.607);
			System.out.println(valorProdutoFinal(250.10, "RJ") == 287.615);
			System.out.println(valorProdutoFinal(250.10, "SP") == 280.112);
			valorProdutoFinal(250.10, "DF");
		} catch (EstadoInvalidoException e) {
			System.out.println("Estado Invalido!");
		}
	}

	public static double valorProdutoFinal(double valorProduto, String estadoDestino) throws EstadoInvalidoException {
	    double taxa = 0;
	    try {
	        Estado estado = Estado.valueOf(estadoDestino);
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
	    } catch (IllegalArgumentException e) {
	        throw new EstadoInvalidoException(e.getMessage());
	    }
	    return arredondar(valorProduto + valorProduto * taxa);
	}

	public static double arredondar(double numero) {
		DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
		DecimalFormat decimalFormat = new DecimalFormat("#.####", symbols);
		return Double.parseDouble(decimalFormat.format(numero));
	}
}
