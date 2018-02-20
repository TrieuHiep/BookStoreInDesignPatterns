package daoimpl.sqlserver;

import dao.AddressDAO;
import model.userpkg.Address;

import java.sql.SQLException;

public class AddressDAOImplSQLServer implements AddressDAO{
    @Override
    public boolean addAddress(Address address) throws SQLException {
        return true;
    }
}
