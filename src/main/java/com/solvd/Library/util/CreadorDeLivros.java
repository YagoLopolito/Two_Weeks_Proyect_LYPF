package com.solvd.Library.util;

import java.util.ArrayList;
import java.util.List;

public class CreadorDeLivros {
    public static void main(String[] args) {
        int  cant = 1000;
        int num = (int)(Math.random()*62);
        int num2 = (int)(Math.random()*62);
        int num3 = (int)(Math.random()*62);
        int num4 = (int)(Math.random()*62);

        List<String> words = new ArrayList<>();
        words.add("");
        words.add("");
        words.add("");
        words.add("");
        words.add("");
        words.add("");
        words.add("");
        words.add("");
        words.add("");
        words.add("");
        words.add("The ");
        words.add("Adventure ");
        words.add("Amazing ");
        words.add("Travel ");
        words.add("Mission ");
        words.add("Thunder ");
        words.add("Final ");
        words.add("Spectacular ");
        words.add("The ");
        words.add("Wizard ");
        words.add("Knight ");
        words.add("Power ");
        words.add("Of ");
        words.add("Lord ");
        words.add("Village ");
        words.add("Game ");
        words.add("Inglorious ");
        words.add("Pride ");
        words.add("Citadel ");
        words.add("Music ");
        words.add("Glorious ");
        words.add("Jerk ");
        words.add("Die ");
        words.add("Dead ");
        words.add("Castle ");
        words.add("Wonderful ");
        words.add("Caos ");
        words.add("Person ");
        words.add("Prince ");
        words.add("King ");
        words.add("City ");
        words.add("Work ");
        words.add("Empress ");
        words.add("Evil ");
        words.add("Good ");
        words.add("Perfect ");
        words.add("Sin ");
        words.add("Formal ");
        words.add("Plastic ");
        words.add("Taurus ");
        words.add("Dental ");
        words.add("Guard ");
        words.add("Kill ");
        words.add("Traitor ");
        words.add("Suspicious ");
        words.add("Among ");
        words.add("Us ");
        words.add("They ");
        words.add("That ");
        words.add("Wolf ");
        words.add("Eternal ");
        words.add("Life ");

for (int i = 0; i <= cant; i = i + 1){
    System.out.println("-* "+words.get(num)
            + words.get(num2)
            + words.get(num3)
            + words.get(num4));
    num = (int)(Math.random()*62);
    num2 = (int)(Math.random()*62);
    num3 = (int)(Math.random()*62);
    num4 = (int)(Math.random()*62);
}
    }
}
