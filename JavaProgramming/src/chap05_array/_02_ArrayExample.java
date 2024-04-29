package chap05_array;

public class _02_ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 10개의 정수를 저장하는 배열을 생성하고 3의 배수만 10개 저장
		
		int[] numArr = new int[10];
		
		/*
		 * for(int i = 0 ; i < numArr.length ; i++) { numArr[i] = 3*(i+1); }
		 */
		
		int idx = 0;
		
		while(idx < numArr.length) {
			numArr[idx] = 3 * (idx+1);
			System.out.println(numArr[idx]);
			idx++;
		}
	}

}
