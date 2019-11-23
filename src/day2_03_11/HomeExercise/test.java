package day2_03_11.HomeExercise;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("Area :" + circleCalc());
    }

    public static double intInput(String inputStatement) {
        double diameter;
        Scanner sc = new Scanner(System.in);
        System.out.println(inputStatement);
        diameter = sc.nextInt();
        return diameter;
        }

    public static double calcCircleArea(double diameter) {
        double radius, area;
        radius = (double)diameter / 2.0;
        area = Math.PI * radius * radius;
        return area;
        }

    public static String extractOutput(double area) {
        String output;
        double fraction, mm, m, cm;
        fraction = area - (int) area;
        mm = fraction * 100.0;
        m = (int) area / 10000;
        cm = (int) area % 10000;
        output = String.valueOf(m + cm + mm);
        return output;
    }
    public static String circleCalc() {
        double diam, area;
        diam = intInput("enter diameter");
        area = calcCircleArea(diam);
        return extractOutput(area);
    }
}
