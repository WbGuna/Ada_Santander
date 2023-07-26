package br.com.ada.aula_7;

import java.util.Scanner;

import br.com.ada.enuns.Semana2;

public class Aula_7_exercicio_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sair = false;
        while (!sair) {
            menuIdioma();
            int opcaoIdioma = 0;
            boolean opcaoIdiomaValida = false;
            while (!opcaoIdiomaValida) {
                try {
                    opcaoIdioma = Integer.parseInt(scanner.nextLine());
                    opcaoIdiomaValida = true;
                } catch (NumberFormatException e) {
                    System.out.println("Opção inválida. Digite um número inteiro.");
                    iniciaNovaCaixa();
                }
            }

            if (opcaoIdioma >= 1 && opcaoIdioma <= 3) {
                menuDia(opcaoIdioma);
                int opcaoDia = 0;
                boolean opcaoDiaValida = false;
                while (!opcaoDiaValida) {
                    try {
                        opcaoDia = Integer.parseInt(scanner.nextLine());
                        opcaoDiaValida = true;
                    } catch (NumberFormatException e) {
                        System.out.println("Opção inválida. Digite um número inteiro.");
                        iniciaNovaCaixa();
                    }
                }

                Semana2 diaEscolhido = null;
                if (opcaoDia >= 1 && opcaoDia <= Semana2.values().length) {
                    diaEscolhido = Semana2.values()[opcaoDia - 1];
                } else if (opcaoDia == Semana2.values().length + 1) {
                    sair = true;
                } else {
                    System.out.println("Opção inválida. Tente novamente.");
                    iniciaNovaCaixa();
                }

                if (diaEscolhido != null) {
                    System.out.println("Você escolheu: " + diaEscolhido);
                    iniciaNovaCaixa();
                }
            } else if (opcaoIdioma == 4) {
                sair = true;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
                iniciaNovaCaixa();
            }
        }
        scanner.close();
    }

    public static void iniciaNovaCaixa() {
        System.out.println("");
        System.out.println("**============================================**");
        System.out.println("");
    }

    public static void menuIdioma() {
        System.out.println("Escolha um idioma:");
        System.out.println("1. Português");
        System.out.println("2. Inglês");
        System.out.println("3. Espanhol");
        System.out.println("4. Sair do programa");
    }

    public static void menuDia(int opcaoIdioma) {
        System.out.println("Escolha um dia da semana:");
        int i = 1;
        for (Semana2 dia : Semana2.values()) {
            System.out.println(i + ". " + dia.getName()[opcaoIdioma - 1]);
            i++;
        }
        System.out.println(i + ". Sair do programa");
    }
}
