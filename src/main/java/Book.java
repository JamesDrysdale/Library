public class Book {
    private String title;
    private String author;
    private String genre;

    //constructor function
    public Book(String title, String author, String genre){
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    //methods

    //Get a book's title
    public String getTitle(){
        return this.title;
    }

    //Get a book's author
    public String getAuthor(){
        return this.author;
    }

    //Get a book's genre
    public String getGenre(){
        return this.genre;
    }
}
