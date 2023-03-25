package lab5.compulsory;

import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException, InvalidCatalogException {
        Main app = new Main();
        app.testCreateSave();
//        app.testLoad();
    }


    private void testCreateSave() throws IOException {
        Catalog catalog = new Catalog("MyDocuments");
        var book1 = new Document("Carte1", "Capra cu trei iezi", "https://www.elefant.ro/capra-cu-trei-iezi-poveste-ilustrata");
        var book2 = new Document("Carte1", "Moara cu noroc", "https://ro.wikipedia.org/wiki/Moara_cu_noroc ");
        var article1 = new Document("Articol1", "Bacalaureat 2023", "https://www.edupedu.ro/oficial-bacalaureat-2023- ");
        book1.addTag("Numar volume", "1");
        book2.addTag("Autor", "Ioan Slavici");
        article1.addTag("Data publicarii", "6 sept 2022");
        catalog.add(book1);
        catalog.add(book2);
        catalog.add(article1);
        System.out.println(catalog.toString());


        CatalogUtil.save(catalog, "d:/saver/catalog.json");
    }

//    private void testLoad() throws InvalidCatalogException {
//        Catalog catalog = CatalogUtil.load("d:/research/catalog.json");
//    }
}