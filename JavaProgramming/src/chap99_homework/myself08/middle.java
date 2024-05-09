package chap99_homework.myself08;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 사용자가 입력한 날짜(yyyy-MM-dd 형식으로 입력받음)에 add 메소드로 3일뒤로 변경하고
//	     yyyy-MM-dd 형식으로 출력하세요. (SimpleDateFormat 클래스 사용. SimpleDateFormat의
//	     parse() 메소드를 이용하면 String -> Calendar로 변환가능)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("날짜(yyyy-MM-dd 형식)를 입력하세요.");
		
		String day = sc.nextLine();
		
		Calendar calendar = Calendar.getInstance();
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			calendar.setTime(simpleDateFormat.parse(day));
		}catch(Exception e) {
			System.out.println(" 에러 발생 ");
		}
		
		calendar.add(Calendar.DATE, 3);
		
		Date date = new Date(calendar.getTimeInMillis());
		
		System.out.println(simpleDateFormat.format(date));
		
		System.out.println("----------------------");

		
//	2. 길이가 8이며 한글로 된 요일이 저장되어 있는 요일 배열을 만들고
//	   사용자가 입력한 날짜(yyyy-MM-dd 형식으로 입력받음)의 요일을 한글로 출력하세요.
		
		String[] dayArr = {"", "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
		
		System.out.println("날짜를 입력하세요.");
		
		String day2 = sc.nextLine();
		
		Calendar calendar3 = Calendar.getInstance();
		
		try {
			calendar3.setTime(simpleDateFormat.parse(day));
		}catch(Exception e) {
			System.out.println(" 에러 발생 ");
		}
		
		System.out.println(dayArr[calendar3.get(Calendar.DAY_OF_WEEK)]);
		
		System.out.println("----------------------");
		
//	3. 두 개의 날짜 데이터 2023-03-15 20:31:45와 2021-07-08 11:58:04의 차이를
//	     시 분 초 형태로 나타내시오.
		Calendar calendar1 = Calendar.getInstance();
		Calendar calendar2 = Calendar.getInstance();
		
		calendar1.set(2024, 2, 15, 20, 31, 45);
		calendar2.set(2021, 6, 8, 11, 58, 5);
		
		long diff = calendar1.getTimeInMillis() - calendar2.getTimeInMillis();
	
		System.out.println("calendar2부터 calendar1까지 " + (diff / 1000 / 60 / 60) + "시간이 지났습니다.");
		System.out.println("calendar2부터 calendar1까지 " + (diff / 1000 / 60) + "분이 지났습니다.");
		System.out.println("calendar2부터 calendar1까지 " + (diff / 1000) + "초가 지났습니다.");
	
	}

}
