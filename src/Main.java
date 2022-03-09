public class Main {
    public static void main(String[] args) {
        XMLStorage xml = new XMLStorage();
        MySQLStorage mySQL = new MySQLStorage();
        User user = new User();

        UserController userController1 = new UserController(xml);
        userController1.store(user);

        UserController userController2 = new UserController(mySQL);
        userController2.store(user);
    }
}
