package src.singleton;

public class Database {

    private static volatile Database instance;
    private String connection;

    private Database(String connection) {
        this.connection = connection;
    }

    public static Database getInstance(String connection) {
        Database result = instance;
        if (result == null) {
            synchronized (Database.class) {
                result = instance;
                if (result == null) {
                    instance = new Database(connection);
                }
            }
        }
        return result;
    }
}
