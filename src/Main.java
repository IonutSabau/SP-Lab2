public class Main {

    public static void main(String[] args) {
        Book discoTitanic = new Book("Disco Titanic");
        Author rpGheo = new Author("Radu Pavel Gheo");
        discoTitanic.addAuthor(rpGheo);
        int indexChapterOne = discoTitanic.createChapter("Capitolul 1");
        Chapter chp1 = discoTitanic.getChapter(indexChapterOne);
        int indexSubChapterOneOne = chp1.createSubChapter("Subcapitolul 1.1");

        SubChapter scOneOne = chp1.getSubChapter(indexSubChapterOneOne);
        scOneOne.createNewParagraph("Paragraph 1");
        scOneOne.createNewParagraph("Paragraph 2");
        scOneOne.createNewParagraph("Paragraph 3");
        scOneOne.createNewImage("Image 1");
        scOneOne.createNewParagraph("Paragraph 4");
        scOneOne.createNewTable("Table 1");
        scOneOne.createNewParagraph("Paragraph 5");


        scOneOne.print();

        int c2 = discoTitanic.createChapter("Capitolul 2");
        Chapter ch2 = discoTitanic.getChapter(c2);
        int sc2 = ch2.createSubChapter("Subcapitolul 2.1");
        SubChapter sch2 = ch2.getSubChapter(sc2);
        sch2.createNewParagraph("Paragraph 1");
        sch2.createNewParagraph("Paragraph 2");
        sch2.createNewParagraph("Paragraph 3");
        sch2.createNewImage("Image 1");
        sch2.createNewParagraph("Paragraph 4");
        sch2.createNewTable("Table 1");
        sch2.createNewParagraph("Paragraph 5");


        discoTitanic.print();
    }
}