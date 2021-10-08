package main.cricketmatch.models;

public class DefensiveBatsMan extends Player {

    int[] runs = {0, 1, 2, 3};

    @Override
    public int getRunForTheCurrentBall() {
        return runs[randomRuns.nextInt(4)];
    }
}
