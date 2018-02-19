package daoimpl;

import dao.PersonDAO;
import model.userpkg.Person;

import java.sql.SQLException;

public class PersonDAOImpl implements PersonDAO {

    @Override
    public boolean addPerson(Person person) throws SQLException {
        return true;
    }
}
