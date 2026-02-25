package Nivel3;

public class MotoNews extends News{

    private String team;

    public MotoNews (String title, String text, int score, double price, String team) {
        super (title, text, score, price);
        this.team = team;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String toString() {
        return "MotoNews{" +
                "team='" + team + '\'' +
                '}';
    }
}
