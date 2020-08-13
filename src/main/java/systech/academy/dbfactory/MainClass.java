package systech.academy.dbfactory;

import java.util.Scanner;

public class MainClass {

    public static void main(String args []){

        Scanner input = new Scanner(System.in);
        System.out.println("Please specify the driver of database: ");

        String dbDriver = input.nextLine();

        DbManager dbManager = new DbManagerFactory().getConnection(dbDriver);

        if (dbManager != null)
            dbManager.gotConnection();


    }
}
