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

        public int getScore() {

            int totalScore = 5;
            if (competition.equals("Liga de Champions")) {
                totalScore += 3;
            }
            if (competition.equals("Liga")) {
                totalScore += 1;
            }
            if (club.equals("Madrid") || club.equals("Barça")) {
                totalScore += 1;
            }
            if (player.equals("Ferran Torres") || player.equals("Benzema")) {
                totalScore += 1;
            }
            return totalScore;
        }

        public double getPrice() {

            double totalPrice = 300;
            if (competition.equals("Liga de Champions")) {
                totalPrice += 100;
            }
            if (club.equals("Madrid") || club.equals("Barça")) {
                totalPrice += 100;
            }
            if (player.equals("Ferran Torres") || player.equals("Benzema")) {
                totalPrice += 50;
            }
            return totalPrice;
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

