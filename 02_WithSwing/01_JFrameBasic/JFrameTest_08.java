package a.b.c.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JFrameTest_08 extends JFrame{
	
	private JButton jbt;
	private JLabel jlb;
	
	// ������
	public JFrameTest_08() {
		
		this.setTitle("�̺�Ʈ �غ���");
		
		JPanel jp = new JPanel();
				
		jbt = new JButton("��ư�� �����ÿ� >>> :");
		jlb = new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�.");
		jbt.addActionListener(new MyListener());
		
		jp.add(jbt);
		jp.add(jlb);
		
		this.add(jp);
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setVisible(true);		
	}

	// ���� Ŭ���� ����ϱ� 
	class MyListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource() == jbt) {
				jlb.setText("��ħ�� ��ư�� ���Ƚ��ϴ�. >>> : ");	
			}			
		}	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		new JFrameTest_08();		
	}
}

