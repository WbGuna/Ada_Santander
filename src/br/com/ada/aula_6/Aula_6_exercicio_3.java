package br.com.ada.aula_6;

import br.com.ada.enuns.Semana;

public class Aula_6_exercicio_3 {

	public static void main(String[] args) {
		System.out.println(fromString("domingo"));
		System.out.println(fromString("segunda-feira"));
		System.out.println(fromString("terça-feira"));
		System.out.println(fromString("quarta-feira"));
		System.out.println(fromString("quinta-feira"));
		System.out.println(fromString("sexta-feira"));
		System.out.println(fromString("sábado"));
		System.out.println(fromString("teste"));
	}

	public static Semana fromString(String name) {
		for (Semana dia : Semana.values()) {
			if (dia.getName().equalsIgnoreCase(name)) {
				return dia;
			}
		}
		throw new IllegalArgumentException("Nome inválido: " + name);
	}

}