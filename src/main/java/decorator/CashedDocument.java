package decorator;

public class CashedDocument implements Document {
    private Document document;

    public CashedDocument(Document document) {
        this.document = document;
    }
    @Override
    public String parse() {
//        long startTime = System.currentTimeMillis();
        String text = document.parse();
//        long endTime = System.currentTimeMillis();
//        System.out.println(endTime-startTime);
        return text;
    }
}
