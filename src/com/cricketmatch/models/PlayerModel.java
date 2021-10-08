package com.cricketmatch.models;

import java.util.Random;

public class PlayerModel {

    //    TODO move to abstract class
    public final int MAXIMUMRUNSPERBOWL = 6;

    Random randomRuns = new Random();

    public int getRunForThisBall() {
        return randomRuns.nextInt(MAXIMUMRUNSPERBOWL);
    }

}
