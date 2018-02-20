package daofactory;

import dao.*;

public abstract class DAOFactory {
    public static final int MYSQL = 1;
    public static final int SQLServer = 2;

    public abstract CustomerDAO getCustomerDAO();

    public abstract FullNameDAO getFullNameDAO();

    public abstract AddressDAO getAddressDAO();

    public abstract AccountDAO getAccountDAO();

    public abstract PersonDAO getPersonDAO();

    public static DAOFactory getDAOFactory(int type) {
        switch (type) {
            case MYSQL:
                return new MySQLDAOFactory();
            case SQLServer:
                return new SQLServerDAOFactory();
            default:
                return null;
        }
    }
}
