package a.b.c.swing;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameTest_3 extends JFrame{
	
	// ������
	public JFrameTest_3(String title) {
		super(title);
		
		// getLayout() LayoutManager - Container
		// JFrame ����Ʈ ���̾ƿ� �ų����� �������̾ƿ��̴�. : java.awt.BorderLayout
		System.out.println("getLayout() >>> : " + getLayout());
		
		JButton jb1 = new JButton("Center :: CENTER");
		JButton jb2 = new JButton("Line Start :: WEST");
		JButton jb3 = new JButton("Line End :: EAST");
		JButton jb4 = new JButton("Page Start :: NORTH");
		JButton jb5 = new JButton("Page End :: SOUTH");
		
		add(jb1, BorderLayout.CENTER);
		add(jb2, BorderLayout.LINE_START); // WEST
		add(jb3, BorderLayout.LINE_END); // EAST
		add(jb4, BorderLayout.PAGE_START); // NORTH
		add(jb5, BorderLayout.PAGE_END); // SOUTH
		
		
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setVisible(true);		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrameTest_3 jf3 = new JFrameTest_3("JFrame");
		
	}
}
