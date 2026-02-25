package Nivel3;

public class F1News extends News{

    private String squad;

    public F1News (String title, String text, int score, double price, String squad) {
        super (title, text, score, price);
        this.squad = squad;
    }

    public String getSquad() {
        return squad;
    }

    @Override
    public String toString() {
        return "F1News{" +
                "squad='" + squad + '\'' +
                '}';
    }
}
