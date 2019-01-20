package com.zipcodewilmington.assessment1.part5;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSORS = "scissors";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        String winSign = "";

        if (ROCK.equals(handSign)) {
            winSign = PAPER;

        } else if (PAPER.equals(handSign)) {
            winSign = SCISSORS;

        } else if (SCISSORS.equals(handSign)) {
            winSign = ROCK;
        }

        return winSign;
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        String loseSign = "";

        switch (handSign) {
            case PAPER:
                loseSign = ROCK;
                break;

            case SCISSORS:
                loseSign = PAPER;
                break;

            case ROCK:
                loseSign = SCISSORS;

        }

        return loseSign;
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {

        if (getWinningMove(handSignOfPlayer1).equals(handSignOfPlayer2)) {
            return handSignOfPlayer2;
        } else {
            return handSignOfPlayer1;
        }

    }
}