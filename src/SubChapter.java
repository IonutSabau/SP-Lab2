import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

public class SubChapter {
    private String name;
    private ArrayList<Element> listOfElements= new ArrayList<Element>();

    public SubChapter(String name){
        this.name=name;
    }

    public Integer createNewParagraph(String text){
        Paragraph p = new Paragraph(text);
        this.listOfElements.add(p);
        return listOfElements.indexOf(p);
    }
    public  Integer createNewImage(String imageName){
        Image img = new Image(imageName);
        this.listOfElements.add(img);
        return listOfElements.indexOf(img);
    }

    public  Integer createNewTable(String title){
        Table tb = new Table(title);
        this.listOfElements.add(tb);
        return listOfElements.indexOf(tb);
    }

    public void print(){
        System.out.println("Subchapter: "+this.name);
        for(Element e : this.listOfElements){
            System.out.print("                     ");
            e.print();
        }
    }

    public String getName() {
        return name;
    }
    public Element getElement(Integer index){
        return  this.listOfElements.get(index);
    }
    public ArrayList<Element> getListOfElements() {
        return listOfElements;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setListOfElements(ArrayList<Element> listOfElements) {
        this.listOfElements = listOfElements;
    }
}
