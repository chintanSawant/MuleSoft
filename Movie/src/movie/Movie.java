/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movie;
import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author Chintan Sawant
 */
public class Movie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception
    {
       Scanner sc=new Scanner(System.in);
       DriverManager.registerDriver(new com.mysql.jdbc.Driver());
       Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/movies","root","");
       System.out.println("1. INSERT MOVIE :");
       System.out.println("2. SEARCH MOVIE BASED ON LEAD ACTOR :");
       System.out.println("ENTER YOUR CHOICE :");
       int ch =sc.nextInt();
       switch (ch){
           case 1: System.out.println("ENTER MOVIE NAME TO BE SEARCHED: ");
             String Movie_Name = sc.next();
                    System.out.println("ENTER THE NAME OF LEAD ACTOR:");
                    String Actor = sc.next();
                    System.out.println("ENTER THE NAME OF LEAD ACTRESS:");
                    String Actress = sc.next();
                     System.out.println("ENTER THE NAME OF THE DIRECTOR:");
                    String Director = sc.next();
                    System.out.println("ENTER YEAR OF RELEASE:");
                    int year = sc.nextInt();
                   
                    PreparedStatement stmt = conn.prepareStatement("insert into movies(Movie_Name,Actor,Actress,Director,Year_of_release) values(?,?,?,?,?)");
                    stmt.setString(1, Movie_Name);
                    stmt.setString(2, Actor);
                    stmt.setString(3, Actress);
                    stmt.setString(4, Director);
                    stmt.setInt(5, year);
                    stmt.executeUpdate(); 
                   
                    break;
                case 2:
                     System.out.println("ENTER LEAD ACTOR NAME TO SEARCH MOVIE:");
                   String lactor=sc.next();
                    String sql = "Select * From movies Where Actor='"+lactor+"'";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rst = pstmt.executeQuery();
            if (rst.next()) {
                      
                        System.out.println(rst.getString(1));
                        System.out.println(rst.getString(2));
                        System.out.println(rst.getString(3));
                        System.out.println(rst.getString(4));
                        System.out.println(rst.getInt(5));
                       
            }
                    break;
            }
    
    }
    
}
       
    
    

