/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author Danny
 */
public class DAO {
    private Connection conn;
    private String table;
    
    public  DAO(Connection conn, String table)
    {
        this.conn = conn;
        this.table = table;
    }
    
    public ArrayList<Student> findStudentByName(String name) throws SQLException {
        ArrayList<Student> students = new ArrayList<>();
        PreparedStatement pStmt = conn.prepareStatement("SELECT* FROM "+ table +" where name=?");
        pStmt.setString(1, name);
        ResultSet rs = pStmt.executeQuery();
        
        while(rs.next())
        {
            Student s = new Student(
            String.valueOf(rs.getLong("id")),
            rs.getString("name"),
            rs.getString("course")
             
            );
            s.setMark(rs.getInt("mark"));
            students.add(s);
        }
        return students;
         
    }
    
    public long addStudent(Student student) throws SQLException{
        PreparedStatement pStmt = conn.prepareStatement("insert into " + table + "(name, course, mark, type) values(?, ?, ?, ?)");
        pStmt.setString(1, student.getName());
        pStmt.setString(2, student.getCourse());
        pStmt.setInt(3,(int)student.getMark());
        pStmt.setString(4, "Undergraduate");
        int rowsAdded = pStmt.executeUpdate();
        long allocatedID = 0L;
        
        if(rowsAdded == 1)
        {
            ResultSet rs =  pStmt.getGeneratedKeys();
            if(rs.next())
            {
                allocatedID = rs.getLong(1);
                student.setID(allocatedID);
                
            }
  
            
        }
        return allocatedID;
               
    }

}
