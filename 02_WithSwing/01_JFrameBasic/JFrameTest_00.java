package a.b.c.swing;

import javax.swing.JFrame;

public class JFrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame jf = new JFrame("ù��° JFrame");
		System.out.println("jf �������� >>> : " + jf);
		
		// JFrame �� ũ�� 
		// jf.setSize(��, ����)
//		jf.setSize(width, height); void - Window
		jf.setSize(600, 500);
		
		// JFrame ���̱� 
		// JFraem ������ܿ� �� ���ʿ� �ִ� x ��ư�� Ŭ���ϸ� JFrame�� ���̼��� 
//		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  void - Window
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		// JFrame ������ ȭ�鿡 �����ּ��� : true, �Ⱥ����ּ��� : false 
		// �� �޸𸮿� �ִ»��·� 
//		jf.setVisible(true);void - Window
		jf.setVisible(true);
	}

}
