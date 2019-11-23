package PracticeExercise;

import com.sun.media.sound.SoftEnvelopeGenerator;

import java.sql.SQLOutput;

public class Main {

    public static void main1(String[] args) {
        // this is a single line comment
        /*this is a
        comment on multiple lines
         */
        //this command writes a text to the console
        System.out.println("ceau!");

        //every variable has a type and a name, followed by;
        boolean fisrtBoolean; //this is a called a declaration
        fisrtBoolean = true; //this is called assigning the value true to firstBoolean
        System.out.println(fisrtBoolean);

        boolean hasChildren = false; //declaration and assignment in a single line
        System.out.println(hasChildren);

        boolean hasThreeChildren = true;
        boolean has3Children = true;

        //this will work ?
        /*
        boolean 3Children;
         */
        boolean anotherBoolean = has3Children;

        byte firstByteDeclaration = 23; //first declaration and assignment of byte
        System.out.println(firstByteDeclaration); //print to console
        firstByteDeclaration = -12; //re-assign a value to a byte
        System.out.println(firstByteDeclaration);

        firstByteDeclaration = 0;
        System.out.println(firstByteDeclaration - 1);

        firstByteDeclaration = 127;
        System.out.println(firstByteDeclaration + 120);

        firstByteDeclaration = (byte) (firstByteDeclaration + 1);
        System.out.println(firstByteDeclaration);

        System.out.println("*******************");
        System.out.println("Byte max and min value");
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        System.out.println("*******************");
        System.out.println("short datatype");
        short variableOn16Bits = 16000;
        variableOn16Bits = (short) (variableOn16Bits * 2);
        System.out.println(variableOn16Bits);

        System.out.println("*******************");
        System.out.println("integer datatype");
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        int myIntNumber = 2_000_000;
        System.out.println(myIntNumber);

        System.out.println("*******************");
        System.out.println("Long datatype");
        long aVeryLargeValue = variableOn16Bits * myIntNumber;
        System.out.println(aVeryLargeValue);

        System.out.println("*******************");
        System.out.println("Real datatypes");
        float aFloatValue = 6;
        System.out.println(aFloatValue);
        System.out.println(aFloatValue / 5);

        int testDivision = 6 / 5;
        System.out.println(testDivision);

        aFloatValue = (float) 6.3;
        aFloatValue = 6.3F;

        float periodValue = (float) 2 / 3;
        System.out.println(periodValue);

        double periodValueDouble = (double) 2 / 3;
        System.out.println(periodValueDouble);

    }

    public static void main2(String[] args) {
        int a = 2;
        int b = 3;
        int c = 5;
        System.out.println(a + b + c);
        int sum = a + b + c;
        System.out.println(sum);

        int product = a * b;
        System.out.println(product);

        double division = (double) b / c;
        System.out.println(division);

        int diff = c - a;
        System.out.print("c - a = "); //does not jump to next line
        System.out.println(diff);

        System.out.println("***************");
        System.out.println("a ");
        System.out.println((a));
        a = a + 2; //la a adun un 2, apoi noul rezultat i-l atribui lui a
        System.out.println(a);
        a += 2; //this translates to a = a + 2
        System.out.println(a);

        System.out.println("*********************");
        System.out.println(b);
        b -= 1;
        System.out.println(b);

        System.out.println(c);
        c *= 2; //same with / ; c/=2;
        System.out.println(c);
        c /= 2;
        System.out.println(c);

        System.out.println("*************");
        System.out.println(a);
        a += 1; // a = a + 1
        System.out.println(a);
        a++; // a = a + 1
        System.out.println(a);


        System.out.println("Unary operator");
        a = 7;
        b = 9;
        int newSum = (++a) + (b++);
        System.out.println(newSum);
        System.out.println(a);
        System.out.println(b);

        String text = "sir de caractere";
        char character = 's';
    }

    public static void main(String[] args) {

        String a = "text";
        String b = "new text";
        String c = a + b;
        System.out.println(c);
    }
}


