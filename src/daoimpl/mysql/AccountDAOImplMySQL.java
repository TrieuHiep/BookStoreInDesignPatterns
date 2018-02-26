package daoimpl.mysql;

import dao.AccountDAO;
import daoimpl.singleton.MySQLConnector;
import model.userpkg.Account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AccountDAOImplMySQL implements AccountDAO {
    private Connection connection;

    public AccountDAOImplMySQL() {
        try {
            MySQLConnector mySQLConnector = MySQLConnector.getInstance();
            this.connection = mySQLConnector.getMySQLConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean addAccount(Account account) throws SQLException {
        String sqlCommand = "INSERT INTO account VALUES(?,?)";
        PreparedStatement statement = this.connection.prepareStatement(sqlCommand);
        statement.setString(1, account.getUsername());
        statement.setString(2, account.getPassword());
        this.connection.setAutoCommit(false);
        try {
            int aff = statement.executeUpdate();
            this.connection.commit();
            if (aff > 0) return true;
        } catch (SQLException ex) {
            this.connection.rollback();
        }
        return false;
    }
}
