package br.com.ada.aula_4;

public class Aula_4_exercicio_3 {

	public static void main(String[] args) {
		double[][] entradas = {
                {8.0, 7.0, 8.0, 8.0},
                {5.0, 4.3, 8.0, 7.0},
                {2.0, 5.0, 8.0, 6.0},
                {4.0, 1.0, 9.0, 7.0},
                {2.0, 2.0, 10.0, 1.0},
                {2.9, 2.5, 10.0, 7.1},
                {4.4, 4.1, 8.5, 9.5},
                {5.0, 7.0, 9.0, 8.0},
                {8.0, 7.0, 8.0, 9.0},
                {8.0, 8.0, 10.0, 9.0},
                {2.0, 2.0, 5.0, 1.0}
        };

        String[] saidas = {
                "B",
                "C",
                "C",
                "D",
                "D",
                "C",
                "C",
                "B",
                "B",
                "A",
                "D"
        };

        for (int i = 0; i < entradas.length; i++) {
            String resultado = mediaAproveitamento(entradas[i]);
            String esperado = saidas[i];

            System.out.println("Resultado: " + resultado);
            System.out.println("Esperado: " + esperado);
            System.out.println(resultado.equals(esperado));
            System.out.println();
        }
    }

    public static String mediaAproveitamento(double[] input) {
    	double media = (input[0] + input[1] * 2 + input[2] * 3 + input[3]) / 7;
        if (media >= 9.0) {
            return "A";
        } else if (media >= 7.5 && media < 9.0) {
            return "B";
        } else if (media >= 6.0 && media < 7.5) {
            return "C";
        } else {
            return "D";
        }
    }
    
    public static String geraRecibo(double[] input){
        double total = 0.0;
        double discount = 0.0;
        double toPay = 0.0;
        
        for (int i = 0; i < input.length; i++) {
            total += input[i];
        }
        
        if (input.length >= 2) {
            double min = input[0];
            for (int i = 1; i < input.length; i++) {
                if (input[i] < min) {
                    min = input[i];
                }
            }
            discount = min / 2;
        }
        
        toPay = total - discount;
        
        return "Valor total: " + total + " | Valor de descontos: " + discount + " | Valor a pagar: " + toPay;
    }
}


