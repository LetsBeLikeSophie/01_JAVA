package a.b.c.swing;

import javax.swing.JFrame;

public class JFrameTest_1 extends JFrame{
	
	// ������
	public JFrameTest_1(String title) {
		super(title);
		
		// GUI ���ø����̼ǿ��� 
		// ȭ���� �׸��� ������ �� ���� �Ͼ�� �Ѵ�. 
		// �����ڿ��� ȭ���� �׸��� ������ �Ѵ�. 
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setVisible(true);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new JFrameTest_1("JFrame ����ؼ� ����ϱ� ");
	}
}
