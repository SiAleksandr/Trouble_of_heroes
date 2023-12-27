package OOP;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Hero> whiteTeam = createWhite();
        ArrayList<Hero> blackTeam = createBlack();
        whiteTeam.forEach(n -> n.showDistances(blackTeam));
        System.out.println("*************");
        blackTeam.forEach(n -> n.showDistances(whiteTeam));
        ArrayList<Hero> sharpshootersW = new ArrayList<>();
        for (int i = 0; i < whiteTeam.size(); i ++) {
            if (whiteTeam.get(i).heroType.equals("Crossbower")){
                sharpshootersW.add(whiteTeam.get(i));
            }
        }
        for (int c = 0; c < sharpshootersW.size(); c++) {
            int indexNearestB = ((Crossbower)sharpshootersW.get(c)).getNearestW(blackTeam);
            System.out.println(sharpshootersW.get(c) + ": ближайший к нему - " + blackTeam.get(indexNearestB) +
                    ": " + sharpshootersW.get(c).position.rangeEnemy(blackTeam.get(indexNearestB).position));
        }
        ArrayList<Hero> sharpshootersB = new ArrayList<>();
        for (int i = 0; i < blackTeam.size(); i ++) {
            if (blackTeam.get(i).heroType.equals("Sniper")) {
                sharpshootersB.add(blackTeam.get(i));
            }
        }
        for (int c = 0; c < sharpshootersB.size(); c++) {
            int indexNearestW = ((Sniper) sharpshootersB.get(c)).getNearestB(whiteTeam);
            System.out.println(sharpshootersB.get(c) + ": ближайший к нему - " + whiteTeam.get(indexNearestW) +
                    ": " + sharpshootersB.get(c).position.rangeEnemy(whiteTeam.get(indexNearestW).position));
        }
    }

    static String getName() {
        return NameOfHeroes.values()[new Random().nextInt(NameOfHeroes.values().length - 1)].name();
    }

    static ArrayList<Hero> createWhite() {
        ArrayList<Hero> team = new ArrayList<>();
        int leftLine = 0;
        int rand;
        for (int i = 0; i < 10; i++) {
            rand = new Random().nextInt(0, 4);
            switch (rand) {
                case 0:
                    team.add(new Crossbower(getName(), i, leftLine));
                    break;
                case 1:
                    team.add(new Pikeman(getName(), i, leftLine));
                    break;
                case 2:
                    team.add(new Monk(getName(), i, leftLine));
                    break;
                case 3:
                    team.add(new Peasant(getName(), i, leftLine));
                    break;
            }
        }
        return team;
    }

    static ArrayList<Hero> createBlack() {
        ArrayList<Hero> team = new ArrayList<>();
        int rightLine = 9;
        int rand;
        for (int i = 0; i < 10; i++) {
            rand = new Random().nextInt(0, 4);
            switch (rand) {
                case 0:
                    team.add(new Sniper(getName(), i, rightLine));
                    break;
                case 1:
                    team.add(new Rogue(getName(), i, rightLine));
                    break;
                case 2:
                    team.add(new Wizard(getName(), i, rightLine));
                    break;
                case 3:
                    team.add(new Peasant(getName(), i, rightLine));
                    break;
            }
        }
        return team;
    }
}
