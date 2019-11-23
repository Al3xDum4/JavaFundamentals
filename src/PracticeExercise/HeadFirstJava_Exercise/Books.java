package PracticeExercise.HeadFirstJava_Exercise;

class Books {
    String titles;
    String author;

    static class BooksTestDrive {

        public static void main(String[] args) {
            Books[] myBooks = new Books[3];
            int x = 0;
            myBooks[0]=new Books();
            myBooks[1]=new Books();
            myBooks[2]=new Books();
            myBooks[0].titles = "The Grapes of Java";
            myBooks[1].titles = "The Java Gatsby";
            myBooks[2].titles = "The Java Cookbook";
            myBooks[0].author = "bob";
            myBooks[1].author = "sue";
            myBooks[2].author = "ian";

            while (x < 3) {
                System.out.print(myBooks[x].titles);
                System.out.print(" by ");
                System.out.println(myBooks[x].author);
                x = x + 1;
            }
        }
    }
}
