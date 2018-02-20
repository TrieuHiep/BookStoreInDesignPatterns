package daoimpl.mysql;

import dao.PersonDAO;
import model.userpkg.Person;

import java.sql.SQLException;

public class PersonDAOImplMySQL implements PersonDAO {

    @Override
    public boolean addPerson(Person person) throws SQLException {
        return true;
    }
}
