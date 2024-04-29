package chap04_controlstatement;

import java.util.Scanner;

public class _09_Break02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 사용자가 0을 입력하기 전까지 입력한 모든 정수의 합을 출력
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자 입력(0입력시 종료)");
			int username = sc.nextInt();
			if(username == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			for(int i=2 ; i<= username ; i++) {
				System.out.println(i + "단");
				for(int j = 1; j <= 9; j++) {
					if(j > 3) {
						break;
					}
					System.out.println(i + " * " + j + " = " + i*j);
				}
			}
		}
		
		sc.close();
	}

}

