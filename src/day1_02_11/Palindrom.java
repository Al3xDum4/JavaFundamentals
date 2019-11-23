package day1_02_11;

public class Palindrom {
    public static void main(String[] args) {
        String palindrom = "Rotator";
        for (int i = 0; i < palindrom.length() / 2; i++) {
            System.out.println(palindrom.charAt(i) + " - " + palindrom.charAt(palindrom.length() - i - 1));
            if (!String.valueOf(palindrom.charAt(i))
                    .equalsIgnoreCase(String.valueOf(palindrom.charAt(palindrom.length() - i - 1)))) {
                System.out.println("Nu este palindrom " + palindrom.charAt(i) + " != " + palindrom.charAt(palindrom.length() - i - 1));
                break;
            }
        }
    }
}
