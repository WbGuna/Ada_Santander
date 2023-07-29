package br.com.ada.triangle_project;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
      System.out.println(Triangle.calculatePerimeter(5, 10, 10) == 25);
      System.out.println(Triangle.calculateSemiperimeter(5, 10, 10) == 12.5);
      System.out.println(Triangle.calculateArea(5, 10, 10) == 24.21) ;
      System.out.println(Triangle.calculateHeight(5, 24.21) == 9.68);
      System.out.println(Triangle.calculateHeight(10, 24.21) == 4.84);
      System.out.println(Triangle.calculateHeight(10, 24.21) == 4.84);
      System.out.println(Arrays.toString(Triangle.calculateAngles(5, 10, 10)).equals("[28° 57' 18.09\", 75° 31' 20.96\", 75° 31' 20.96\"]"));
      System.out.println(Triangle.calculateInradius(5, 10, 10) == 1.94);
      System.out.println(Triangle.calculateCircumradius(5, 10, 10) == 5.15);
      System.out.println(Arrays.equals(Triangle.calculateMedians(5, 10, 10), new double[]{9.68, 6.12, 6.12}));

	}

}
