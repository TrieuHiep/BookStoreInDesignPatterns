package facade;

import dao.*;
import daofactory.DAOFactory;
import model.customerpkg.Customer;
import model.userpkg.Account;
import model.userpkg.Address;
import model.userpkg.FullName;
import model.userpkg.Person;

import java.sql.SQLException;

public class CustomerFacade {
    private FullNameDAO fullNameDAO;
    private AccountDAO accountDAO;
    private AddressDAO addressDAO;
    private PersonDAO personDAO;
    private CustomerDAO customerDAO;

    public CustomerFacade(int typeDB) {
        DAOFactory daoFactory = DAOFactory.getDAOFactory(typeDB);
        this.fullNameDAO = daoFactory.getFullNameDAO();
        this.accountDAO = daoFactory.getAccountDAO();
        this.addressDAO = daoFactory.getAddressDAO();
        this.personDAO = daoFactory.getPersonDAO();
        this.customerDAO = daoFactory.getCustomerDAO();
    }

    public boolean addCustomer(Customer customer, int typeDB) {
        FullName fullName = customer.getFullName();
        Address address = customer.getAddress();
        Account account = customer.getAccount();
        try {
            this.fullNameDAO.addFullName(fullName);
            this.addressDAO.addAddress(address);
            this.accountDAO.addAccount(account);
            this.personDAO.addPerson(customer);
            this.customerDAO.addCustomer(customer);
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
}
