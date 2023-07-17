package br.com.ada.aula_3;

public class Aula_3_exercicio_4 {

	public static void main(String[] args) {
		
	}

    public static int primeiroCaractereUnico(String input){
        int[] freq = new int[256];
        for (int i = 0; i < input.length(); i++)
            freq[input.charAt(i)]++;
        for (int i = 0; i < input.length(); i++)
            if (freq[input.charAt(i)] == 1)
                return i;
        return -1;
    }	
}
