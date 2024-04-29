package chap04_controlstatement;

public class _07_DuplicatedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 중첩 for문
		for(int i = 0; i < 5; i++) {
			for(int j = 0 ; j < 5; j++) {
				System.out.println("i: " + i + ", j: " + j);
			}
			System.out.println("i값 증가");
		}
		
		// 2. 2 ~ 9단까지 구구단 출력
		for(int k = 2 ; k <= 9 ; k++) {
			System.out.println(k + "단 시작");
			for(int l = 1; l <= 9 ; l++) {
				System.out.println(k + "*" + l + "=" + (k*l));
			}
			System.out.println(k + "단 끝");
		}
		
		System.out.println("----------------");
		
		// 3.
		// *****
		// *****
		// *****
		// *****
		// *****
		// 위 모양대로 출력할 수 있는 중첩 for문을 작성하세요.
		
		for(int i = 0 ; i < 5; i++) {
			for(int j = 0; j < 5 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("----------------");
		
		// 4. AB + BA = 99 를 만족하는 A. B 값을 모두 출력하는 중첩 for문을 작성하세요.
		// 단, A, B는 0~9까지의 정수
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				/*
				 * if((10*i+j)+(10*j+i) == 99) { System.out.println("A = " + i + ", B = " + j);
				 * // System.out.println("" + i + j + " + " + j + i + " = 99"); }
				 */
				
				int numAB = i * 10 + j;
				int numBA = j * 10 + i;
				
				if(numAB + numBA == 99) {
					System.out.println("A = " + i + ", B = " + j);
				}
				
			}
		}
		
	}
	
}