package SEMethodsSet088103G1CW;

import org.springframework.boot.SpringApplication;

import java.util.ArrayList;

public class MainWin
{

    public static void main(String[] args)
    {
        //working connection and disconnect

       // SQLConnection connection = new SQLConnection();
        /*
        connection.connect("localhost:33060");

        ArrayList<Country> arrC = connection.getCountryReport1();
        connection.displayCountry(arrC);

        connection.disconnect();
        */

        // Connect to database
        if (args.length < 1)
        {
            SQLConnection.connect("localhost:33060");
        }
        else
        {
            SQLConnection.connect(args[0]);
        }

        //ArrayList<Country> arrC = connection.getCountryReport1();
        //connection.displayCountry(arrC);
        SpringApplication.run(MainWin.class, args);


    //test statement to see if print method works
        //Country country = connection.getPopulation(103000);


        //connection.displayCountry(country);



        /*
        //System.out.println("Boo yah!");

        try
        {
            // Load Database driver
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Could not load SQL driver");
            System.exit(-1);
        }

        // Connection to the database
        Connection con = null;
        int retries = 100;
        for (int i = 0; i < retries; ++i)
        {
            System.out.println("Connecting to database...");
            try
            {
                // Wait a bit for db to start
                Thread.sleep(30000);
                // Connect to database
                con = DriverManager.getConnection("jdbc:mysql://db:3306/world?useSSL=false&characterEncoding=latin1", "root", "password");
                System.out.println("Successfully connected");
                // Wait a bit
                Thread.sleep(10000);
                // Exit for loop
                break;
            }
            catch (SQLException sqle)
            {
                System.out.println("Failed to connect to database attempt " + Integer.toString(i));
                System.out.println(sqle.getMessage());
            }
            catch (InterruptedException ie)
            {
                System.out.println("Thread interrupted? Should not happen.");
            }
        }

        if (con != null)
        {
            try
            {
                // Close connection
                con.close();
            }
            catch (Exception e)
            {
                System.out.println("Error closing connection to database");
            }
        }
        */


    }


}
