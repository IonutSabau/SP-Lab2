import java.util.ArrayList;

public class Book {
    private String name;
    private Author author;
    private ArrayList<Chapter> listOfChapters = new ArrayList<Chapter>();

    public Book(String name){
        this.name=name;
    }

    public void addAuthor(Author author){
        this.author=author;
    }

    public Integer createChapter(String name){
        Chapter ch = new Chapter(name);
        this.listOfChapters.add(ch);
        return this.listOfChapters.indexOf(ch);
    }

    public void print(){
        System.out.println("Book title: "+this.author.getName());
        for (Chapter ch : this.listOfChapters){
            ch.print();
        }
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }
    public Chapter getChapter(Integer index){
        return  this.listOfChapters.get(index);
    }
    public ArrayList<Chapter> getListOfChapters() {
        return listOfChapters;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setListOfChapters(ArrayList<Chapter> listOfChapters) {
        this.listOfChapters = listOfChapters;
    }
}
