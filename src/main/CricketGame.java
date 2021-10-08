package main;

import main.cricketmatch.models.*;

public class CricketGame {

    public static final int TARGET = 25;

    public static void main(String[] args) {

        Player batsMan = new DefensivePlayer();

        Player bowler = new Player();

        OverModel overModel = new OverModel(6);

        Match match = new Match(TARGET, batsMan, bowler, overModel);
        match.startTheMatch();

        if (match.isTheMatchWon()) {
            System.out.println("Match Won");
        } else {
            System.out.println("Match Lost");
        }

        batsMan.printScore();

    }

}
