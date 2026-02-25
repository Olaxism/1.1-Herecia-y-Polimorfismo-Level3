package Nivel3;

public class FootballNews extends News {

    private String competition;
    private String club;
    private String player;

    public FootballNews (String title, String text, int score, double price, String competition, String club, String player) {
        super (title, text, score, price);
        this.competition = competition;
        this.club = club;
        this.player = player;
    }

        public String getCompetition() {
            return competition;
        }

        public String getClub() {
            return club;
        }

        public String getPlayer() {
            return player;
        }

    @Override
    public String toString() {
        return "FootballNews{" +
                "competition='" + competition + '\'' +
                ", club='" + club + '\'' +
                ", player='" + player + '\'' +
                '}';
    }
}

