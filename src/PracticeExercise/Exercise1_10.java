package PracticeExercise;

public class Exercise1_10 {
    public static void main(String[] args) {
        String text = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        count(text);
    }

    public static void count(String x) {
        char[] ch = x.toCharArray();
        int letter = 0;
        int space = 0;
        int numbers = 0;
        int others = 0;

        for (int i = 0; i < x.length(); i++) {
            if (Character.isLetter(ch[i])) {
                letter++;
            } else if (Character.isDigit(ch[i])) {
                numbers++;
            } else if (Character.isSpaceChar(ch[i])) {
                space++;

            } else {
                others++;
            }
        }
        System.out.println("The string is : Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");
        System.out.println("letter: " + letter);
        System.out.println("space: " + space);
        System.out.println("number: " + numbers);
        System.out.println("other: " + others);
    }
}
