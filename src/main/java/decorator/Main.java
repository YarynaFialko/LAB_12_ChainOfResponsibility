package decorator;

public class Main {
    public static void main(String[] args) {
        //"gs://oop-course/Geico-2021.png"
        Document document = new SmartDocument("gs://mybuckeystorage/mizhnar_2022.png");
        document = new TimedDocument(document);
//        document = CashedDocument(document);
        System.out.println(document.parse());


    }
}
