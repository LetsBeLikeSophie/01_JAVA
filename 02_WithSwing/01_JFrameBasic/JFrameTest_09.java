package a.b.c.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrameTest_09 extends JFrame implements ActionListener{
	
	private JButton jbt;
	
	// ������
	public JFrameTest_09() {
		
		this.setTitle("�̺�Ʈ �غ���");		
		this.setLayout(new FlowLayout());
		
		jbt = new JButton("��ư�� �����ÿ� >>> :");
		
		// ���� ��ü�� �����ʷ� ���
		jbt.addActionListener(this);
		
		this.add(jbt);
		
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setVisible(true);		
	}
	
	// ���� ��ü ����ϱ�
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == jbt) {
			jbt.setText("��ħ�� ��ư�� ���Ƚ��ϴ�. >>> : ");	
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		new JFrameTest_09();		
	}
}


