package main;

import main.cricketmatch.models.HitManBatsMan;
import main.cricketmatch.models.Match;
import main.cricketmatch.models.OverModel;
import main.cricketmatch.models.Player;

public class CricketGame {

    public static final int TARGET = 25;

    public static void main(String[] args) {

        Player batsMan = new HitManBatsMan();

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
