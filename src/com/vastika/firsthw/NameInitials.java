package com.vastika.firsthw;

public class NameInitials {

	public static void main(String[] args) {
		String name = "Rajendra Basnet Razu singh";
		int length = name.length();
		String t = name.trim();
		System.out.println(t);

		String s = "";
		for (int i = 1; i < length; i++) {
			char c = name.charAt(i);
			if (c != ' ') {
				s = s + c;

			} else {
				System.out.print(Character.toUpperCase(s.charAt(0)) + ". ");
				s = "";
			}
     
		}
		for(int i=0;i<s.length();i++) {
			if(i==0)
			System.out.print(s.toUpperCase().charAt(0));
			else
			System.out.print(s.toLowerCase().charAt(i));
		}
		
	}

}
