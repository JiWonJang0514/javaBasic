package com.cProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBConnection {
	public static void main(String[] args) {
		final String URL = "jdbc:mysql://localhost:3306/test";
		final String USER = "root";
		final String PASSWORD = "";
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String keyword = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("검색어를 입력하세요.");
		keyword = sc.nextLine(); 
		
		String sql = "select * from product where name=?";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println(conn);
			//stmt = conn.createStatement();
			//rs = stmt.executeQuery(sql);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, keyword);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println("모델명: " + rs.getString("model"));
				System.out.println("이름: " + rs.getString("name"));
				System.out.println("가격: " + rs.getString("price"));
				System.out.println("수량: " + rs.getString("count"));
				System.out.println("기타: " + rs.getString("etc"));
				
				System.out.println("---");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
