package daoimpl.sqlserver;

import dao.AccountDAO;
import model.userpkg.Account;

import java.sql.SQLException;

public class AccountDAOImplSQLServer implements AccountDAO{

    @Override
    public boolean addAccount(Account account) throws SQLException {
        return true;
    }
}
