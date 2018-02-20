package daoimpl.mysql;

import dao.AccountDAO;
import model.userpkg.Account;

import java.sql.SQLException;

public class AccountDAOImplMySQL implements AccountDAO{

    @Override
    public boolean addAccount(Account account) throws SQLException {
        return true;
    }
}
