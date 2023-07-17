package br.com.ada.aula_3;

public class Aula_3_exercicio_3 {

	public static void main(String[] args) {
		
	}

    public static double calculoSalario(double[] input){
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
}
