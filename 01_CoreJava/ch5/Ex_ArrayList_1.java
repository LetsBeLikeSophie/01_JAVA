package a.b.c.ch5;

import java.util.ArrayList;

public class Ex_ArrayList_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ArrayList �迭 �̴�. ���� ���� �質�� Ű�ٸ� ������ �̴�.
		// ������ Ÿ���� �޶� �������
		// ������ ���ڶ��, ��ġ�� ��ġ�´�� �� ����Ѵ�. 
		// ������ �ִ�. index

		// Array �迭�� ������ �ư��� ����.
		// ������ Ÿ���� ���ƾ� �Ѵ�. 
		// ������ ���ڶ�� ������ ����
		// ������ �ִ�. index
		// ������ ���� �۰� ������ ó���� �� ����Ѵ�. 
		ArrayList aList = new ArrayList();	
		System.out.println("aList.size() >>> : " + aList.size());
		System.out.println("aList >>> : " + aList);
		aList.add(1);
		System.out.println("aList >>> : " + aList);
		aList.add(new Integer("100"));
		System.out.println("aList >>> : " + aList);
		aList.add("�缺��");
		System.out.println("aList >>> : " + aList);
		aList.add(new String("�̴���"));
		System.out.println("aList >>> : " + aList);
		aList.add('c');
		System.out.println("aList >>> : " + aList);
		aList.add(false);
		System.out.println("aList >>> : " + aList);
		aList.add(aList);
		System.out.println("aList >>> : " + aList);
		aList.add(new a.b.c.TestVO());
		System.out.println("aList >>> : " + aList);
		System.out.println("aList.size() >>> : " + aList.size());
		aList.add(new a.b.c.TestVO());
		System.out.println("aList >>> : " + aList);
		aList.add(new a.b.c.TestVO());
		System.out.println("aList >>> : " + aList);
		System.out.println("aList.size() >>> : " + aList.size());
		aList.add(new a.b.c.TestVO());
		System.out.println("aList >>> : " + aList);
		System.out.println("aList.size() >>> : " + aList.size());
		
		for (int i=0; i < aList.size(); i++) {
			System.out.println(">>> : " + aList.get(i));
		}
		
		
	}

}
