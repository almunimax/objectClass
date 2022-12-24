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

    public void setTitle(String title) {
        this.title = title;
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

    @Override
    public String toString() {
        return "Название книги: " + title + ", автор " + author + ", год издания " + published;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}
