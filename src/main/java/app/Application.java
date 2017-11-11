package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String JDBC_URL = "jdbc:mysql://andrewtestdbinstance.ck0o9xqggby0.us-east-1.rds.amazonaws.com:3306/StatTracker";
    public static final String JDBC_USER = "spccmaster";
    public static final String JDBC_PASSWORD = "spccpassword";


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
