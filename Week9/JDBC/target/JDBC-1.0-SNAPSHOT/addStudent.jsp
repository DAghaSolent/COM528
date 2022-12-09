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
<%@page import="com.DAO"%>
<%@page import="com.Student"%>

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
        DAO studentDAO;
        long StudentID = 0L;
        try
        {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:C:/Users/Danny/Documents/Uni Solent Work/Year 2/COM528 Object Oreintated Design and Development/Week9/university.db");
            Statement  stmt = conn.createStatement();
            stmt.executeUpdate("create table if  not exists student (id integer primary key autoincrement, name string, course string, mark integer, type string)");
            String reqName = request.getParameter("name");
            String reqCourse = request.getParameter("course");
            String reqMark = request.getParameter("mark");
            double new_mark = Double.parseDouble(reqMark);
            Student student = new Student("",reqName, reqCourse);
            student.setMark(new_mark);
            
            studentDAO =  new DAO(conn, "student");
            
            StudentID = studentDAO.addStudent(student);
                    
            if(StudentID > 0)
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
