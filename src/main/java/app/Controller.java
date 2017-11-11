package app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;

import static app.Application.*;

@RestController
public class Controller {

    private Statement statement;

    @RequestMapping("/getRow0")
    public Transaction getRow0(){

        try {
            Class.forName(JDBC_DRIVER);
            Connection connection;
            connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
            statement = connection.createStatement();
            ResultSet row = statement.executeQuery("SELECT * FROM trax_tbl WHERE trax_num='0'");
            row.next();
            return new Transaction(row.getInt("trax_num"), row.getDate("date"), row.getFloat("trax_amt"),
                    row.getString("cat"), row.getString("msg"), row.getInt("user_num"), row.getString("trax_type"));
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return new Transaction();
    }

}
