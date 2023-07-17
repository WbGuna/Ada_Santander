package br.com.ada.aula_3;

import java.util.Set;
import java.util.HashSet;

public class Aula_3_exercicio_5 {
	public static void main(String[] args) {
		
	}
	
    public static boolean elementosRepetidos(double[] input){
        Set<Double> set = new HashSet<>();
        for (double d : input) {
            if (set.contains(d))
                return true;
            set.add(d);
        }
        return false;
    }
}
