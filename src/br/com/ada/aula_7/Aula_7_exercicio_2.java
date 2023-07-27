package br.com.ada.aula_7;

public class Aula_7_exercicio_2 {
    public static void main(String[] args) {
        System.out.println(somaIterativo(3));
        System.out.println(somaRecursivo(3));
        System.out.println(subtracaoIterativo(3));
        System.out.println(subtracaoRecursivo(3));
        System.out.println(multiplicacaoIterativo(3));
        System.out.println(multiplicacaoRecursivo(3));
        System.out.println(divisaoIterativo(3));
        System.out.println(divisaoRecursivo(3));
    }

    public static int somaIterativo(int limite) {
        int soma = 0;
        for (int i = 1; i <= limite; i++) {
            soma += i;
        }
        return soma;
    }

    public static int somaRecursivo(int limite) {
        if (limite == 0) {
            return 0;
        }
        return limite + somaRecursivo(limite - 1);
    }

    public static int subtracaoIterativo(int limite) {
        int subtracao = 0;
        for (int i = 1; i <= limite; i++) {
            subtracao -= i;
        }
        return subtracao;
    }

    public static int subtracaoRecursivo(int limite) {
        if (limite == 0) {
            return 0;
        }
        return -limite + subtracaoRecursivo(limite - 1);
    }

    public static int multiplicacaoIterativo(int limite) {
        int multiplica = 1;
        for (int i = 1; i <= limite; i++) {
            multiplica *= i;
        }
        return multiplica;
    }

    public static int multiplicacaoRecursivo(int limite) {
        if (limite == 0) {
            return 1;
        }
        return limite * multiplicacaoRecursivo(limite - 1);
    }

    public static double divisaoIterativo(int limite) {
        double divisao = 1.0;
        for (int i = 1; i <= limite; i++) {
            divisao /= i;
        }
        return divisao;
    }

    public static double divisaoRecursivo(int limite) {
        if (limite == 0) {
            return 1.0;
        }
        return (1.0 / limite) * divisaoRecursivo(limite - 1);
    }
}


