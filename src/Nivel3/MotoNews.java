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

    public int getScore() {

        int totalScore = 3;
        if (team.equals("Honda") || team.equals("Yamaha")) {
            totalScore += 3;
        }
        return totalScore;
    }

    public double getPrice() {

        double totalPrice = 100;
        if (team.equals("Honda") || team.equals("Yamaha")) {
            totalPrice += 50;
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "MotoNews{" +
                "team='" + team + '\'' +
                '}';
    }
}
