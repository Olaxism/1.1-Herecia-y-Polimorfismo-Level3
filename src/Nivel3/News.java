package Nivel3;

public abstract class News {

    private String title;
    private String text;
    private int score;
    private double price;

    public News (String title, String text, int score, double price) {
        this.title = title;
        this.text = "";
        this.score = score;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public int getScore() {
        return score;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Noticias{ " +
                "Titulo = '" + title + '\'' +
                ", Texto ='" + text + '\'' +
                ", Puntuación = " + score +
                ", Precio = " + price +
                '}';
    }
}
