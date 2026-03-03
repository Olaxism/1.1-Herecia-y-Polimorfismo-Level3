package Nivel3.classes;

public class TenisNews extends News {

    private String competition;
    private String players;

    public TenisNews (String title, String competition, String players) {
        super ( title);
        this.competition = competition;
        this.players = players;
        this.score = getScore();
        this.price = getPrice();
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
