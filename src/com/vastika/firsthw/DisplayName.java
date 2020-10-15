package com.vastika.firsthw;

public class DisplayName {

	public static void main(String[] args) {
		String name = "Rajendra Basnet Razu singh";
		int length = name.length();
		//name = name.trim();
		System.out.println(name);
		//System.out.print(Character.toUpperCase(name.charAt(0))+". ");
		String s = "";
		for(int i=0;i<length;i++) {
			char c = name.charAt(i);
			if(c==' ') {
				
				System.out.print(Character.toUpperCase(s.charAt(0))+". ");
				s = "";
			}
				else {
					
					s = s +c;
				}
			
		}
		System.out.println(s);
		
		
		
	}

}
