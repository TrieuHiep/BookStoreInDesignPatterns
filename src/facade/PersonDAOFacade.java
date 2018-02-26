package facade;

import dao.AccountDAO;
import dao.AddressDAO;
import dao.FullNameDAO;
import dao.PersonDAO;
import daofactory.DAOFactory;
import daoimpl.sqlserver.AccountDAOImplSQLServer;
import daoimpl.sqlserver.AddressDAOImplSQLServer;
import daoimpl.sqlserver.FullNameDAOImplSQLServer;
import daoimpl.sqlserver.PersonDAOImplSQLServer;
import model.userpkg.Account;
import model.userpkg.Address;
import model.userpkg.FullName;
import model.userpkg.Person;

import java.sql.SQLException;

public class PersonDAOFacade {

    private FullNameDAO fullNameDAO;
    private AccountDAO accountDAO;
    private AddressDAO addressDAO;
    private PersonDAO personDAO;

    public PersonDAOFacade(int typeDB) {
        DAOFactory daoFactory = DAOFactory.getDAOFactory(typeDB);
        this.fullNameDAO = daoFactory.getFullNameDAO();
        this.accountDAO = daoFactory.getAccountDAO();
        this.addressDAO = daoFactory.getAddressDAO();
        this.personDAO = daoFactory.getPersonDAO();
    }

    public boolean addPerson(Person person, int typeDB) {
        FullName fullName = person.getFullName();
        Address address = person.getAddress();
        Account account = person.getAccount();
        try {
            this.fullNameDAO.addFullName(fullName);
            this.addressDAO.addAddress(address);
            this.accountDAO.addAccount(account);
            this.personDAO.addPerson(person);
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
}
