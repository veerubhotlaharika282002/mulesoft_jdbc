package mulesoft;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class demonew1 {
public static void main(String args[])    {
       try
        {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","system","harika");
	Statement stmt=con.createStatement();
  String sql = "CREATE TABLE movieshortdetails " +
            "(movie_name VARCHAR(255), " + "Main_actor VARCHAR(255), " + "Main_actress VARCHAR(255), " + "Movie_Director VARCHAR(255), "+ " movie_release_date INTEGER, " + " PRIMARY KEY (movie_name ))"; 
    stmt.executeUpdate(sql);
    System.out.println("Table created successfully...");
  con.close();
}
catch(Exception e){
System.out.println(e);
          }
     }
}
