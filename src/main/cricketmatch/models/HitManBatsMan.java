package main.cricketmatch.models;

public class HitManBatsMan extends Player {

        int[] runs = {4, 6};

        @Override
        public int getRunForTheCurrentBall() {
            return runs[randomRuns.nextInt(2)];
        }
}
