package Nivel3.classes;

public class F1News extends News {

    private String squad;

    public F1News (String title, String squad) {
        super (title);
        this.squad = squad;
        this.score = getScore();
        this.price = getPrice();
    }

    public String getSquad() {
        return squad;
    }

    public int getScore() {

        int totalScore = 4;
        if (squad.equals("Ferrari") || squad.equals("Mercedes")) {
            totalScore += 2;
        }
        return totalScore;
    }

    public double getPrice() {

        double totalPrice = 100;
        if (squad.equals("Ferrari") || squad.equals("Mercedes")) {
            totalPrice += 50;
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "F1News{" +
                "squad='" + squad + '\'' +
                '}';
    }
}
