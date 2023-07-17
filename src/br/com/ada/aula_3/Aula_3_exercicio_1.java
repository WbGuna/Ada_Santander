package br.com.ada.aula_3;

public class Aula_3_exercicio_1 {

	public static void main(String[] args) {
		
	}
	
    public static double custoCompra(double input) {
        double preco;
        if (input > 10) {
            preco = 1.25;
        } else {
            preco = 1.45;
        }
        double total = input * preco;
        return Math.round(total * 100.0) / 100.0;
    }

}
