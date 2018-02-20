package daofactory;

import dao.*;
import daoimpl.sqlserver.*;

public class SQLServerDAOFactory extends DAOFactory {

    @Override
    public CustomerDAO getCustomerDAO() {
        return new CustomerDAOImplSQLServer();
    }

    @Override
    public FullNameDAO getFullNameDAO() {
        return new FullNameDAOImplSQLServer();
    }

    @Override
    public AddressDAO getAddressDAO() {
        return new AddressDAOImplSQLServer();
    }

    @Override
    public AccountDAO getAccountDAO() {
        return new AccountDAOImplSQLServer();
    }

    @Override
    public PersonDAO getPersonDAO() {
        return new PersonDAOImplSQLServer();
    }
}
