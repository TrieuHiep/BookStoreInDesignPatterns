package daoimpl.mysql;

import dao.FullNameDAO;
import model.userpkg.FullName;

import java.sql.SQLException;

public class FullNameDAOImplMySQL implements FullNameDAO{
    @Override
    public boolean addFullName(FullName fullName) throws SQLException {
        return true;
    }
}