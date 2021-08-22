package com.swing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnectionSetting {

    // 이거 클래스 말고 Sql 클래스 내에 있음 따로 만드는게 나을랑가
    // 일단은 선언부 Sql 맨 위에 올리고 내부에 함수 따로 만드는중 그 게 더 나아보여서
    // 여차해서 길어지면 클래스로 뺄 것

    public ResultSet conn(){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try{
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orclKOSMO00", "csi00", "csi1234");
            preparedStatement = connection.prepareStatement("SELECT * FROM PRACTICE02");
            resultSet = preparedStatement.executeQuery();

        }catch (Exception e){
            System.out.println("에러메세지"+e.getMessage());
        }

        return resultSet;
    }
}
