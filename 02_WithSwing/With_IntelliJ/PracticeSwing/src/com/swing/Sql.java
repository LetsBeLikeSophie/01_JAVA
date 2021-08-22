package com.swing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;


public class Sql {

    public static final String URL = "jdbc:oracle:thin:@localhost:1521:orclKOSMO00";
    public static final String USER = "csi00";
    public static final String PASSWORD = "csi1234";
    VO vo = new VO();
//    Sql sql = new Sql();
//    vo.setColumnNumber(sql.getNumberOfColumn());

    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    ResultSet getResultSetWith (String query){

        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
        } catch(Exception e) {
            System.out.println("연결부분에서 에러 : "+e.getMessage());
        }
        return this.resultSet = resultSet;

    }



    public String getNumberOfColumn() {

        String number = "";

        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            preparedStatement = connection.prepareStatement
                    ("SELECT COUNT(*)\n" +
                         "FROM USER_TAB_COLUMNS\n" +
                         "WHERE TABLE_NAME = 'PRACTICE02'");
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                number = resultSet.getString(1);
            }

        } catch (Exception e) {
            System.out.println("에러" + e.getMessage());
        }
        return number;
    }

    public String getNumberOfRow() {


        String number = "";

        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            preparedStatement = connection.prepareStatement("SELECT COUNT(*) FROM PRACTICE02");
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                number = resultSet.getString(1);
            }

        } catch (Exception e) {
            System.out.println("에러" + e.getMessage());
        }
        return number;
    }

    public void selectAll() {
        Sql sql = null;

        try {
            sql = new Sql();
            vo.setColumnNumber(sql.getNumberOfColumn());
            getResultSetWith("SELECT * FROM PRACTICE02");

            while (resultSet.next()) {
                for (int i = 1; i <= vo.columnNumber_int; i++) {
                    System.out.print(resultSet.getString(i) + " ");
                }
                System.out.println();
            }

        } catch (Exception e) {
            System.out.println("에러" + e.getMessage());
        }

    }



    public void select() {
        Scanner scanner = new Scanner(System.in);
        StringBuffer stringBuffer = null;
        String number = "";
        String query = "";

        try {
            stringBuffer = new StringBuffer();
            System.out.println("회원번호를 입력하세요: ");
            number = scanner.next();
            query = "SELECT NUM, ID, PW FROM PRACTICE02 WHERE NUM = ";
            stringBuffer.append(query);
            stringBuffer.append(number);

            getResultSetWith(stringBuffer.toString());
//          preparedStatement.clearParameters();
//          preparedStatement.setString(1, numOfMember);

            while (resultSet.next()) {
                System.out.println("select");
                System.out.print(resultSet.getString(1) + ", ");
                System.out.print(resultSet.getString(2) + ", ");
                System.out.println(resultSet.getString(3));
            }
        } catch(Exception e){
                System.out.println("에러" + e.getMessage());
            }

        }


    public void insert() {

        Scanner scanner = new Scanner(System.in);

        boolean isFilled = false;
        String num = "";
        String id = "";
        String pw = "";

        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("회원번호 : ");
            num = scanner.next();
            System.out.println("아이디 : ");
            id = scanner.next();
            System.out.println("비밀번호 : ");
            pw = scanner.next();

            preparedStatement = connection.prepareStatement("INSERT INTO PRACTICE02 VALUES (\'" +num+ "\', \'"+id+"\', \'"+pw+"\')");
            resultSet = preparedStatement.executeQuery();
            isFilled = true;

        } catch(Exception e){
            System.out.println("에러" + e.getMessage());
        }
        if(isFilled)
            System.out.println("저장되었습니다.");
    }


    public void delete() {
        Scanner scanner = new Scanner(System.in);
        String number = "";

        try {
            System.out.println("회원번호를 입력하세요: ");
            number = scanner.next();
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            preparedStatement = connection.prepareStatement("DELETE FROM PRACTICE02 WHERE NUM = \'"+number+"\'");
            resultSet = preparedStatement.executeQuery();
        } catch(Exception e){
            System.out.println("에러" + e.getMessage());
        }
            System.out.println("삭제되었습니다.");
   }


}
