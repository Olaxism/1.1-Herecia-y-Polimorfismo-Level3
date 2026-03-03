package Nivel3.classes;

public abstract class News {

    protected String title;
    protected String text;
    protected int score;
    protected double price;

    public News (String title) {
        this.title = title;
        this.text = "";
        this.score = 0;
        this.price = 0;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public abstract int getScore();

    public abstract double getPrice();


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
