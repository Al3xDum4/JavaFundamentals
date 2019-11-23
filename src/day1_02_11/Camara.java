package day1_02_11;

import day1_02_11.Borcan;

public class Camara {
    public static void main(String[] args) {
        Borcan borcan1 = new Borcan();
        borcan1.setContinut("Castraveti");
        System.out.println(borcan1.getContinut());

        Borcan borcan2 = new Borcan();
        borcan2.setContinut("Castraveti");

        System.out.println(borcan1.equals(borcan2));

    }
}
