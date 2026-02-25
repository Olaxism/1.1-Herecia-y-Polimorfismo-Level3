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

    @Override
    public String toString() {
        return "BasketballNews{" +
                "competition='" + competition + '\'' +
                ", club='" + club + '\'' +
                '}';
    }
}
