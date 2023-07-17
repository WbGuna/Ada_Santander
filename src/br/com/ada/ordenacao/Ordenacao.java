package br.com.ada.ordenacao;

import java.util.Arrays;

public class Ordenacao {

	public static void main(String[] args) {
		int[] numbers = {5, 4, 1, 2, 3, 8, 7, 9, 6};
		int[] ascendingOrder = sortAscendingOrder(numbers);
		int[] descendingOrder = sortDescendingOrder(numbers);
		int[] ascendingOrderOdds = sortAscendingOrderOdds(numbers);
		int[] ascendingOrderEvens = sortAscendingOrderEvens(numbers);

	    System.out.println(Arrays.toString(numbers));
	    System.out.println(Arrays.toString(ascendingOrder));
	    System.out.println(Arrays.toString(descendingOrder));
	    System.out.println(Arrays.toString(ascendingOrderOdds));
		System.out.println(Arrays.toString(ascendingOrderEvens));

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
	
	public static int[] sortAscendingOrderOdds(int[] numbers) {
	    int[] array1 = numbers.clone();
	    int cont1 = 0;
	    for (int i = 0; i < array1.length; i++) {
	        if (array1[i] % 2 != 0) {
	        	cont1++;
	        }
	    }
	    int[] array2 = new int[cont1];
	    int cont2 = 0;
	    for (int i = 0; i < array1.length; i++) {
	        if (array1[i] % 2 != 0) {
	        	array2[cont2] = array1[i];
	            cont2++;
	        }
	    }
	    for (int i = 0; i < array2.length; i++) {
	        for (int j = i + 1; j < array2.length; j++) {
	            if (array2[i] > array2[j]) {
	                int temp = array2[i];
	                array2[i] = array2[j];
	                array2[j] = temp;
	            }
	        }
	    }
	    return array2;
	}

	public static int[] sortAscendingOrderEvens(int[] numbers) {
	    int[] array1 = numbers.clone();
	    int cont1 = 0;
	    for (int i = 0; i < array1.length; i++) {
	        if (array1[i] % 2 == 0) {
	        	cont1++;
	        }
	    }
	    int[] array2 = new int[cont1];
	    int cont2 = 0;
	    for (int i = 0; i < array1.length; i++) {
	        if (array1[i] % 2 == 0) {
	        	array2[cont2] = array1[i];
	        	cont2++;
	        }
	    }
	    for (int i = 0; i < array2.length; i++) {
	        for (int j = i + 1; j < array2.length; j++) {
	            if (array2[i] > array2[j]) {
	                int temp = array2[i];
	                array2[i] = array2[j];
	                array2[j] = temp;
	            }
	        }
	    }
	    return array2;
	}
}
