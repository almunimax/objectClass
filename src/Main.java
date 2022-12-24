import objectClass.Author;
import objectClass.Book;

public class Main {
    public static void main(String[] args) {

        Author gogol = new Author("Николай","Гоголь");
        Author tolstoy = new Author("Лев","Толстой");
        Book nos = new Book("Нос", gogol,1989);
        Book voina = new Book("Война и мир", tolstoy,2022);
        System.out.println(nos);
        nos.setPublished(1900);
        System.out.println(nos);


    }

}