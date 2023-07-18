package br.com.ada.aula_3;

import java.util.Scanner;

public class Aula_3_exercicio_6 {

	public static void main(String[] args) {
		lerTriangulo();

	}

	public static double calcularArea(double a, double b, double c) {
	    double s = (a + b + c) / 2;
	    return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}
	
    public static void lerTriangulo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o comprimento do lado a: ");
        double a = sc.nextDouble();
        System.out.println("Digite o comprimento do lado b: ");
        double b = sc.nextDouble();
        System.out.println("Digite o comprimento do lado c: ");
        double c = sc.nextDouble();
        System.out.printf("A área do triângulo é: %.2f\n", calcularArea(a, b, c));
        sc.close();
    }	
}
