package main.cricketmatch.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Player {

    public final int MAXIMUMRUNSPERBOWL = 6;
    private final List<Integer> runs = new ArrayList<>();
    Random randomRuns = new Random();

    public int getRunForTheCurrentBall() {
        return randomRuns.nextInt(MAXIMUMRUNSPERBOWL);
    }

    public List<Integer> getRuns() {
        return runs;
    }

    public void addRuns(Integer run) {
        this.runs.add(run);
    }

    //Seggregate this
    public void printScore() {
        System.out.println("Runs/ball: ");
        for (Integer run : runs) {
            System.out.print(" " + run);
        }
    }
}
