package javafx.database;

import java.sql.Connection ;
import java.sql.DriverManager ;
import java.sql.SQLException ;
import java.sql.Statement ;
import java.sql.ResultSet ;

import java.util.List ;

import javafx.model.Person;
import javafx.scene.layout.HBox;

import java.util.ArrayList ;

public class PersonDataAccessor {

    // in real life, use a connection pool....
    private Connection connection ;

    public PersonDataAccessor(String driverClassName, String dbURL, String user, String password) throws SQLException, ClassNotFoundException {
        Class.forName(driverClassName);
        connection = DriverManager.getConnection(dbURL, user, password);
    }

    public void shutdown() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }

    public List<Person> getPersonList() throws SQLException {
        try (
            Statement stmnt = connection.createStatement();
            ResultSet rs = stmnt.executeQuery("select * from person");
        ){
            List<Person> personList = new ArrayList<>();
            while (rs.next()) {
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String email = rs.getString("email_address");
                Person person = new Person(firstName, lastName, email);
                personList.add(person);
            }
            return personList ;
        } 
    }
    
    // other methods, eg. addPerson(...) etc
}
