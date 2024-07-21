/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anshu.dao;

/**
 *
 * @author HOME
 */
import com.anshu.bean.StudentBean;
import com.anshu.utility.ConnectionPool;
import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class StudentDeo {
    static Connection conn;
    public int addStudent(StudentBean sb){
        conn =ConnectionPool.connectDB();
        String sql="insert into Student values('"+sb.getId()+"','"+sb.getName()+"','"+sb.getEnroll()+"','"+sb.getPer()+"')";
        Statement stmt;
        int r=0;
        try {
            stmt=conn.createStatement();
             r=stmt.executeUpdate(sql);
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDeo.class.getName()).log(Level.SEVERE, null, ex);
        }
      return r;   
    }
    public int UpdateStudent(StudentBean sb){
        conn=ConnectionPool.connectDB();
        String sql="update student set name='"+sb.getName()+"',enroll='"+sb.getEnroll()+"',per='"+sb.getPer()+"' where id='"+sb.getId()+"'";
      int r=0;
        try {
            Statement stmt=conn.createStatement();
            r=stmt.executeUpdate(sql);
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDeo.class.getName()).log(Level.SEVERE, null, ex);
        }
      return r;
    }
    
     public int DeleteStudent(int id){
        conn=ConnectionPool.connectDB();
        String sql="delete from student where id='"+id+"'";
        
      int r=0;
        try {
            Statement stmt=conn.createStatement();
            r=stmt.executeUpdate(sql);
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDeo.class.getName()).log(Level.SEVERE, null, ex);
        }
      return r;
    }
     
       public void FindAll(){
        conn=ConnectionPool.connectDB(); //step1,step2
        //step3 :Write SQL Query
        String sql="select * from student";
        try {
            //step4: Create Object of Statement
            Statement stmt=conn.createStatement();
            //step5: call executeQuery
            ResultSet rs=stmt.executeQuery(sql);
            //step6: Process Result
            while(rs.next()){
                System.out.println(""+rs.getInt("id")+"/t"+rs.getString("name")+"/t"+rs.getString("enroll")+"/t"+rs.getFloat("per"));
            }
            //step7: Close the Connections
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDeo.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
    }
    
    
    public static void main(String[] args) {
        StudentBean s=new StudentBean();
//        int i;
//        String n,e;
//        float p;
//        Scanner scan=new Scanner(System.in);
//        System.out.println("Enter id ");
//        i=scan.nextInt();
//        System.out.println("Enter name");
//        n=scan.nextLine();
//        scan.nextLine();
//        System.out.println("Enter enroll");
//        e=scan.nextLine();
//        System.out.println("Enter Percent");
//        p=scan.nextFloat();
//        s.setId(i);
//        s.setName(n);
//        s.setEnroll(e);
//        s.setPer(p);
        StudentDeo sd=new StudentDeo();
        
//        1.AddStudent
//        int r=sd.addStudent(s);
//        if(r>0){
//            System.out.println("Student Added Success");
//        }
//        else{
//            System.out.println("Student Not Added");
//        }

//        2.UpdateStudent
//          int r=sd.UpdateStudent(s);
//           if(r>0){
//         System.out.println("Student updated Success");
//     }else{
//         System.out.println("Student Not updated");
//     }


//        3. deleteStudent() method
//    int r=sd.DeleteStudent(i);
//    if(r>0){
//        System.out.println("Delete Student success");
//            }
//    else{
//           System.out.println("Student Not Deleted");
//        }


//      4. Call findAll method
       sd.FindAll();
        
    }
}
