package LibraryManagementSystem;

public class Book {
    private String id;
    private String title;
    private String author;
    private boolean isIssued=false; 
    
    public Book(String id, String title, String author, boolean isIssued){
        this.id=id;
        this.title=title;
        this.author=author;
        this.isIssued=isIssued;
    }
    
    public String getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public boolean getIsIssued(){
        return isIssued;
    }

    public void setID(String id){
        this.id=id;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public void setIsIssued(boolean isIssued){
        this.isIssued=isIssued;
    }

}
