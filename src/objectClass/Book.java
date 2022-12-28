package objectClass;

import java.util.Objects;

public class Book {
    private String title;
    private final Author author;
    private int published;

    public Book(String title, Author author, int published) {
        this.title = title;
        this.author = author;
        this.published = published;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublished() {
        return published;
    }

    public void setPublished(int published) {
        this.published = published;
    }


}
