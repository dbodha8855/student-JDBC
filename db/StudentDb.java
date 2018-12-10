package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entity2.Student;
import entity2.ValidationStudent;

public class StudentDb 
{
	//Student std= new Student();
	ValidationStudent vd = new ValidationStudent();

public void dbMethod(Student std) throws ClassNotFoundException
{
	System.out.println("entering");

		System.out.println("i am here");
	try {	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@10.219.34.3:1521/orcl", "trg722", "training722");
		PreparedStatement pstmt = conn.prepareStatement("insert into student(?,?,?)");
		pstmt.setString(1, std.getStdId());
		pstmt.setString(2, std.getStName());
		pstmt.setString(3, std.getStdBranch());
		int i=pstmt.executeUpdate();
		if(i!=0) {
			System.out.println("sucess");
		}
		else
			System.out.println("wrong");
		
		
		PreparedStatement pst=conn.prepareStatement("select * from student");
		ResultSet rs = pst.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getString(1)+" "+rs.getString(2)+"  "+rs.getString(3));
		}
	}
	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}