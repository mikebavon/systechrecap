package systech.academy.dbfactory;

public class DbManagerFactory {

    public DbManager getConnection(String dbDriver){

        if (dbDriver.equalsIgnoreCase("com.mysql"))
            return new MysqlDbManager();
        else if (dbDriver.equalsIgnoreCase("com.oracle"))
            return new OracleDbManager();
        else if (dbDriver.equalsIgnoreCase("com.postgres"))
            return new PostgresDbManager();
        else if (dbDriver.equalsIgnoreCase("com.sql"))
            return new SqlDbManager();
        else
            return null;
    }
}
