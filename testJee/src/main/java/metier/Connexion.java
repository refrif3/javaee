package metier;

import java.sql.*;

public class Connexion {
        private String DBPath = "Chemin vers SQLite";
        private Connection connection = null;
        private Statement statement = null;

        public Connexion(String dBPath) {
            DBPath = dBPath;
        }

        public void connect() {
            try {
                Class.forName("base.base.sqlite");
                connection = DriverManager.getConnection("jdbc:sqlite:" + DBPath);
                statement = connection.createStatement();
                System.out.println("Connexion a " + DBPath + " avec succès");
            } catch (ClassNotFoundException notFoundException) {
                notFoundException.printStackTrace();
                System.out.println("Erreur de connexion1");
            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
                System.out.println("Erreur de connexion2");
            }
        }
}

