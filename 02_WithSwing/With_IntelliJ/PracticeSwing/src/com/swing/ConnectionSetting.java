package com.swing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnectionSetting {

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
