package chap99_homework.homework04;

import chap99_homework.homework04.ArrayUtility2;

public class useof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s1 = {2,2,2,3,4,4,5};
		int[] s2 = {2,4};
		
		int[] s3 = ArrayUtility2.remove(s1, s2);
		
		// remove3은 원소들이 1000이하일 때만
		int[] s4 = ArrayUtility2.remove3(s1, s2);
		
		int[] s5 = ArrayUtility2.remove4(s1, s2);
		
		for(int i = 0; i < s3.length ; i++) {
			System.out.println(s3[i]);
		}
		System.out.println("------------");
		for(int i = 0; i < s4.length ; i++) {
			System.out.println(s4[i]);
		}
		System.out.println("------------");
		for(int i = 0; i < s5.length ; i++) {
			System.out.println(s5[i]);
		}
		
	}

}
