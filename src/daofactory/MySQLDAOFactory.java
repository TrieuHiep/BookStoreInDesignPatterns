package daofactory;

import dao.*;
import daoimpl.mysql.*;

public class MySQLDAOFactory extends DAOFactory {
    @Override
    public CustomerDAO getCustomerDAO() {
        return new CustomerDAOImplMySQL();
    }

    @Override
    public FullNameDAO getFullNameDAO() {
        return new FullNameDAOImplMySQL();
    }

    @Override
    public AddressDAO getAddressDAO() {
        return new AddressDAOImplMySQL();
    }

    @Override
    public AccountDAO getAccountDAO() {
        return new AccountDAOImplMySQL();
    }

    @Override
    public PersonDAO getPersonDAO() {
        return new PersonDAOImplMySQL();
    }
}
