package day1_02_11;

public class ReverseExample {
    public static void main(String[] args) {
        StringBuilder palindrom = new StringBuilder("Rotator");
        System.out.println(palindrom);

        StringBuilder reversePalindrom = new StringBuilder(palindrom);
        palindrom.reverse();
        System.out.println(reversePalindrom);

        if (String.valueOf(palindrom).equalsIgnoreCase(String.valueOf(reversePalindrom))) {
            System.out.println("Nu este palindrom " + palindrom + " " + reversePalindrom);
        }

    }
}
