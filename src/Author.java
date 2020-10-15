public class Author {
    private String name;

    public Author(String name){
        this.name=name;
    }

    public void print(){
        System.out.println("The author is: "+this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
