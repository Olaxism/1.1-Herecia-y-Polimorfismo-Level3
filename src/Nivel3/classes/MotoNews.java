package Nivel3.classes;

public class MotoNews extends News {

    private String team;

    public MotoNews (String title, String team) {
        super (title);
        this.team = team;
        this.score = getScore();
        this.price = getPrice();
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
