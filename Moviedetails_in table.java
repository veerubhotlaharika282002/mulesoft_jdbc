package mulesoft;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class demonew3 {
public static void main(String args[])    {
      try
{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","system","harika");
	Statement stmt=con.createStatement();
  String sql1 = "select * from movieshortdetails";
  ResultSet rs = stmt.executeQuery(sql1);
    while(rs.next()){
        System.out.print("Name: " + rs.getString("movie_name"));
        System.out.print(", Actor: " + rs.getString("Main_actor"));
        System.out.print(", Actress: " + rs.getString("Main_actress"));
        System.out.println(", Director: " + rs.getString("Movie_Director"));
        System.out.println(", Year of Release : " + rs.getInt("movie_release_date"));
     }

  con.close();





}
catch(Exception e)
{
System.out.println(e);
}
}
}
