package Nivel3;

import java.util.ArrayList;
import java.util.List;

public class Redactor {

    private String name;
    private final String dni;
    private double salary;
    private ArrayList<News> myNews;

    public Redactor (String name, String dni, String salary) {
        this.name = name;
        this.dni = dni;
        this.salary = 1500;
        this.myNews = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getDni() {
        return dni;
    }

    public double getSalary() {
        return salary;
    }

    public List<News> getMyNews() {
        return List.copyOf(myNews);
    }

    public void addToMyNews (News news) {
        myNews.add(news);
    }

    @Override
    public String toString() {
        return "Redactor{" +
                "name='" + name + '\'' +
                ", dni='" + dni + '\'' +
                ", salary=" + salary +
                ", myNews=" + myNews +
                '}';
    }
}
