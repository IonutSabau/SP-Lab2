import java.util.ArrayList;

public class Chapter {
    private String name;
    private ArrayList<SubChapter> listOfSubChapters = new ArrayList<SubChapter>();

    public Chapter(String name){
        this.name=name;
    }

    public Integer createSubChapter(String name){
        SubChapter subCH = new SubChapter(name);
        this.listOfSubChapters.add(subCH);
        return this.listOfSubChapters.indexOf(subCH);
    }

    public void print(){
        System.out.println("Chapter: "+this.name);
        for (SubChapter subCH : this.listOfSubChapters){
            System.out.print("         ");
            subCH.print();
        }
    }

    public String getName() {
        return name;
    }
    public SubChapter getSubChapter(Integer index){
        return this.listOfSubChapters.get(index);
    }
    public ArrayList<SubChapter> getListOfSubChapters() {
        return listOfSubChapters;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setListOfSubChapters(ArrayList<SubChapter> listOfSubChapters) {
        this.listOfSubChapters = listOfSubChapters;
    }
}
