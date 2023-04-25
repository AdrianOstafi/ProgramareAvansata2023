package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {
    /*static Scanner scan = new Scanner(System.in);
    public static void main(String[] args)  {
       Database database = new Database();
       database.connection("postgres","postgres","9111215gabi");*/
    public static void main(String[] args) throws SQLException
    {
//        Album album = new Album(1, 2002, "Andrada", "Andra", "Drama");
//        AlbumDAO albumDAO = new AlbumDAOImpl();
//
//        Album album = albumDAO.get(10);

//        System.out.println(album);

        /*Connection con = Database.getConnection();

        if(con!=null)
            System.out.println("Database succ");*/
        Album album = new Album(1, 2002, "Andrada", "Andra", "Drama");
        System.out.println(album);
        Connection conn = Database.getConnection();
        if(conn!=null)
            System.out.println("Database succ");
        List<Album> albumList ;
        AlbumDAO albumDAO = new AlbumDAOImpl();
        int result = albumDAO.insert(album);

        /*AlbumDAO albumDAO = new AlbumDAOImpl();
        //Album album = new Album(1, 2002, "Andrada", "Andra", "Drama");
        int result = albumDAO.insert(album);*/
        System.out.println(result);
    }
}