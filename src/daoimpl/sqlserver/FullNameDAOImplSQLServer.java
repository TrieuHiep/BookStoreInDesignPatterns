package daoimpl.sqlserver;

import dao.FullNameDAO;
import model.userpkg.FullName;

import java.sql.SQLException;

public class FullNameDAOImplSQLServer implements FullNameDAO{
    @Override
    public boolean addFullName(FullName fullName) throws SQLException {
        return true;
    }
}
