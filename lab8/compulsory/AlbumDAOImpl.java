package org.example;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class AlbumDAOImpl implements AlbumDAO{
    @Override
    public Album get(int id) throws SQLException {
        Connection con=Database.getConnection();
        Album album = null;
        String sql="SELECT id, releaseYear, title, artist, genre FROM album WHERE id=?";

        PreparedStatement ps=con.prepareStatement(sql);

        ps.setInt(1, id);

        ResultSet rs=ps.executeQuery();

        if(rs.next())
        {
            int oid=rs.getInt("id");
            int releaseYear=rs.getInt("releaseYear");
            String title=rs.getString("title");
            String artist=rs.getString("artist");
            String genre=rs.getString("genre");

            album=new Album(oid, releaseYear, title, artist, genre);
        }
        return album;
    }

    @Override
    public List<Album> getAll() throws SQLException {
        return null;
    }

    @Override
    public int save(Album album) throws SQLException {
        return 0;
    }

    @Override
    public int insert(Album album) throws SQLException {
        Connection con =Database.getConnection();

        String sql = "INSERT INTO album (id, release year, title, artist, genre) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1,album.getId());
        ps.setInt(1, album.getReleaseYear());
        ps.setString(2, album.getTitle());
        ps.setString(3, album.getArtist());
        ps.setString(4, album.getGenre());

        int result=ps.executeUpdate();

        Database.closePreparedStatement(ps);
        Database.closeConnection(con);

        return result;
    }

    @Override
    public int update(Album album) throws SQLException {
        Connection connection = Database.getConnection();

        String sql = "UPDATE album set release_year = ?, title = ?, artist = ?, genre = ? where id = ?";

        PreparedStatement ps = connection.prepareStatement(sql);

        ps.setInt(1, album.getId());
        ps.setInt(2, album.getReleaseYear());
        ps.setString(3, album.getTitle());
        ps.setString(4, album.getArtist());
        ps.setString(5, album.getGenre());

        int result = ps.executeUpdate();

        Database.closePreparedStatement(ps);
        Database.closeConnection(connection);

        return result;
    }

    @Override
    public int delete(Album album) {
        return 0;
    }
}
