package chap16_usefulclass;

import java.util.Scanner;

public class _10_MathEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자가 5개의 정수를 입력하고 배열에 저장
		// 배열에 저장된 정수 5개 중 최대값과 최소값을 구하세요.
		// Math.max 와 Math.min 메소드 이용
		
		Scanner sc = new Scanner(System.in);
		int[] intArr = new int[5];
		
		System.out.println("숫자를 5개 입력하세요.");
		
		for(int i = 0 ; i < 5; i++) {
			intArr[i] = sc.nextInt();
		}
	
		int max = intArr[0];
		int min = intArr[0];
		
		for(int i : intArr) {
			max = Math.max(max, i);
			min = Math.min(min, i);
		}
		
		System.out.println("최대값은 " + max);
		System.out.println("최소값은 " + min);
		
		sc.close();
	}

}
