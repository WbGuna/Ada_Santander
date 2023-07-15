package br.com.ada.frutas;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Frutas {
    public static void main(String[] args) {
        String[] frutas = {"Pera", "Laranja", "Maçã", "Tomate", "Caqui"};
        int[] quantidade = new int[frutas.length];
        double total = 0;
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Quantas " + frutas[i] + " você deseja comprar?");
            quantidade[i] = sc.nextInt();
            total += calcularPreco(quantidade[i]);
        }

        for (int i = 0; i < frutas.length; i++) {
            double precoFruta = calcularPreco(quantidade[i]);
            System.out.println("Você comprou " + quantidade[i] + " " + frutas[i] + " por R$" + df.format(precoFruta));
        }

        System.out.println("O valor total da compra é: R$" + df.format(total));
        System.out.println("Obrigado pela compra! Volte sempre!");
        sc.close();
    }

    public static double calcularPreco(int quantidade) {
        double preco;
        if (quantidade > 9) {
            preco = quantidade * 1.25;
        } else {
            preco = quantidade * 1.45;
        }
        return preco;
    }
}

