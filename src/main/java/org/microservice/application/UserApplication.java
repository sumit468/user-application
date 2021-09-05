package org.microservice.application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserApplication {

	public static void main(String[] args) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521/xe";
			String user = "system";
			String password = "admin";
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("Connection Created");
			Statement statement = conn.createStatement();
			ResultSet set = statement.executeQuery("SELECT * FROM CUSTOMERS");
			while (set.next()) {
				System.out.println("ID=" + set.getString("Customer_ID") + " Name=" + set.getString("CUSTOMER_NAME")
						+ " CITY=" + set.getString("CITY"));
			}
//			SpringApplication.run(UserApplication.class, args);
		} catch (SQLException e) {
			System.out.println("Something went wrong");
			e.printStackTrace();
		} catch (ClassNotFoundException e1) {
			System.out.println(e1);
		}

//		SpringApplication.run(UserApplication.class, args);
	}
}
