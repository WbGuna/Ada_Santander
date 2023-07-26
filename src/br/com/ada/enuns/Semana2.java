package br.com.ada.enuns;

public enum Semana2 {
	DOMINGO(new String[]{"domingo", "Sunday", "el domingo"}, 1), 
	SEGUNDA_FEIRA(new String[]{"segunda-feira", "Monday", "lunes"}, 2), 
	TERCA_FEIRA(new String[]{"terça-feira", "Tuesday", "martes"}, 3),
	QUARTA_FEIRA(new String[]{"quarta-feira", "Wednesday", "jueves"}, 4), 
	QUINTA_FEIRA(new String[]{"quinta-feira", "Thursday", "viernes"}, 5), 
	SEXTA_FEIRA(new String[]{"sexta-feira", "Friday", "viernes"}, 6),
	SABADO(new String[]{"sábado", "Saturday", "el sábado"}, 7);

	final String[] name;
	final int dia;

	Semana2(String[] name, int dia) {
		this.name = name;
		this.dia = dia;
	}

	public String[] getName() {
		return name;
	}

	public int getDia() {
		return dia;
	}

	public static Semana2 descricaoEnum(String name) {
	    for (Semana2 dia : Semana2.values()) {
	        for (String n : dia.getName()) {
	            if (n.equalsIgnoreCase(name)) {
	                return dia;
	            }
	        }
	    }
	    throw new IllegalArgumentException("Nome inválido: " + name);
	}
}
