package com.a.b.c;

public class HelloWorld {
	public static void main(String[] args){
		System.out.println("Java HelloWorld !!");
		System.out.println("�ڹ� ��Ű�� ������");
		System.out.println("javac -d . HelloWorld.java");
		System.out.println("-d : ���丮�� ���弼�� �ɼ�");
		System.out.println(". : ������丮 �ɼ�");
		System.out.println("java com.a.b.c.HelloWorld");
	}
}

// ��Ű�� ������ 
/*
1. javac �����Ϸ� �����ϱ�
2. -d : ���丮����� �ɼ� d �����ϱ� 
3. . : ������丮���� ����(��Ű��)�� ���弼�� 
       ������丮�� ������ �Ϸ��� �ڹ�ȭ���� �ִ� ��ġ 
4. HelloWorld.java : �������� �ڹ�ȭ�ϸ��� Ȯ���ڱ��� �� ���� 
javac -d . HelloWorld.java
*/

// ��Ű�� Ŭ���� �����ϱ�
/*
1. java ���࿣�� �����ϱ�
2. �������� �ڹ�ȭ�� ��ġ���� ��Ű����+Ŭ������ ����
3. ��Ű����+Ŭ������
   ��Ű���� : com.a.b.c
   Ŭ������ : HelloWorld
java com.a.b.c.HelloWorld
*/