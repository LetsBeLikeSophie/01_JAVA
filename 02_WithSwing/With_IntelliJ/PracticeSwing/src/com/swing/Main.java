package com.swing;

import javafx.scene.shape.Box;

import javax.naming.spi.DirStateFactory;
import javax.swing.*;
import javax.xml.transform.Result;
import java.awt.*;
import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        JFrame jFrame = new JFrame("회원관리");
//        jFrame.setSize(500, 500);
//        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        jFrame.setVisible(true);
//
//        JPanel jPanel01 = new JPanel();
//        JPanel jPanel02 = new JPanel();
//        Container contentPane = jFrame.getContentPane();
//
//
//        jPanel01.setBackground(Color.lightGray);
//        jPanel01.setLayout(new BoxLayout(jPanel01, BoxLayout.Y_AXIS));
//        jPanel02.setLayout(new BoxLayout(jPanel02, BoxLayout.X_AXIS));
//
//        JButton jButton01 = new JButton("[1]전체조회");
//        JButton jButton02 = new JButton("[2]부분조회");
//        JButton jButton03 = new JButton("[3]정보입력");
//        JButton jButton04 = new JButton("[4]정보삭제");
//
//
//        jPanel02.add(jButton01);
//        jPanel02.add(jButton02);
//        jPanel02.add(jButton03);
//        jPanel02.add(jButton04);
//
//        contentPane.add(jPanel01, BorderLayout.SOUTH);
//        contentPane.add(jPanel02, BorderLayout.NORTH);
//
//        jFrame.add(jPanel01);
//        jFrame.add(jPanel02);
//

        VO vo = new VO();
        Sql sql = new Sql();
        vo.setColumnNumber(sql.getNumberOfColumn());
        vo.setRowNumber(sql.getNumberOfRow());
        System.out.println(vo.columnNumber+", "+vo.rowNumber);


//        Sql sql = new Sql();
        Scanner scanner = new Scanner(System.in);
        System.out.println("[1]전체조회 \n" + "[2]부분조회 \n" + "[3]정보입력\n" + "[4]정보삭제\n"
                          + "원하시는 번호를 선택하세요.");

        int selection = scanner.nextInt();
        switch (selection) {
            case 1:
                sql.selectAll();
                break;
            case 2:
                sql.select();
                break;
            case 3:
                sql.insert();
                break;
            case 4:
                sql.delete();
                break;
        }



    }
}

