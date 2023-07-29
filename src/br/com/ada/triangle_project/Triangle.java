package br.com.ada.triangle_project;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Triangle {
	
	public static double calculatePerimeter(double a, double b, double c) {
        return a + b + c;
    }

    public static double calculateSemiperimeter(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    public static double calculateArea(double a, double b, double c) {
        double s = calculateSemiperimeter(a, b, c);
        return round(Math.sqrt(s * (s - a) * (s - b) * (s - c)));
    }

    public static double calculateHeight(double base, double area) {
        return round((2 * area / base));
    }

    public static String[] calculateAngles(double a, double b, double c) {
        double A = Math.toDegrees(Math.acos((b * b + c * c - a * a) / (2 * b * c)));
        double B = Math.toDegrees(Math.acos((a * a + c * c - b * b) / (2 * a * c)));
        double C = Math.toDegrees(Math.acos((a * a + b * b - c * c) / (2 * a * b)));

        String[] angles = new String[3];
        angles[0] = degressToString(A).replace(",", ".");
        angles[1] = degressToString(B).replace(",", ".");
        angles[2] = degressToString(C).replace(",", ".");

        return angles;
    }
    
    public static double calculateInradius(double a, double b, double c) {
        double s = calculateSemiperimeter(a, b, c);
        double area = calculateArea(a, b, c);
        return round(area / s);
    }

    public static double calculateCircumradius(double a, double b, double c) {
        return round((a * b * c) / (4 * calculateArea(a, b, c)));
    }

    public static double[] calculateMedians(double a, double b, double c) {
        double ma = round(0.5 * Math.sqrt(2 * (b * b + c * c) - a * a));
        double mb = round(0.5 * Math.sqrt(2 * (a * a + c * c) - b * b));
        double mc = round(0.5 * Math.sqrt(2 * (a * a + b * b) - c * c));
        return new double[]{ma, mb, mc};
    }

    private static double round(double numero) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat decimalFormat = new DecimalFormat("#.##", symbols);
        return Double.parseDouble(decimalFormat.format(numero));
    }

    private static String degressToString(double angle) {
        double degrees = Math.floor(angle);
        double decimalMinutes = (angle - degrees) * 60;
        double minutes = Math.floor(decimalMinutes);
        double seconds = (decimalMinutes - minutes) * 60;
        return String.format("%.0f° %.0f' %.2f\"", degrees, minutes, seconds);
    }
}
