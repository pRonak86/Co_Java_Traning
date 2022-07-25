package com.jdbcCall;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.FormatFlagsConversionMismatchException;
import java.util.Scanner;

public class Ems {
	public static Connection connect() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		// Creating a connection

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/linkgroup", "root", "");
		return con;

	}

	public static void updation() throws ClassNotFoundException, SQLException {
		Connection connection = connect();
		String sql = "Update employee set lname=? where id=?";
		PreparedStatement statement = connection.prepareStatement(sql);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lname ");
		String lnameString = sc.next();
		System.out.println("Enter id ");
		int id = sc.nextInt();

		statement.setString(1, lnameString);
		statement.setInt(2, id);

		int i = statement.executeUpdate();
		if (i > 0) {
			System.out.println("Data inserted");
		} else {
			System.out.println("failed");
		}
		connection.close();

	}

	public static void deletion() throws ClassNotFoundException, SQLException {
		Connection connection = connect();
		String sql = "Delete from employee where id = ?";
		PreparedStatement statement = connection.prepareStatement(sql);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id ");
		int id = sc.nextInt();
		statement.setInt(1, id);
		int i = statement.executeUpdate();
		if (i > 0) {
			System.out.println("Data Deleted");
		} else {
			System.out.println("failed");
		}
		connection.close();
	}

	public static void insertion() throws ClassNotFoundException, SQLException {
		Connection connection = connect();
		String sql = "Insert into employee (fname,lname,city) values (?,?,?)";
		PreparedStatement statement = connection.prepareStatement(sql);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter fname ");
		String fnameString = sc.next();
		System.out.println("Enter lname ");
		String lnameString = sc.next();
		System.out.println("Enter city ");
		String city = sc.next();

		statement.setString(1, fnameString);
		statement.setString(2, lnameString);
		statement.setString(3, city);

		int i = statement.executeUpdate();
		if (i > 0) {
			System.out.println("Data inserted");
		} else {
			System.out.println("failed");
		}
		connection.close();

	}

	public static void searchAll() throws ClassNotFoundException, SQLException {
		Connection connection = connect();
		String sql = "select * from employee";
		// PreparedStatement statement = connection.prepareStatement(sql);
		Statement st = connection.createStatement();
		ResultSet rs = st.executeQuery(sql);
		while (rs.next()) {
			System.out.println("Id--->" + rs.getInt(1));
			System.out.println("Fname--->" + rs.getString(2));
			System.out.println("Lname--->" + rs.getString(3));
			System.out.println("City--->" + rs.getString(4));

		}

		connection.close();
	}

	public static void searchById() throws ClassNotFoundException, SQLException {
		Connection connection = connect();
		Scanner t = new Scanner(System.in);
		System.out.println("Enter your choice for search by id");
		int choice = t.nextInt();
		PreparedStatement ps = connection.prepareStatement("select * from employee where id=?");
		ps.setInt(1, choice);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.println("Id--->" + rs.getInt(1));
			System.out.println("Fname--->" + rs.getString(2));
			System.out.println("Lname--->" + rs.getString(3));
			System.out.println("City--->" + rs.getString(4));
		}
		connection.close();
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

//		Scanner t=new Scanner(System.in);
//		System.out.println("Enter your choice(0 to abort 1 for insert 2 update 3 for delete 4 for search all 5 for search by id");
//		int choice = t.nextInt();
		boolean flag = true;
		while (flag) {
			Scanner t = new Scanner(System.in);
			System.out.println(
					"Enter your choice(0 to abort 1 for insert 2 update 3 for delete 4 for search all 5 for search by id");
			int choice = t.nextInt();
			switch (choice) {
			case 1:
				insertion();
				break;

			case 2:
				updation();
				break;

			case 3:
				deletion();
				break;

			case 4:
				searchAll();
				break;
			case 5:
				searchById();
				break;

			case 0:
				System.out.println("Thankyou");
				flag = false;
				break;
			}
		}

	}

}
