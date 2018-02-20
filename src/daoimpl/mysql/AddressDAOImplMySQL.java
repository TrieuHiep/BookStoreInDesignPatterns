package daoimpl.mysql;

import dao.AddressDAO;
import model.userpkg.Address;

import java.sql.SQLException;

public class AddressDAOImplMySQL implements AddressDAO{
    @Override
    public boolean addAddress(Address address) throws SQLException {
        return true;
    }
}
