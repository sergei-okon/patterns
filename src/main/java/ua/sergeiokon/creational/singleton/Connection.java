package ua.sergeiokon.creational.singleton;

public class Connection {

    private static volatile Connection connection;

    private String value;

    private Connection(String value) {
        this.value = value;
    }

    public static synchronized Connection getConnection(String param) {
        if (connection == null) {
            connection = new Connection(param);
        }
        return connection;
    }

    public static Connection getConnection() {
        return connection;
    }

    public String getValue() {
        return value;
    }
}
