package a.b.c.ch1;


public class Practice_3 {

	String name;
	int age;


	public Practice_3() {
		System.out.println("생성자 매개 변수 없음.");
	}
	public Practice_3(String name) {		
		System.out.println("이름은 " + name + "입니다.");
	}
	public Practice_3(int age) {
		System.out.println("나이는 " + age + "입니다.");
	}

	public Practice_3(String name, int age){
		System.out.print("이름은 " + name);
		System.out.print(", ");
		System.out.print("나이는 " + age);
	}

	public Practice_3(int age, String name){
		System.out.print("나이는 " + age);
		System.out.print(", ");
		System.out.print("이름은 " + name);
	}

	public static void main(String[] args) {

		System.out.println("1) 생성자 없을 때 : ");
		Practice_3 prc3_1 = new Practice_3();
		System.out.println();

		System.out.println("2) 나이 값 : 33");
		Practice_3 prc3_2 = new Practice_3(33);
		System.out.println();
        

		System.out.println("3) 이름 값 : 최솔잎");
		Practice_3 prc3_3 = new Practice_3("최솔잎");
		System.out.println();
        



		

	} // end of method, main
	


} // end of class, Practice_3