public class Book {
    String BookID;
    String title;
    String author;
    int availableCopies;

    Book(String BookID,String title, String author, int availableCopies){
        this.BookID= BookID;
        this.title=title;
        this.author=author;
        this.availableCopies=availableCopies;
    }

    @Override
    public String toString(){
        return "Book ID: "+BookID",Title:"+title", Author"+author", Availability"+availableCopies;
    }


    

}
