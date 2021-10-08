package com.cricketmatch.models;

public class Match {

    public static final String BATSMAN_WON = "Batsman Won";
    public static final String MATCH_LOST = "Match Lost";

    PlayerModel bowlerModel;
    PlayerModel batsManModel;
    OverModel overModel;
    int target;

    MATCHRESULT matchresult;

    enum MATCHRESULT {
        WON,
        LOSS
    }

    public Match(int pTarget, PlayerModel pBatsManModel, PlayerModel pBowlerModel, OverModel pOverModel) {
        this.target = pTarget;
        this.batsManModel = pBatsManModel;
        this.bowlerModel = pBowlerModel;
        this.overModel = pOverModel;
    }

    public void startTheMatch() {

        int totalRuns = 0;

        for (int eachBall = 0; eachBall < overModel.NUMBER_OF_BALLS_IN_A_OVER; eachBall++) {
            int bowlerRunPerBall = bowlerModel.getRunForThisBall();
            int batsManRunPerBall = batsManModel.getRunForThisBall();

            if (bowlerRunPerBall == batsManRunPerBall) {
                matchresult = MATCHRESULT.LOSS;
                return;
            }

            totalRuns = totalRuns + batsManRunPerBall;

            System.out.print(batsManRunPerBall + " ");

            if (totalRuns >= target) {
                matchresult = MATCHRESULT.WON;
                return;
            }
        }
    }

    public boolean isTheMatchWon() {
        return MATCHRESULT.valueOf(matchresult.name()) == MATCHRESULT.WON ? true : false;
    }

}
