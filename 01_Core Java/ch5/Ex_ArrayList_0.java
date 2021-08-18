package a.b.c.ch5;

import java.util.ArrayList;

public class Ex_ArrayList_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ArrayList aList = new ArrayList();
		// aList.add("오재영");

		ArrayList<String> aList = new ArrayList<String>();
		aList.add("오재영");
	}

}

/*
C:\00.KOSMO93\10.JExam\ch5>javac -d . ArrayList_2.java
Note: ArrayList_2.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

C:\00.KOSMO93\10.JExam\ch5>javac -Xlint -d . ArrayList_2.java
ArrayList_2.java:10: warning: [rawtypes] found raw type: ArrayList
                ArrayList aList = new ArrayList();
                ^
  missing type arguments for generic class ArrayList<E>
  where E is a type-variable:
    E extends Object declared in class ArrayList
ArrayList_2.java:10: warning: [rawtypes] found raw type: ArrayList
                ArrayList aList = new ArrayList();
                                      ^
  missing type arguments for generic class ArrayList<E>
  where E is a type-variable:
    E extends Object declared in class ArrayList
ArrayList_2.java:11: warning: [unchecked] unchecked call to add(E) as a member of the raw type ArrayList
                aList.add("오재영");
                         ^
  where E is a type-variable:
    E extends Object declared in class ArrayList
3 warnings

C:\00.KOSMO93\10.JExam\ch5>


*/
