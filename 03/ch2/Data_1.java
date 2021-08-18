package a.b.c.ch2;

/*
Java Data Type : �ڷ���

	�ڹ� ������ Ÿ���� �ּ� ������ 1byte �̴�. 
	1byte �� 8bit �̴� : 00000001

#############################
���� �ڷ��� : primitive type
#############################

	��ǻ�Ϳ����� ������ ũ�� ������ ������� ���� �ʴ´� : ���е��� �Ѵ�. 
	�Ǽ��� �������� ������ ũ��.
	��) long 8byte ���� float 4����Ʈ�� ũ�ٰ� ����. 

	______________________________________
	
	JVM�� ���ڸ� int �� �ν��Ѵ� : 4byte(32bit)
	______________________________________
	
	int�� �Ѿ�� ������ Ÿ���� �ν� ���Ѵ�. 
	long(L , l), float(F , f), double(D, d) ������ Ÿ���� ǥ�ø� �ؾ� �Ѵ�. 
		long l = 12987293827L;
		long ll = 12987293827l;
		float f = 23.349384394F;
		float ff = 23.349384394f;
		double d = 243.2337928749D;
		double dd = 243.2337928749d;

	���� ������ Ÿ���� 
		����� ���� ������ Ÿ�Կ��� ū ������ Ÿ������ ������ �ϸ� 
		�ڵ� ����ȯ�� �Ͼ��. : ������ ����ȯ : implicit casting 
		ū ������ Ÿ�Կ��� ����� ���� ������ Ÿ������ ������ �ϸ�
		���Ƿ� ����ȯ�� �� �־�� �Ѵ�. : ������ ����ȯ : explicit casting
		
		������ ����ȯ : implicit casting
		---------------------------->
		byte < char < short < int < long < float < double
							<----------------------------
							������ ����ȯ : explicit casting
����
	���� : default �� : 0
		byte	1byte(8bit) : ��������(���Ǻ�ȣ ��Ʈ) 0 ��������(���Ǻ�ȣ ��Ʈ) : -128 ~ 0 ~ +127
			char	2byte(16bit) : 0 �� ������ �������� : 0 ~ +65535
		short	2byte(16bit) : ��������(���Ǻ�ȣ ��Ʈ) 0 ��������(���Ǻ�ȣ ��Ʈ)
		int		4byte(32bit) : ��������(���Ǻ�ȣ ��Ʈ) 0 ��������(���Ǻ�ȣ ��Ʈ)
		long	8byte(64bit) : ��������(���Ǻ�ȣ ��Ʈ) 0 ��������(���Ǻ�ȣ ��Ʈ)

	�Ǽ� : default �� : 0.0 : ������.������
		float	4byte(32bit) : ��������(���Ǻ�ȣ ��Ʈ) 0 ��������(���Ǻ�ȣ ��Ʈ)
		double	8byte(64bit) : ��������(���Ǻ�ȣ ��Ʈ) 0 ��������(���Ǻ�ȣ ��Ʈ) 
���� 
	���� : char 
	���ڿ� : String : ���� �ڷ���
	
����	boolean 1byte(8bit) : default �� : false
		true, false

#############################
���� �ڷ��� : reference type 
#############################
	��Ʈ�� Ŭ����
		Array, Interface ...................
	����� ���� Ŭ���� 
*/

/*
�ڹٴ� ��ü ���� �̸� ���� ���� �������̴�.
Object Oriented Programming

�ڹٿ��� ����ϴ� ��� �ڿ��� Object  �̴�.
	_____________________________________

	�ڹٿ��� ����ϴ� �ڿ� �� Object �� �ƴ� ����
	���� �ڷ���(primitive type) �̴�.

	���� �ڷ����� �����ϴ�
	Wrapper Class �� ����� �����Ѵ�. 
	_____________________________________

byte		Byte
char		Character
short		Short
int			Integer
long		Long
float		Float
double		Double
boolean		Boolean

���� �ڷ����� ����ϸ�
�ڹٿ��� ���������� Wrapper Class ����Ѵ�. 
Byte
Character
Short
Integer
Long
Float
Double
Boolean
*/

public class Data_1 {

	public static void main(String[] a) {
		
	} // end of main �Լ� 
} // end of Data_1 Ŭ���� 