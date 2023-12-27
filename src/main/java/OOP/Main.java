package OOP;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Hero> whiteTeam = createWhite();
        ArrayList<Hero> blackTeam = createBlack();
        whiteTeam.forEach(n -> System.out.println(n.toString()));
        System.out.println("*************");
        blackTeam.forEach(n -> System.out.println(n.toString()));
    }

    static String getName() {
        return NameOfHeroes.values()[new Random().nextInt(NameOfHeroes.values().length - 1)].name();
    }

    static ArrayList<Hero> createWhite() {
        ArrayList<Hero> team = new ArrayList<>();
        int rand;
        for (int i = 0; i < 10; i++) {
            rand = new Random().nextInt(0, 4);
            switch (rand) {
                case 0:
                    team.add(new Crossbower(getName()));
                    break;
                case 1:
                    team.add(new Pikeman(getName()));
                    break;
                case 2:
                    team.add(new Monk(getName()));
                    break;
                case 3:
                    team.add(new Peasant(getName()));
                    break;
            }
        }
        return team;
    }

    static ArrayList<Hero> createBlack() {
        ArrayList<Hero> team = new ArrayList<>();
        int rand;
        for (int i = 0; i < 10; i++) {
            rand = new Random().nextInt(0, 4);
            switch (rand) {
                case 0:
                    team.add(new Sniper(getName()));
                    break;
                case 1:
                    team.add(new Rogue(getName()));
                    break;
                case 2:
                    team.add(new Wizard(getName()));
                    break;
                case 3:
                    team.add(new Peasant(getName()));
                    break;
            }
        }
        return team;
    }
}
