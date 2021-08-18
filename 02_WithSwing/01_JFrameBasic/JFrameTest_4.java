package a.b.c.swing;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrameTest_4 extends JFrame{
	
	// ������
	public JFrameTest_4(String title) {
		super(title);
		
		// getLayout() LayoutManager - Container
		// JFrame ����Ʈ ���̾ƿ� �Ŵ����� �������̾ƿ��̴�. : java.awt.BorderLayout
		System.out.println("getLayout() >>> : " + getLayout());
		
		JPanel jp = new JPanel();
		// JPanel ������ ���̾ƿ� �Ŵ����� �÷ο� ���̾ƿ��̴�. java.awt.FlowLayout
		System.out.println("jp.getLayout() >>> : " + jp.getLayout());		
		jp.setBackground(Color.red);
		
		JButton jb1 = new JButton("Button1");
		JButton jb2 = new JButton("Button2");
		JButton jb3 = new JButton("Button3");
		JButton jb4 = new JButton("Button4");
		JButton jb5 = new JButton("Button5");

		// �����ǳڿ� ���̹�ư�� ���̴� �� 
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);
		
		// ���������ӿ� �����ǳ��� ���̴� �� 
		// ������������ ����Ʈ ���̾ƿ��Ŵ����� �������̾ƿ��� ���Ϳ����� ����ȴ�.
		add(jp);
		
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setVisible(true);		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrameTest_4 jf3 = new JFrameTest_4("JFrame");
		
	}
}
