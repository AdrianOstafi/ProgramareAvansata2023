# lab8
#1. Compulsory (1p)
1. [x] Create a relational database using any RDBMS (Oracle, Postgres, MySql, Java DB, etc.).
2. [x] Write an SQL script that will create the following tables:
   albums: id, release year, title, artist, genre(s)
   artists: id, name (for example: Beatles)
   genres: id, name (for example: Rock)
   an associative (junction) table in order to store each album genres.
4. [x] Update pom.xml, in order to add the database driver to the project libraries.
4. [x] Create a singleton class in order to manage a connection to the database.
5. [x] Create DAO classes that offer methods for managing artists, genres and albums (at least one).
6. [x] Implement a simple test using your classes.