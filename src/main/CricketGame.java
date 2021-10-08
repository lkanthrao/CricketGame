package main;

import com.cricketmatch.models.Match;
import com.cricketmatch.models.OverModel;
import com.cricketmatch.models.PlayerModel;

public class CricketGame {

    public static final int TARGET = 12;

    public static void main(String[] args) {

        PlayerModel batsMan = new PlayerModel();

        PlayerModel bowler = new PlayerModel();

        OverModel overModel = new OverModel(6);

        Match match = new Match(TARGET, batsMan, bowler, overModel);
        match.startTheMatch();

        if (match.isTheMatchWon()) {
            System.out.println("Match Won");
        } else {
            System.out.println("Match Lost");
        }
    }

}
