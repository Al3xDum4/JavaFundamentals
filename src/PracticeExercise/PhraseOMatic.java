package PracticeExercise;

public class PhraseOMatic {
    public static void main(String[] args) {
        //make three sets of words to choose from. Add your own!

        String[] worldListOne = {"24/7", "acord", "semiton", "arpegiu", "clapa", "coarda", "t2e", "miri", "masina", "elicopter"};

        String[] worldListTwo = {"timeea", "eunice", "alice", "bunici", "colegi", "octavia", "skoda", "grecia", "janta", "prapadit"};

        String[] worldListThree = {"chitara", "tobe", "voce", "bass", "sparanghel", "praf", "amuleta", "telefon", "java", "copil"};

        //find out how many words are in each list
        int oneLength = worldListOne.length;
        int twoLength = worldListTwo.length;
        int threeLength = worldListThree.length;

        //generate three random numbers
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        //now bulid a phrase
        String phrase = worldListOne[rand1]+" "+worldListTwo[rand2]+" "+worldListThree[rand3];

        //print out the phrase
        System.out.println("What we need is a "+phrase);
    }
}
