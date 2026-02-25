package Nivel3;

public class TenisNews extends News{

    private String competition;
    private String players;

    public TenisNews (String title, String text, int score, double price, String competition, String players) {
        super ( title, text, score, price);
        this.competition = competition;
        this.players = players;
    }

    public String getCompetition() {
        return competition;
    }

    public String getPlayers() {
        return players;
    }

    @Override
    public String toString() {
        return "TenisNews{" +
                "competition='" + competition + '\'' +
                ", players='" + players + '\'' +
                '}';
    }
}
