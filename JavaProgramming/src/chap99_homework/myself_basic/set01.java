package chap99_homework.myself_basic;

import java.util.Scanner;

public class set01 {
	public static void main (String args[]) {
		//	--------------------변수--------------------

		
//		1. 사용자가 입력한 이름, 나이, 성별을 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름, 나이, 성별을 입력하세요");
		
		String name = sc.nextLine();
		
		int age = sc.nextInt();
		sc.nextLine();
		
		String sex = sc.nextLine();
		
		System.out.println("입력하신 내용은  이름 : " + name + "나이 : " + age + "성별 : " + sex);
	

//		2. 사용자가 입력한 두 개의 정수와 문자(char) 연산자를 받아 두 정수로 해당 연산을 진행한 결과를 출력하세요.
		
		System.out.println("숫자 두개와 연산자(+, -, *, / , %)");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.nextLine();
		
		char operator = sc.nextLine().charAt(0);
		
		switch(operator) {
			case('+') : System.out.println(num1 + num2);
						break;
			case('-') : System.out.println(num1 - num2);
						break;
			case('*') : System.out.println(num1 * num2);
						break;
			case('%') : System.out.println(num1 % num2);
						break;
			case('/') : if(num2 != 0) System.out.println(num1 + num2);
						else System.out.println("분모가 0입니다."); 
						break;
			default : System.out.println("정확한 연산자를 입력해주세요.");
		}
		
//		3. 반지름이 20인 원의 넓이와 둘레를 출력하세요.(넓이 : 2 * 3.14 * 반지름 ^ 2, 둘레 : 4 * 3.14 * 반지름)
//	    단, 원주율 3.14는 상수로 선언하세요.
		
		final double PI = 3.14;
		
		System.out.println("반지름이 20인 원의 넓이 : " + 2 * PI * 20 * 20);
		
		System.out.println("반지름이 20인 원의 둘레 : " + 2 * PI * 20);
		
//		4. 사용자가 입력한 5개의 정수의 합계와 평균을 출력하세요.
		
		int sum = 0;
		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("정수를 입력하세요.");
			sum += sc.nextInt();
		}
		sc.nextLine();
		
		System.out.println("입력하신 5개 정수의 합 : " + sum + " 평균 : " + (double) sum / 5);
		
//		5. 사용자가 입력한 세 정수의 최소 값, 중간 값, 최대 값을 출력하세요.

		int[] numArr = new int[3];

		for(int i = 0; i < 3 ; i++){
			System.out.println("정수를 입력하세요.");
			numArr[i] = sc.nextInt();
			sc.nextLine();
		}

		for(int i = 0 ; i < 3 ; i++){
			for(int j = i+1 ; j < 3 ; j++){
				if(numArr[i] > numArr[j]){
					int temp = numArr[i];
					numArr[i] = numArr[j];
					numArr[j] = temp;
				}
			}
		}
		
		System.out.println("최소값은 " + numArr[0]);
		System.out.println("중간값은 " + numArr[1]);
		System.out.println("최대값은 " + numArr[2]);

	//	6. 사용자가 입력한 정수의 구구단을 출력하세요.(출력 양식 => 2를 입력했을 때 2 * 1 = 2
	//												  2 * 2 = 4
	//												  .....
	//												  2 * 9 = 18

		System.out.println("정수를 입력하세요.");

		int gugu = sc.nextInt();
		sc.nextLine();

		for(int i = 1 ; i <= 9 ; i++){
			System.out.println(gugu + " * " + i + " = " + i * gugu);
		}

	//	7. 사용자가 입력한 정수로 해당 정수의 팩토리얼을 계산하여 출력하세요.(재귀메소드 없이, while이나 for 반복문을 사용)
		System.out.println("정수를 입력하세요.");

		int num10 = sc.nextInt();
		int factoNum = 1;

		for(int i = 1 ; i < num10 + 1 ; i++){
			factoNum *= i;
		}

		System.out.println(num10 + "의 계승은 " + factoNum + "입니다. ");

	//
	//	8. 사용자가 입력한 10개의 정수 중 소수의 개수를 출력하세요.(소수는 1이랑 본인 말고는 나눠떨어지는 값이 없는 수입니다.)
	//	   사용자가 입력할 수 있는 값은 2 ~ 30로 제한

		int cnt = 0;

		for(int i = 0 ; i < 10; i++){
			System.out.println("정수를 입력하세요.");
			int n = sc.nextInt();
			if(n<2 || n > 30) {
				System.out.println("2에서 30까지의 숫자만 입력하세요.");
				i--;
				continue;
			}
			if(isPrime(n)) cnt++;
		}

		System.out.println("입력하신 정수 중 소수는 " + cnt + "개 입니다.");

	}

	public static boolean isPrime(int n) {
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
