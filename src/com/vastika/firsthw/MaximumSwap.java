package com.vastika.firsthw;

public class MaximumSwap {
	static void swap(int[] s) {
		int i = 0;
		int count = 0;
		int temp;
		int n = s.length;
		while (i < n) {
			if (s[i] != i + 1) {//5!=1,1=1,s1!=2
				temp = s[i]; //temp =5,temp=4
				s[i] = s[temp - 1]; //s0 =1,s1=3
				s[temp - 1] = temp;//s4=5,s3=4
				count++;
			} 
			else {
				i++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		int[] num = { 5, 4, 2, 3, 1 };
		swap(num);

	}

	

}
