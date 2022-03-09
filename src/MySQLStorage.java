import java.util.List;

public class MySQLStorage implements UserStorage {
    @Override
    public void store(User user) {
        System.out.println("Store user to MySQL database");
    }
}
