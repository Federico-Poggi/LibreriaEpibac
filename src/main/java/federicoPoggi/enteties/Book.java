package federicoPoggi.enteties;

public class Book extends Articolo{
    private String authors;
    private String genres;
    public Book(String title, int yearPublication, int pageNumber, String authors, String genres){
        super(title,yearPublication,pageNumber);
        this.authors=authors;
        this.genres=genres;
    }

/*GETTERS AND SETTERS*/
    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }
}
