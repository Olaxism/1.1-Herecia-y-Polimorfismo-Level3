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

    public int getScore() {

        int totalScore = 4;
        if (players.equals("Federer") || players.equals("Nadal") || players.equals("Djokovic")) {
            totalScore += 3;
        }
        return totalScore;
    }

    public double getPrice() {

        double totalPrice = 150;
        if (players.equals("Federer") || players.equals("Nadal") || players.equals("Djokovic")) {
            totalPrice += 100;
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "TenisNews{" +
                "competition='" + competition + '\'' +
                ", players='" + players + '\'' +
                '}';
    }
}
