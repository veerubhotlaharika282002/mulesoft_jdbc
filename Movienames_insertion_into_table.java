package mulesoft;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class demonew2 {
public static void main(String args[]){
	try    {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","system","harika");
  Statement stmt1 = conn.createStatement();
  Statement stmt2 = conn.createStatement();
  Statement stmt3 = conn.createStatement();
  Statement stmt4 = conn.createStatement();
  String sql1 = "insert into movieshortdetails values('Bommarillu','Siddharth','Genelia','Bhaskar',2006)";
  String sql2 = "insert into movieshortdetails values('Manam','Nageswararao','Samantha','Vikram Kumar',2014)";
  String sql3 = "insert into movieshortdetails values('Arya','AlluArjun','Anu Mehtha','Sukumar',2004)";
  String sql4 = "insert into movieshortdetails values('Avengers','robinhook','harika','sukumar',2018)";
    stmt1.executeUpdate(sql1);
    stmt2.executeUpdate(sql2);
    stmt3.executeUpdate(sql3);
    stmt4.executeUpdate(sql4);
    System.out.println("Records inserted successfully!");
  conn.close();
  }
catch(Exception e)  {
System.out.println(e);
         }
    }
}
