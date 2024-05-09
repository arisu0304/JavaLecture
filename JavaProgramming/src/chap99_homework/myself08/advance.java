package chap99_homework.myself08;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class advance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 2001년 12월 19일이 결혼기념일인 부부가 있다. 
//	    윤년이 있는 년도에는 결혼기념일의 날짜를 하루씩 더하기로 했다.
//	    2022년의 결혼기념일 날짜를 구하세요.
		Calendar calendar = Calendar.getInstance();
		
		calendar.set(2001, 11, 19);
		
		
		for(int i = 2002 ; i <= 2022 ; i++) {
			calendar.add(Calendar.YEAR, 1);
			if( i % 400 == 0 || (i % 4 == 0) && ( i % 100 != 0 )) {
				calendar.add(Calendar.DATE, 1);
			}
		}
		
		System.out.println(calendar.get(Calendar.YEAR) + " 년 " + 
						(calendar.get(Calendar.MONTH) + 1) + " 월 " +
						calendar.get(Calendar.DATE) + "일");
		
		System.out.println("----------------------");

//	2. 사용자가 두 개의 날짜(yyyy-MM-dd 형식)를 입력하고 입력받은
//	    두 날짜 사이의 날짜를 모두 출력하세요. (Calendar 클래스를 사용하세요).		
//	    ex) 2023-01-29 2023-02-05 입력
//		출력       2023-01-29
//	             2023-01-30
//	             2023-01-31
//	             2023-02-01
//	             2023-02-02
//	             2023-02-03
//	             2023-02-04
//	             2023-02-05

		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println("날짜를 입력하세요.");
		
		String day = sc.nextLine();
		
		Calendar calendar2 = Calendar.getInstance();
		
		try {
			calendar2.setTime(simpleDateFormat.parse(day));
		}catch(Exception e) {
			System.out.println(" 에러 발생 ");
		}
		
		System.out.println("날짜를 입력하세요.");
		
		day = sc.nextLine();
		
		Calendar calendar3 = Calendar.getInstance();
		
		try {
			calendar3.setTime(simpleDateFormat.parse(day));
		}catch(Exception e) {
			System.out.println(" 에러 발생 ");
		}
		
		while(calendar2.get(Calendar.YEAR) != calendar3.get(Calendar.YEAR)
				|| calendar2.get(Calendar.MONTH) != calendar3.get(Calendar.MONTH)
				|| calendar2.get(Calendar.DATE) != calendar3.get(Calendar.DATE)
				) {
			Date date = new Date(calendar2.getTimeInMillis());
			System.out.println(simpleDateFormat.format(date));
			calendar2.add(Calendar.DATE, 1);
		}
		Date date = new Date(calendar2.getTimeInMillis());
		System.out.println(simpleDateFormat.format(date));
		
		System.out.println("----------------------");
		
//	3. 사용자가 입력한 5개의 정수를 저장하는 List<Integer>를 생성하고
//	    연속된 두 수의 합이 가장 커지는 구간의 두 수를 출력하세요.
//	    ex) [1, 2, 3, 4, 5] => 4, 5 출력

//		System.out.println("숫자를 입력하세요.");
//		
//		List<Integer> intList = new ArrayList<>();
//		
//		for(int i = 0 ; i < 5 ; i++) {
//			intList.add(sc.nextInt());
//		}
//		
//		int idx = 0;
//		
//		for(int i = 0 ; i < 3 ; i++) {
//			if( intList.get(i) + intList.get(i+1) 
//					< intList.get(i+1) + intList.get(i+2)) {
//				idx = i+1;
//			}
//		}
//		
//		System.out.println(intList.get(idx) + ", " + intList.get(idx+1));
		
		System.out.println("----------------------");
		
		
		
//	4. 사용자가 입력한 6개의 정수를 저장하는 List<Integer>를 생성하고
//	    두 수의 합이 유일한 값이 되는 개수를 출력하세요.(중복 숫자 사용불가)
//	    ex) [1, 2, 3, 4, 5, 6] => 총 4개(3, 4, 10, 11)
		
//		System.out.println("숫자를 입력하세요.");
//		
//		List<Integer> intList2 = new ArrayList<>();
//		
//		for(int i = 0 ; i < 6 ; i++) {
//			intList2.add(sc.nextInt());
//		}
//		
//		List<Integer> intList3 = new ArrayList<>();
//		
//		for(int i = 0 ; i < 5 ; i++) {
//			for(int j = i + 1 ; j < 6 ; j++) {
//				intList3.add(intList2.get(i) + intList2.get(j));
//			}
//		}
//		
//		Collections.sort(intList3);
//		
//		boolean[] dup = new boolean[intList3.size()];
//		
//		for(int i = 0; i < intList3.size()-1  ; i++) {
//			if(intList3.get(i) == intList3.get(i+1)) {
//				dup[i] = true;
//				dup[i+1] = true;
//			}
//		}
//		
//		int cnt = 0;
//		
//		for(boolean bool : dup) {
//			if(!bool) cnt++;
//		}
//		
//		System.out.println("총 " + cnt + " 개 ");
//		
//		for(int i = 0; i < intList3.size()  ; i++) {
//			if(!dup[i]) {
//				System.out.println(intList3.get(i));
//			}
//		}

		
	}

}
