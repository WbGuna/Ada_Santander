package br.com.ada.aula_4;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Aula_4_exercicio_2 {

	 public static void main(String[] args) {
	        double[][] entradas = {
	                {1, 5.0, 2000.00},
	                {11, 4.5,2500.00},
	                {5.1, 6.7, 4500.0},
	                {1, 5.7, 4800.0},
	                {10.1, 4.7, 4100.0},
	                {15, 5.3, 6100.0},
	                {2, 8.3, 9500.0},
	                {20, 9.3, 10500.0},
	                {0.5, 11.3, 4800.0},
	                {5, 12.5, 6800.0},
	                {10, 9.1, 8200.0}
	        };

	        double[] saidas = {
	                2120.00,
	                2662.50,
	                4869.00,
	                5121.60,
	                4374.70,
	                6545.30,
	                10383.50,
	                11686.50,
	                5342.4,
	                7752.00,
	                9110.20
	        };

	        for (int i = 0; i < entradas.length; i++) {
	            double resultado = calculoSalario(entradas[i]);
	            double esperado = saidas[i];

	            System.out.println("Resultado: " + resultado);
	            System.out.println("Esperado: " + esperado);
	            System.out.println(resultado == esperado);
	            System.out.println();
	        }
	    }

	    public static double calculoSalario(double[] input) {
	    	 double tempoDeServico = input[0];
	         double inflacao = input[1];
	         double salario = input[2];
	         double reajuste = 0;

	         if (tempoDeServico >= 1 && tempoDeServico < 5) {
	             reajuste = 1;
	         } else if (tempoDeServico >= 5 && tempoDeServico < 10) {
	             reajuste = 1.5;
	         } else if (tempoDeServico >= 10) {
	             reajuste = 2;
	         }

	         double novoSalario = salario + (salario * ((reajuste + inflacao) / 100));
	         return Math.round(novoSalario * 100.0) / 100.0;
	    }

	    public static double arredondar(double numero) {
	        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
	        DecimalFormat decimalFormat = new DecimalFormat("#.##", symbols);
	       return Double.parseDouble(decimalFormat.format(numero));
	    }
	}
