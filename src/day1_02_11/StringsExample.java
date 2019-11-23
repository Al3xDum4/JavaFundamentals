package day1_02_11;

public class StringsExample {
    public static void main(String[] args) {
        String str = "Ana are mere";
        System.out.println(str.length());

        System.out.println(str.substring(str.indexOf("are"), str.indexOf("are") + 3));
        System.out.println(str.substring(str.indexOf("mere"), str.indexOf("mere") + 4));

        String st1 = "aaaz";
        String st2 = new String("aaZz");

        System.out.println(st1.compareTo(st2));

        int firstindex = str.indexOf('e');
        int lastindex = str.lastIndexOf('e');
        String subStr = str.substring(firstindex + 1, lastindex - 1);
        System.out.println(firstindex + 1 + subStr.indexOf('e'));

        StringBuilder builder = new StringBuilder();
        builder.append("ana ");
        builder.append("are ");
        builder.append("mere");

        System.out.println(builder);

        builder.replace(builder.indexOf("are"), builder.indexOf("are") + 3, "avea");
        System.out.println(builder);

        String str1 = null;
        str1.length();

    }
}
