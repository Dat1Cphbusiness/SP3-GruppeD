import jdk.jfr.Category;

import java.util.ArrayList;

public abstract class Media {
    private String title;
    private int year;
    private ArrayList<Category> categories;

    public Media(String title, int year, ArrayList<Category> categories) {
        this.title=title;
        this.year=year;
        this.categories=categories;
    }
}
