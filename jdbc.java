package Inheritance.Jdbc1;
import java.util.Scanner;

import java.sql.*;

import java.sql.DriverManager;

public class jdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pj1","root","3@Sailaja");
			System.out.println("Connection created");
			
			Scanner ss=new Scanner(System.in);
			
			System.out.println("Enter id");
			int id = ss.nextInt();
			
			System.out.println("Enter name");
			String name = ss.next();
			
			System.out.println("Enter marks");
			int marks = ss.nextInt();
			
			String ins = "insert into pj1 (id, name, marks) values(?,?,?)"; 
			 PreparedStatement a = con.prepareStatement(ins);
			 
			a.setInt(1, id);
			a.setString(2,name);
			a.setInt(3,  marks);
			
			int b= a.executeUpdate();
			con.close();
			System.out.println(b+ "Records Updated");
	
			
			
		}catch (Exception e) {
			System.out.println(e);
		}
		

	}

}
