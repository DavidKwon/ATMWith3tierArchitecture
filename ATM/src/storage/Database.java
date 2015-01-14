/*
 * Restaurant Booking System: example code to accompany
 *
 * "Practical Object-oriented Design with UML"
 * Mark Priestley
 * McGraw-Hill (2004)
 */

package storage ;

import java.sql.* ;
import java.util.Date ;
import java.util.Vector ;

public class Database
{
  private static Connection con ;
  
  // Singleton:
  
  private static Database uniqueInstance ;

  public static Database getInstance()
  {
    if (uniqueInstance == null) {
      uniqueInstance = new Database() ;
    }
    return uniqueInstance ;
  }

  private Database()
  {
    // Get a connection
    con = Connectivity.getConnection("ATM.properties") ;
  }

  public static Connection getConnection() {
    return con ;
  }

  // Get a fresh object ID

  public String getname(int id)
  {
	  String name = null;
    try {
      Statement stmt
	= con.createStatement() ;

      ResultSet rset = stmt.executeQuery("SELECT * FROM Atm") ;
      while (rset.next()) {
    	  
    	   name = rset.getString(1);
    	   int i = rset.getInt(2);
    	   if(i==id)
    		   break;
      }
      rset.close() ;
      
      stmt.close() ;
    }
    catch (SQLException e) {
      e.printStackTrace() ;
    }

    return name;
  }
}
