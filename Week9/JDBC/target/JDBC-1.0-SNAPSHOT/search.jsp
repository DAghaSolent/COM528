<%-- 
    Document   : search
    Created on : 23 Nov 2022, 11:00:43
    Author     : Danny
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.SQLException" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.Statement" %>
<%@page import="java.sql.PreparedStatement" %>
<%@page import="java.sql.ResultSet" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Add Student</h1>
        <%
        Connection conn = null;
        try
        {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:C:/Users/Danny/Documents/Uni Solent Work/Year 2/COM528 Object Oreintated Design and Development/Week9/university.db");
            Statement  stmt = conn.createStatement();
            stmt.executeUpdate("create table if  not exists student (id integer primary key autoincrement, name string, course string, mark integer, type string)");
            PreparedStatement pStmt = conn.prepareStatement("SELECT * from student where name=? ");
            pStmt.setString(1, request.getParameter("name"));
            ResultSet rs = pStmt.executeQuery();
            
            while(rs.next())
            {
                out.println("ID: " + rs.getString("id") +" Name: "+ rs.getString("name")+" Course: "+ rs.getString("course")+ " Mark: "+ rs.getInt("mark")+ " Type: "+ rs.getString("type"));
            }
        }
        catch(SQLException e)
        {
            out.print("Error: " + e);
        }
        finally
        {
            try
            {
                if(conn != null)
                {
                    conn.close();
                }
            }
            catch(SQLException e)
            {
                out.println("Close Error: " + e);
            }
        }
        
        %>
    </body>
</html>
