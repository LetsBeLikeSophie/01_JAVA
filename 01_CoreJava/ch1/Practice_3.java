package a.b.c.ch1;


public class Practice_3 {

	String name;
	int age;


	public Practice_3() {
		System.out.println("������ �Ű� ���� ����.");
	}
	public Practice_3(String name) {		
		System.out.println("�̸��� " + name + "�Դϴ�.");
	}
	public Practice_3(int age) {
		System.out.println("���̴� " + age + "�Դϴ�.");
	}

	public Practice_3(String name, int age){
		System.out.print("�̸��� " + name);
		System.out.print(", ");
		System.out.print("���̴� " + age);
	}

	public Practice_3(int age, String name){
		System.out.print("���̴� " + age);
		System.out.print(", ");
		System.out.print("�̸��� " + name);
	}

	public static void main(String[] args) {

		System.out.println("1) ������ ���� �� : ");
		Practice_3 prc3_1 = new Practice_3();
		System.out.println();

		System.out.println("2) ���� �� : 33");
		Practice_3 prc3_2 = new Practice_3(33);
		System.out.println();
        

		System.out.println("3) �̸� �� : �ּ���");
		Practice_3 prc3_3 = new Practice_3("�ּ���");
		System.out.println();
        



		

	} // end of method, main
	


} // end of class, Practice_3