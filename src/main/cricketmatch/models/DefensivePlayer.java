package main.cricketmatch.models;

public class DefensivePlayer extends Player {

    int[] runs = {0, 1, 2, 3};

    @Override
    public int getRunForThisBall() {
        return runs[randomRuns.nextInt(4)];
    }
}
