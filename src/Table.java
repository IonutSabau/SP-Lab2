public class Table implements Element{
    private String title;

    public Table(String title){
        this.title=title;
    }

    public void print() {
        System.out.println("Table with name: "+this.title);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
