package day3_09_11;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class exercitiu_clasa_invers_int {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a=");
        int a = input.nextInt();

        System.out.print("b=");
        int b = input.nextInt();

        int c = a;
        a = b;
        b = c;

        System.out.printf("a=%d b=%d %n", a, b);
    }
}
