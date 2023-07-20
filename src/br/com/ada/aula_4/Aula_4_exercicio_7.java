package br.com.ada.aula_4;

public class Aula_4_exercicio_7 {

	public static void main(String[] args) {
		int[][] entradas = { { 2, 2, 5 }, { 3, 3, 5 }, { 2, 2, 2 }, { 2, 5, 2 }, { 2, 4, 3 }, { 150, 120, 220 },
				{ 122, 252, 130 }, { 152, 200, 351 }, { 1232, 2200, 120 }, { 1, 2, 1 }, { 2, 1, 2 } };

		String[] saidas = { "LadosInvalidosException", "true", "true", "LadosInvalidosException", "true", "true",
				"LadosInvalidosException", "true", "LadosInvalidosException", "LadosInvalidosException", "true" };

		for (int i = 0; i < entradas.length; i++) {
			String resultado = "true";

			try {
				eUmTriangulo(entradas[i]);
			} catch (LadosInvalidosException e) {
				resultado = "LadosInvalidosException";
			}
			String esperado = saidas[i];

			System.out.println("Resultado: " + resultado);
			System.out.println("Esperado: " + esperado);
			System.out.println(resultado == esperado);
			System.out.println();
		}
	}

	public static void eUmTriangulo(int[] input) throws LadosInvalidosException {
		 if (input.length != 3)
	            throw new LadosInvalidosException("O array deve ter exatamente 3 elementos.");
	        if (input[0] <= 0 || input[1] <= 0 || input[2] <= 0)
	            throw new LadosInvalidosException("Os lados devem ser maiores que zero.");
	        if (input[0] >= input[1] + input[2] || input[1] >= input[0] + input[2] || input[2] >= input[0] + input[1])
	            throw new LadosInvalidosException("Os lados não formam um triângulo.");
	}
}
