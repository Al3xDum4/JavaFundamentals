package day1_02_11;

public class ForExample {
    public static void main(String[] args) {
        String palindrom = "Rotator";
        for (int i = 0; i < palindrom.length(); i++) {
            if (palindrom.charAt(i) != palindrom.charAt(palindrom.length() - i - 1)) {
                System.out.println("Nu este palindrom " + palindrom.charAt(i) + " != " + palindrom.charAt(palindrom.length() - i - 1));
                break;
            }
        }
    }
}
