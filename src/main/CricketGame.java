package main;

import main.cricketmatch.models.*;
import main.cricketmatch.service.Match;

public class CricketGame {

    public static final int TARGET = 25;

    public static void main(String[] args) {

        Player batsMan = new DefensiveBatsMan();

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
