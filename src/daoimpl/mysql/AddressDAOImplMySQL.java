package daoimpl.mysql;

import dao.AddressDAO;
import daoimpl.singleton.MySQLConnector;
import model.userpkg.Address;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddressDAOImplMySQL implements AddressDAO {
    private Connection connection;

    public AddressDAOImplMySQL() {
        try {
            MySQLConnector mySQLConnector = MySQLConnector.getInstance();
            this.connection = mySQLConnector.getMySQLConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean addAddress(Address address) throws SQLException {
        String sqlCommand = "INSERT INTO address VALUES(?,?,?)";
        PreparedStatement statement = this.connection.prepareStatement(sqlCommand);
        statement.setString(1, address.getRoad());
        statement.setString(2, address.getDistrict());
        statement.setString(3, address.getCity());

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
