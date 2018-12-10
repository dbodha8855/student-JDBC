package client2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import db.StudentDb;
import entity2.Student;
import entity2.ValidationStudent;

public class StudentMain {

	public static void main(String[] args) throws ClassNotFoundException 
	{
		ValidationStudent vd=new ValidationStudent();
		Student st = new Student();
		StudentDb sdb = new StudentDb();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter student id:");
		st.stdId=sc.next();		
		System.out.println("enter student name:");
		st.stName=sc.next();
		System.out.println("enter student branch");
		st.stdBranch=sc.next();
		System.out.println("entering");
		if(vd.validateStdId(st.getStdId()) && vd.validateStdId(st.getStName()) && vd.validateStdBranch(st.getStdBranch()))
		{
		sdb.dbMethod(st);
		
		
		}
		else
			System.out.println("gone!!");
	

	}
}


