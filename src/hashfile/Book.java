package hashfile;

import java.util.ArrayList;

public class Book {
    private String name;
    private int published;
    private String content;

    public Book(String name, int published, String content) {
        this.name = name;
        this.content = content;
        this.published = published;
    }

    public String setName(String nameToSet) {
        this.name = nameToSet;
        return this.name;
    }

    public String getName() {
        return this.name;
    }

    public String setContent(String contentToSet) {
        this.content = contentToSet;
        return this.content;
    }

    public String getContent() {
        return this.content;
    }

    public int setPublished(int published) {
        this.published = published;
        return this.published;
    }

    public int getPublished() {
        return this.published;
    }
    public String toString(){
        return this.name + " " + this.content + " " + this.published;
    }

    public Book searchBook(String bookName) {
        ArrayList<Book> books = new ArrayList<>();
        Book senseAndSensibility = new Book("sense-and-sensibility", 1891, "otherInformation");
        Book prideAndPrejudice = new Book("pride and prejudice", 1981, "otherInformation");
        books.add(senseAndSensibility);
        books.add(prideAndPrejudice);

        //how to search for books
        Book match = null;
        for (Book book : books){
            if (book == null){
                return null;
            }
            if (book.getName().equals("sense-and-sensibility")){
                match = book;
                break;
            }
        }

        return senseAndSensibility;
    }


}
