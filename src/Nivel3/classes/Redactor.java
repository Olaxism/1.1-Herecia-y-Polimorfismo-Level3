package Nivel3.classes;

import java.util.ArrayList;
import java.util.List;

public class Redactor {

    private String name;
    private final String dni;
    private double salary;
    private ArrayList<News> myNews;

    private static double baseSalary = 1500;

    public Redactor (String name, String dni) {
        this.name = name;
        this.dni = dni;
        this.salary = baseSalary;
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

    public void removeNews (String title) {
        for (int i = myNews.size() -1; i >= 0; i--) {
            if (myNews.get(i).getTitle().equalsIgnoreCase(title)) {
                myNews.remove(i);
            }
        }
    }

    public static void setBaseSalary(double newSalary) {
        baseSalary = newSalary;
    }

    public static double getBaseSalary() {
        return baseSalary;
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
