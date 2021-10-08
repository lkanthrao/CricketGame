package main.cricketmatch.models;

public class HitManBatsMan extends Player {

    public final int MAXIMUMRUNSPERBOWL = 6;

    int[] runs = {4, 6};

    @Override
    public int getRunForThisBall() {
        return runs[randomRuns.nextInt(2)];
    }
}
