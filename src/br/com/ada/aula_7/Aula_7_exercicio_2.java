package br.com.ada.aula_7;

public class Aula_7_exercicio_2 {
    public static void main(String[] args) {
        System.out.println(fatorial(3));
        System.out.println(fatorial2(3));
    }

    public static int fatorial(int limite) {
        int multiplica = 1;

        for (int i = 1; i <= limite; i++) {
            multiplica *= i;
        }
        return multiplica;
    }

    public static int fatorial2(int limite) {
        if (limite == 0) {
            return 1;
        }
        return limite * fatorial2(limite - 1);
    }
}

