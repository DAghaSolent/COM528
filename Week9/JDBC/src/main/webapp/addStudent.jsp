<%-- 
    Document   : addStudent
    Created on : 23 Nov 2022, 10:34:03
    Author     : Danny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.SQLException" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.Statement" %>
<%@page import="java.sql.PreparedStatement" %>
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
            
            PreparedStatement pStmt = conn.prepareStatement("insert into student(name, course, mark, type) values(?, ?, ?, ?)");
            pStmt.setString(1, request.getParameter("name"));
            pStmt.setString(2, request.getParameter("course"));
            pStmt.setInt(3, Integer.parseInt(request.getParameter("mark")));
            pStmt.setString(4, request.getParameter("type"));
            int rowsAdded = pStmt.executeUpdate();
            if(rowsAdded == 1)
            {
                out.println("Sucessfully added");
            }
            else
            {
                out.println("Could not sucessfully add student");
            }
        }
        catch(SQLException e)
        {
            out.println("Error: " + e);
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
