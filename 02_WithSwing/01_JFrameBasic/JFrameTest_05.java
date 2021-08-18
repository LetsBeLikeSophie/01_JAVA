package a.b.c.swing;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JFrameTest_5 extends JFrame{
	
	// ������
	public JFrameTest_5(String title) {
		super(title);
		
		// getLayout() LayoutManager - Container
		// JFrame ����Ʈ ���̾ƿ� �Ŵ����� �������̾ƿ��̴�. : java.awt.BorderLayout
		System.out.println("getLayout() >>> : " + getLayout());			
				
		// ������������ ����Ʈ ���̾ƿ� �Ŵ��� �������̾ƿ��� 
		// �׸��� ���̾ƿ� �Ŵ����� �����Ͻÿ� 
		setLayout(new GridLayout(3, 2)); // rows �� * cols ��
		
		JLabel jb1 = new JLabel("�� 1");
		JTextField jt1 = new JTextField();
		JLabel jb2 = new JLabel("�� 2");
		JTextField jt2= new JTextField();
		JLabel jb3 = new JLabel("��3");
		JTextField jt3 = new JTextField();
		
		add(jb1);
		add(jt1);
		add(jb2);
		add(jt2);
		add(jb3);
		add(jt3);
		
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setVisible(true);		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrameTest_5 jf3 = new JFrameTest_5("JFrame");
		
	}
}
