package lab5.compulsory;

import java.awt.*;
import java.io.*;

public class CatalogUtil {
    public static void save(Catalog catalog, String path) throws IOException {
        try (var oos = new ObjectOutputStream(
                new FileOutputStream(path))) {
            oos.writeObject(catalog);
        }
    }

    public static Catalog load(String path,Catalog catalog) throws IOException {
        try (var oos = new ObjectInputStream(
                new FileInputStream(path))
             Date date = (Date)in.readObject();
             String message = (String) in.readObject();
             int i = in.readInt();)
             fis.close();}

    }
