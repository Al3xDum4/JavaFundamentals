package day1_02_11;

public class WhileExample {
    public static void main(String[] args) {
        int x = 0;

        while (x < 10) {
            System.out.println(x);
            if (x == 5) {
                continue;
            }
            if (x == 3) {
                break;
            }
            x++;
        }

    }
}
