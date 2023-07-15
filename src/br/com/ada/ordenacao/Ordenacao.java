package br.com.ada.ordenacao;

import java.util.Arrays;

public class Ordenacao {

	public static void main(String[] args) {
		int[] numbers = {5, 4, 1, 2, 3};
		int[] ascendingOrder = sortAscendingOrder(numbers);
		int[] descendingOrder = sortDescendingOrder(numbers);

	    System.out.println(Arrays.toString(numbers));
	    System.out.println(Arrays.toString(ascendingOrder));
	    System.out.println(Arrays.toString(descendingOrder));

	}
	
	public static int[] sortAscendingOrder(int[] numbers) {
	    int[] array = numbers.clone();
	    for (int i = 0; i < array.length; i++) {
	        for (int j = i + 1; j < array.length; j++) {
	            if (array[i] > array[j]) {
	                int temp = array[i];
	                array[i] = array[j];
	                array[j] = temp;
	            }
	        }
	    }
	    return array;
	}

	public static int[] sortDescendingOrder(int[] numbers) {
	    int[] array = numbers.clone();
	    for (int i = 0; i < array.length; i++) {
	        for (int j = i + 1; j < array.length; j++) {
	            if (array[i] < array[j]) {
	                int temp = array[i];
	                array[i] = array[j];
	                array[j] = temp;
	            }
	        }
	    }
	    return array;
	}

}
