package Nivel3;

import java.util.ArrayList;
import java.util.List;

public class SportsPublisher {

    private ArrayList<Redactor> redactors;
    private ArrayList<News> allNews;
    private ArrayList<News> allFootballNews;
    private ArrayList<News> allBasketballNews;
    private ArrayList<News> allTenisNews;
    private ArrayList<News> allF1News;
    private ArrayList<News> allMotoNews;

    public SportsPublisher (){
        this.redactors = new ArrayList<>();
        this.allNews = new ArrayList<>();
        this.allFootballNews = new ArrayList<>();
        this.allBasketballNews = new ArrayList<>();
        this.allTenisNews = new ArrayList<>();
        this.allF1News = new ArrayList<>();
        this.allMotoNews = new ArrayList<>();
    }

    public List<Redactor> getRedactors() {
        return List.copyOf(redactors);
    }

    public List<News> getAllNews() {
        return List.copyOf(allNews);
    }

    public List<News> getAllFootballNews() {
        return List.copyOf(allFootballNews);
    }

    public List<News> getAllBasketballNews() {
        return List.copyOf(allBasketballNews);
    }

    public List<News> getAllTenisNews() {
        return List.copyOf(allTenisNews);
    }

    public List<News> getAllF1News() {
        return List.copyOf(allF1News);
    }

    public List<News> getAllMotoNews() {
        return List.copyOf(allMotoNews);
    }

    @Override
    public String toString() {
        return "SportsPublisher{" +
                "redactors=" + redactors +
                ", allNews=" + allNews +
                '}';
    }
}
