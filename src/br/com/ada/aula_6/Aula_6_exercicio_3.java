package br.com.ada.aula_6;

import br.com.ada.enuns.Semana;
import java.util.Scanner;

public class Aula_6_exercicio_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sair = false;
        while (!sair) {
            menu();
            int opcao = 0;
            boolean opcaoValida = false;
            while (!opcaoValida) {
                try {
                    opcao = Integer.parseInt(scanner.nextLine());
                    opcaoValida = true;
                } catch (NumberFormatException e) {
                    System.out.println("Opção inválida. Digite um número inteiro.");
                    iniciaNovaCaixa();
                }
            }

            String diaEscolhido = null;
            switch (opcao) {
                case 1:
                    diaEscolhido = "domingo";
                    break;
                case 2:
                    diaEscolhido = "segunda-feira";
                    break;
                case 3:
                    diaEscolhido = "terça-feira";
                    break;
                case 4:
                    diaEscolhido = "quarta-feira";
                    break;
                case 5:
                    diaEscolhido = "quinta-feira";
                    break;
                case 6:
                    diaEscolhido = "sexta-feira";
                    break;
                case 7:
                    diaEscolhido = "sábado";
                    break;
                case 8:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    iniciaNovaCaixa();
            }
            if (diaEscolhido != null) {
                try {
                    Semana dia = Semana.descricaoEnum(diaEscolhido);
                    System.out.println("Você escolheu: " + dia);
                    iniciaNovaCaixa();
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        scanner.close();
    }
  
    public static void iniciaNovaCaixa() {
    	  System.out.println("");
          System.out.println("**============================================**");
          System.out.println("");
    }
    
    public static void menu() {
    	 System.out.println("Escolha um dia da semana:");
         System.out.println("1. Domingo");
         System.out.println("2. Segunda-feira");
         System.out.println("3. Terça-feira");
         System.out.println("4. Quarta-feira");
         System.out.println("5. Quinta-feira");
         System.out.println("6. Sexta-feira");
         System.out.println("7. Sábado");
         System.out.println("8. Sair do programa");
    }
}

