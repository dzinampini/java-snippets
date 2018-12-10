import java.sql.asterik;  
class MysqlCon{  


## create connection 
public void open(){
    try{
       Class.forName("com.mysql.jdbc.Driver");
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/system_java","root","");
        stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY); 
    }
    catch(Exception e) {
        System.out.println(e);   
    }
}

## close connection 
public void close(){
    try{
        stmt.close();
        con.close();
    }
    catch(Exception e){
        System.out.println(e);
    }
}


## insert 
private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {                                       
    open();   

    String name = txtname.getText();
    String email = txtemail.getText();
    String major = txtaddress.getText();
    String sql = "INSERT INTO users (id, user, pwd) VALUES (?, ?, ?)";
    PreparedStatement statement = con.prepareStatement(sql);
    statement.setString(1, name);
    statement.setString(2, email);
    statement.setString(3, major);
    int row = statement.executeUpdate();
    if (row > 0) {
        JOptionPane.showMessageDialog(null,"A new user has been created");
    }
close(); 
}


## delete
private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {                                       
    open();   

    //String name = txtname.getText(); 
    String name = txtname.getText();
    String email = txtemail.getText();
    String major = txtaddress.getText();
          
    String sql = "DELETE FROM users WHERE user = ? OR id = ? OR pwd = ?";
    PreparedStatement statement = con.prepareStatement(sql);
    //statement.setString(1, name);
    statement.setString(3, name);
    statement.setString(1, email);
    statement.setString(2, major);



    int row = statement.executeUpdate();
    if (row > 0) {
        JOptionPane.showMessageDialog(null,"User Deleted");
    }
close(); 
}

## update
private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {                                       
    open();   

    //String name = txtname.getText(); 
    String name = txtname.getText();
    String email = txtemail.getText();
    String major = txtaddress.getText();
          
    String sql = "UPDATE users SET user = ? WHERE id = ?";
    PreparedStatement statement = con.prepareStatement(sql);
    //statement.setString(1, name);
    statement.setString(3, name);
    statement.setString(1, email);
    statement.setString(2, major);



    int row = statement.executeUpdate();
    if (row > 0) {
        JOptionPane.showMessageDialog(null,"User Updated");
    }
close(); 
}

## search or retrieve all  
private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {                                       
    open();   

    String sql = "SELECT * FROM users";
    rs = stmt.executeQuery(sql);
    rs.next();

    String names = rs.getString("id");
    String emails = rs.getString("user");
    String majors = rs.getString("pwd");
    
    close(); 
}


}  


jDBC
standard JAVA api for database independent connectivity 
The JDBC library does the folowimg 
1. make connection
2. create sql statements 
3. execute sql queries 
4. view/modify results 

JDBC Architecture 
--seee disk
JDBC driver Manager - ensures the correct driver is used 
api - provides apkn - jdbc communication 
driver api - - supports jdbc maager to driver communication 


### 5 steps to connect and do the thing
1. register the driver class 
done by the forName() method 

2. create connection
done by the getConnection() method 

3. create statement 
done by statement, prepared statement or callablestatement 

4. execute query 
done by ResultSet 

5. close connection 
con.close() does this 


### how to connect to mysql 
1. right click on the project 
2. select properties 
3. select libraries
4. select add library / or is it jar file 
5. select the downloaded jar file

## JDBC drivers 
JDBC Driver is a software component that enables java application to interact with the database. 

### JDBC - ODBC
The JDBC-ODBC bridge driver uses ODBC driver to connect to the database. 
The JDBC-ODBC bridge driver converts JDBC method calls into the ODBC function calls. 
Oracle does not support the JDBC-ODBC Bridge from Java 8. 

Advantages:
    easy to use.
    can be easily connected to any database.
Disadvantages:
    Performance degraded because JDBC method call is converted into the ODBC function calls.
    The ODBC driver needs to be installed on the client machine.

## Native-API driver
The Native API driver uses the client-side libraries of the database. 
The driver converts JDBC method calls into native calls of the database API. 
It is not written entirely in java. 

Advantage:
    performance upgraded than JDBC-ODBC bridge driver.

Disadvantage:
    The Native driver needs to be installed on the each client machine.
    The Vendor client library needs to be installed on client machine.


## Network Protocol driver
The Network Protocol driver uses middleware (application server) that converts JDBC calls directly or indirectly into the vendor-specific database protocol. 
It is fully written in java. 

## Thin driver
The thin driver converts JDBC calls directly into the vendor-specific database protocol. That is why it is known as thin driver. It is fully written in Java language. 

## JDBC Statements 
Statement   
Use the for general-purpose access to your database. Useful when you are using static SQL statements at runtime. The Statement interface cannot accept parameters.

PreparedStatement   
Use the when you plan to use the SQL statements many times. 
The PreparedStatement interface accepts input parameters at runtime.

CallableStatement   
Use the when you want to access the database stored procedures. 
The CallableStatement interface can also accept runtime input parameters.

## Execute Statements 
    boolean execute (String SQL): Returns a boolean value of true if a ResultSet object can be retrieved; otherwise, it returns false. Use this method to execute SQL DDL statements or when you need to use truly dynamic SQL.

    int executeUpdate (String SQL): Returns the number of rows affected by the execution of the SQL statement. Use this method to execute SQL statements for which you expect to get a number of rows affected - for example, an INSERT, UPDATE, or DELETE statement.

    ResultSet executeQuery (String SQL): Returns a ResultSet object. Use this method when you expect to get a result set, as you would with a SELECT statement.
