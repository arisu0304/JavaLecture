package chap99_homework.homework05;

public class PrintStudentRank {
	// 학과별 배열을 만들어주는 메소드
	public void makMajorArr(Student[] stArr, int index) {
		// 학과별로 새로운 배열 생성
		MathStudent[] mathStudentArr = new MathStudent[1000];
		EngStudent[] engStudentArr = new EngStudent[1000];
		ComStudent[] comStudentArr = new ComStudent[1000];
		
		
		// 성적순으로 출력
		printRankArray(mathStudentArr, engStudentArr, comStudentArr);
	}
	
	// 학과별 배열을 성적순대로 정렬하고 출력하는 메소드
	public void majorRank(Student[] stArr, String major) {
		
		
		
		
	}	
	
	// 학과별 배열을 모두 받아서 majorRank로 전달하는 메소드
	public void printRankArray(MathStudent[] mathStudentArr,
			EngStudent[] engStudentArr, ComStudent[] comStudentArr) {
		majorRank(mathStudentArr, "수학");
		majorRank(engStudentArr, "영어");
		majorRank(comStudentArr, "컴공");
	}
	
}