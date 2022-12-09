<%-- 
    Document   : search
    Created on : 23 Nov 2022, 11:00:43
    Author     : Danny
--%>


<%@page import="com.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.SQLException" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.Statement" %>
<%@page import="java.sql.PreparedStatement" %>
<%@page import="java.sql.ResultSet" %>
<%@page import="com.DAO"%>
<%@page import="java.util.ArrayList"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Search for Student</h1>
        <%
        Connection conn = null;
        DAO studentDAO;
        try
        {
            
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:C:/Users/Danny/Documents/Uni Solent Work/Year 2/COM528 Object Oreintated Design and Development/Week9/university.db");
            
            Statement  stmt = conn.createStatement();
            stmt.executeUpdate("create table if  not exists student (id integer primary key autoincrement, name string, course string)");
            studentDAO = new DAO(conn, "student");
            String reqName = request.getParameter("name");
            ArrayList<Student> students = studentDAO.findStudentByName(reqName);
            
            
            out.println(students);
            
            
            // Student foundStudent = findStudentByName(reqName);
            
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
