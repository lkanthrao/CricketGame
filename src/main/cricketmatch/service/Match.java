package main.cricketmatch.service;

import main.cricketmatch.models.OverModel;
import main.cricketmatch.models.Player;

public class Match {

    public static final String BATSMAN_WON = "Batsman Won";
    public static final String MATCH_LOST = "Match Lost";

    private Player bowlerModel;
    private Player batsManModel;
    private OverModel overModel;
    private int target;

    private MATCHRESULT matchresult;

    public Match(int pTarget, Player pBatsManModel, Player pBowlerModel, OverModel pOverModel) {
        this.target = pTarget;
        this.batsManModel = pBatsManModel;
        this.bowlerModel = pBowlerModel;
        this.overModel = pOverModel;
    }

    public void startTheMatch() {

        int totalRuns = 0;

        for (int eachBall = 0; eachBall < overModel.NUMBER_OF_BALLS_IN_A_OVER; eachBall++) {
            int bowlerRunPerBall = bowlerModel.getRunForTheCurrentBall();
            int batsManRunPerBall = batsManModel.getRunForTheCurrentBall();

            batsManModel.addRuns(batsManRunPerBall);

            if (isBatsManOut(bowlerRunPerBall, batsManRunPerBall)) {
                matchresult = MATCHRESULT.LOSS;
                return;
            }
            totalRuns = totalRuns + batsManRunPerBall;

            if (totalRuns >= target) {
                matchresult = MATCHRESULT.WON;
                return;
            }
        }
    }

    private boolean isBatsManOut(int bowlerRunPerBall, int batsManRunPerBall) {
        return bowlerRunPerBall == batsManRunPerBall;
    }

    public boolean isTheMatchWon() {
        return matchresult != null && MATCHRESULT.valueOf(matchresult.name()) == MATCHRESULT.WON;
    }

    enum MATCHRESULT {
        WON,
        LOSS
    }

}
