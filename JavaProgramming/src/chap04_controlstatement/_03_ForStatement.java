package chap04_controlstatement;

public class _03_ForStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 1~100까지의 합
		int sum = 0;
		
		int i;
		for(i = 1; i<=100; i++) {
			sum += i;
		}
		System.out.println("1~100까지의 합 : " + sum);
		System.out.println("마지막 i의 값 : " + i);
		System.out.println("---------------");
		
		
		// 2. 1~100까지 정수 중 2와 3의 공배수만 출력
		for(int n=1 ; n<=100 ; n++) {
			if(n % 2 == 0 && n % 3 ==0) {
				System.out.println(n);
			}
		}
		System.out.println("---------------");
		
		// 3. 정수 312의 모든 약수를 출력하는 for문을 작성
		int num = 312;
		for(int j = 1; j<=num ; j++) {
			if(num % j == 0) {
				System.out.println(j);
			}
		}
		System.out.println("---------------");
		
		// 4. for문 변형
		int l = 1;
		sum = 0;
		
		//무한 반복되는 for문의 형태
		//break문을 이용해서 특정 조건이 됐을 때 for문을 종료시킨다
		for( ; ; ) {
			sum += l++;
			if(l > 1000) {
				break;
			}
		}
		System.out.println("1~1000까지의 합 : " + sum);
		
	}

}
