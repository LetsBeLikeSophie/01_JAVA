package a.b.c.ch6;

public class Ex_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		public String substring(int beginIndex)
//		public String substring(int beginIndex, int endIndex)
/*		
		 "unhappy".substring(2) returns "happy"
		 "Harbison".substring(3) returns "bison"
		 "emptiness".substring(9) returns "" (an empty string)
		 "hamburger".substring(4, 8) returns "urge"
		 "smiles".substring(1, 5) returns "mile"
*/		 
/*
		index = length() -1									
		length() = index + 1									
				0	1	2	3	4	5	6									
				u	n 	h	a   p 	p 	y												
		u = s0.charAt(0)									
		n = s0.charAt(1)									
		h = s0.charAt(2)									
		a = s0.charAt(3)									
		p = s0.charAt(4)									
		p = s0.charAt(5)									
		y = s0.charAt(6)									
*/
		String s0 = "unhappy";
		System.out.println("s0.length() >>> : " + s0.length());
		System.out.println("s0.charAt(2) >>> : " + s0.charAt(2));
		String s1 = s0.substring(2);
		System.out.println("s0.charAt(2) :: s0.substring(2) >>> : " + s1);
	
	}

}
