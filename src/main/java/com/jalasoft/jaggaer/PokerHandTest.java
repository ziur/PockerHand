package com.jalasoft.jaggaer;

public class PokerHandTest {

    public static void main(String[] args) {
        royalFlushIsWinner();
    }

    static int[][] rotateImage(int[][] a) {
        int size = a.length;

        int b[][] = new int[size][size];

        int pos = a.length - 1;
        for (int j = 0; j < size; j++) {
            for (int i = 0; i < size; i++) {
                b[i][pos] = a[j][i];
            }
            pos = pos - 1;
        }
        return b;
    }


    public static void royalFlushIsWinner() {
        PokerGame pokerGame = new PokerGame();
        PokerHandBuilder builder = new StringInputBuilder();
        Player juan = Player.create("Juan", builder.getHand("AH KH QH JH 10H"));
        Player pedro = Player.create("Pedro", builder.getHand("4S 4C 4H 4D 2S"));
        Player pedro2 = Player.create("Pedro", builder.getHand("8S 8C 2H 6D 6S"));
        pokerGame.addHand(juan);
        pokerGame.addHand(pedro);
        pokerGame.addHand(pedro2);
        PokerResult result = pokerGame.getResults();
        //assertTrue("royalFlushIsWinner", juan.equals(result.getWinner()));


    }

    private static void assertTrue(String test, boolean equals) {
        System.out.println(test + (equals ? "[Pass]" : "[Fail]"));
    }
}
