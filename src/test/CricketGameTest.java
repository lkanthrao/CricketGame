package test;


import java.util.stream.Stream;

class CricketGameTest {


    public static void main(String[] args) {
        String[] parameters = "1,2".split(",");

        Stream.of(parameters).mapToInt(value -> Integer.valueOf(value)).sum();
    }


    public void should_return_if_match_is_won_lost() {



    }
}