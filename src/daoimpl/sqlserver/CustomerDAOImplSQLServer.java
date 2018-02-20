package daoimpl.sqlserver;

import dao.CustomerDAO;
import model.customerpkg.Customer;

import java.sql.SQLException;

public class CustomerDAOImplSQLServer implements CustomerDAO{
    @Override
    public boolean addCustomer(Customer customer) throws SQLException {
        return true;
    }
}
