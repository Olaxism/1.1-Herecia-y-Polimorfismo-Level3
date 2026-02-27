package Nivel3;

public class BasketballNews extends News {

    private String competition;
    private String club;


    public BasketballNews (String title, String text, int score, double price, String competition, String club) {
            super (title, text, score, price);
            this.competition = competition;
            this.club = club;
    }

    public String getCompetition() {
        return competition;
    }

    public String getClub() {
        return club;
    }

    public int getScore() {

        int totalScore = 4;
        if (competition.equals("Euroliga")) {
            totalScore += 3;
        }
        if (competition.equals("ACB")) {
            totalScore += 2;
        }
        if (club.equals("Madrid") || club.equals("Barça")) {
            totalScore += 1;
        }

        return totalScore;
    }

    public double getPrice() {

        double totalPrice = 250;
        if (competition.equals("Euroliga")) {
            totalPrice += 75;
        }
        if (club.equals("Madrid") || club.equals("Barça")) {
            totalPrice += 75;
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "BasketballNews{" +
                "competition='" + competition + '\'' +
                ", club='" + club + '\'' +
                '}';
    }
}
