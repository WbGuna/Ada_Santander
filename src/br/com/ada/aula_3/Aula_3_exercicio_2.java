package br.com.ada.aula_3;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Aula_3_exercicio_2 {
	
	public static void main(String[] args) {
	
	}
	public static double[] custosCarro(double[] input) {
		double precoFabrica = input[0];
		double custoDistribuidor = input[1];
		double custoImpostos = input[2];
		double percentualDistribuidor = (custoDistribuidor / precoFabrica) * 100;
		double percentualImpostos = (custoImpostos / precoFabrica) * 100;
		BigDecimal bdDistribuidor = new BigDecimal(percentualDistribuidor).setScale(2, RoundingMode.DOWN);
		BigDecimal bdImpostos = new BigDecimal(percentualImpostos).setScale(2, RoundingMode.DOWN);
		double[] resultado = {bdDistribuidor.doubleValue(), bdImpostos.doubleValue()};
		return resultado;
	}
}



