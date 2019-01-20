package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {

    ROCK("ROCK", "PAPER", "SCISSORS"),
    PAPER("PAPER", "SCISSORS", "ROCK"),
    SCISSORS("SCISSORS", "ROCK", "PAPER");


    private String value, winner, loser;

    RockPaperScissorHandSign(String value, String winner, String loser) {
        this.value = value;
        this.winner = winner;
        this.loser = loser;
    }

    public RockPaperScissorHandSign getWinner() {
        return RockPaperScissorHandSign.valueOf(winner);
    }

    public RockPaperScissorHandSign getLoser() {
        return RockPaperScissorHandSign.valueOf(loser);
    }
}
