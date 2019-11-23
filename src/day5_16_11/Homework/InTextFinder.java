package day5_16_11.Homework;

import sun.awt.SunHints;

import java.time.temporal.ValueRange;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InTextFinder {
    /*
    Program to find letters, numbers, words and sentences in a given text.
    Your program should support the following operations and display a menu to choose your option:
        1. Count the total number of letters in the text
        2. Count all words that contain a double l
        3. Print all words that contain a double l that is not followed by an o character
        4. Print all sentences that have 5 words exactly
        5. Compute and print the sum for all the numbers that appear in the text
        6. (Bonus) Print the last three letters in all the 6 letter words that start with a vowel.
        0. Exit"
        */

    public static void main(String[] args) {
        String input = "Ibidem quaerantur si faciliorem ac detorqueat. Novas si puram gi vulgo. Facit bonus re credo ut de major inter ob. Eaedem educta ac is dubito vitiis. Durationem tractandae perspicuum to at ad inusitatis objectivam ab. Co ac ad innumeras ac consuetae cunctatus purgantur dormienti.\n" +
                "Jam uno invenero extensum nocturna pluribus dei falleret confidam. Virorum seipsum vim quomodo qua inferri saporis memores. \n" +
                "\n" +
                "Alteram tanquam creatis viribus at si.\n" +
                "Maximam vos hoc antehac imo ignotas 19 eae aliarum fictile. Excludat is potestis me du si cognitio liberius. Sum quae rem meae male haec. Fallacem totamque at loquebar formemus suspicio ex me ne. Haereo mutata dum vix magnum tertia volunt nam suo audita. \n" +
                "\n" +
                "Dubitavit terminari to meditabor nonnullae ei potuerunt consortio ad ac. Junctas poterit ordinem fatigor ab ut quiddam subesse co.\n" +
                "Desuescam remanetne consortio quibusdam ab 7 de theologos. Ne petitis re ultimam dormiam ha vi. Tales firma favis earum venit ea ha haben.\n" +
                "Discrepant concipitur iis 129 diversitas. Longe denuo ea id porro. Incertas mo exemplum existere in. Per mutationem concipitur nam sit rea dulcedinem perfectior industriam parentibus. \n" +
                "\n" +
                "Ipsi ullO visu ipse to 12.51 boni et cera si. Veri hoc ego voce uti sumi. Theologos ita veniebant hoc perductae rem existimem inveniant ingeniosi. Ego vere heri spem dico ego. Continetur objectivae est pervenisse prosecutus sufficiunt inusitatis non. Altius ei ea ii totius terram notior vi. Cernitur deponant mutuatis perfecta potentia regendae ad in ex. \n" +
                "\n" +
                "Coelum majora quibus: adesse; quo; hoc; rum nomine multum.\n" +
                "Concipiam generales extitisse eas opportune procuravi per fal posuerunt. Eam falso via aeque ipsum oculi omnem. Finitus iis ope humanae ita sum constet ideoque. Usurpabam arrogetur sed scriptura duo ego denegante.\n" +
                "Pendeant effectus scriptis fal eam ens. Alloquendo in me du dubitandum conspicuum durationem desiderant.\n" +
                "Ac putandum tollatur singulis supersit at possimus ageretur. \n" +
                "\n" +
                "Vis viribus indutos cur ostendi usitate. Du quapropter ac de majestatis dissimilem conflantur falsitatem. Continere iis eversioni sequentia generales acquirere sic agi. Cum veritas vestrae 111 dicerem mem plausum exsolvi suppono. Cum nunc omne unde vita una vul hoc veri. Reipsa qui tam falloam his ego lor. Du ab ex fuse re addo quos prae. Ob superest immittit si ignorans si. Rea componi tam existam limites optimae ponamus. \n" +
                "\n" +
                "Potuerit scriptis fenestra judiciis si reperire quidquam at. Aliquandiu aucupantur vix intelligat sub. Nego anno et inge ipsa re regi opus. Re ferant revera dictam in primae facile at habent ex. Distinguo res ita purgantur vul percipior. Fronte inesse tamdiu ei notior ex. \n" +
                "\n" +
                "Vis declarare ll debiliora duo infinitum nam. Certi nolle supra his imo imo. Dari sibi id ea casu. Captivus hoc occurrit quanquam etc totamque fallebar. Pendeant refutent pro incipere iii nul percipio.\n" +
                "Arrogetur persuadeo sit examinare sex opportune. Sub ista hic sed eae sine sive heri. Longum ferant existi simili est dubias nul melius deo.\n";


        Scanner sc = new Scanner(System.in);
        String option;
        do {
            System.out.println("1. Count the total number of letters in the text \n2. Count all words that contain a double l\n3. Print all words that contain a double l that is not followed by an o character\n4. Print all sentences that have 5 words exactly\n5. Compute and print the sum for all the numbers that appear in the text\n6. (Bonus) Print the last three letters in all the 6 letter words that start with a vowel\n0. Exit\n\n");
            System.out.print("Your option is: ");
            option = sc.nextLine();
            switch (option) {
                case "1": {
                    String regex = "(\\w)";
                    Pattern pattern = Pattern.compile(regex);
                    Matcher matcher = pattern.matcher(input);
                    int count = 0;
                    while (matcher.find()) {
                        count++;
                    }
                    System.out.println("total number of letters: " + count);
                    System.out.println();
                }
                break;
                case "2": {
                    String ll = "([l]{2})";
                    Pattern pattern1 = Pattern.compile(ll);
                    Matcher matcher1 = pattern1.matcher(input);
                    int count1 = 0;
                    while (matcher1.find()) {
                        count1++;
                    }
                    System.out.println("all words that contain a double l is: " + count1);
                    System.out.println();
                }
                break;
                case "3": {
                    String llo = ("(\\w+.l{2}(?!o)\\w+)");
                    Pattern pattern2 = Pattern.compile(llo);

                    Matcher matcher2 = pattern2.matcher(input);
                    while (matcher2.find()) {
                        System.out.println(matcher2.group());
                    }
                }
                break;
                case "4":
                    String only5Words = "([A-Z]\\w+\\s\\w+\\s\\w+\\s\\w+\\s\\w+[.])";
                    Pattern pattern3 = Pattern.compile(only5Words);
                    Matcher matcher3 = pattern3.matcher(input);
                    while (matcher3.find()) {
                        System.out.println(matcher3.group());
                    }
                    break;
                case "5":
                    String onlyNumber = "(([0-9]+[.][0-9]+)|[0-9]+)";
                    Pattern pattern4 = Pattern.compile(onlyNumber);
                    Matcher matcher4 = pattern4.matcher(input);
                    double sum = 0;
                    while (matcher4.find()) {
                        System.out.println(matcher4.group());
                        sum += Double.parseDouble(matcher4.group());
                    }
                    System.out.println("Sum is: " + sum);
                    break;
                case "6":
                    String vowelSixLetters = "((\\b[a,e,i,o,u,A,E,I,O,U]\\w{2})(\\w{3})\\b)";
                    Pattern pattern5 = Pattern.compile(vowelSixLetters);
                    Matcher matcher5 = pattern5.matcher(input);

                    while (matcher5.find()) {
                        System.out.println(matcher5.group(1) + " / the last 3 letters from this word is: " + matcher5.group(3));

                    }
                    break;
                case "0":
                    break;
                default:
                    System.out.println("Optiune incorecta!Alegeti optiune din meniu [1-6]");
                    System.out.println();
                    continue;
            }
            System.out.println();
        } while (!"0".equalsIgnoreCase(option));
    }
}
