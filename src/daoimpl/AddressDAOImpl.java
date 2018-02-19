package daoimpl;

import dao.AddressDAO;
import model.userpkg.Address;

import java.sql.SQLException;

public class AddressDAOImpl implements AddressDAO{
    @Override
    public boolean addAddress(Address address) throws SQLException {
        return true;
    }
}
