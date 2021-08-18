package a.b.c.ch3;

public class GetInfo
{
	public static void main(String[] args) 
	{
		
		System.out.println("Number of args >>> " + args.length);
		for (int i=0; i<args.length ; i++){
			System.out.println("["+args[i] + "]");
		}
	}
}

/*
	°á°ú°ª:

	C:\00.KOSMO93\10.JExam\ch3>javac -d . GetInfo.java

	C:\00.KOSMO93\10.JExam\ch3>java a.b.c.ch3.GetInfo a b c 1 2 3 4123 54535 1231sd dgs
	Number of args >>>10
	[a]
	[b]
	[c]
	[1]
	[2]
	[3]
	[4123]
	[54535]
	[1231sd]
	[dgs]
*/
