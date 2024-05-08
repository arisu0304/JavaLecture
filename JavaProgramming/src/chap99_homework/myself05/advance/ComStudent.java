package chap99_homework.myself05.advance;

public class ComStudent extends CommonStat implements Student {

	public ComStudent (int sno, String name) {
		this.setSno(sno);
		this.setName(name);
		this.finalExamScore = new int[100];
		this.subject = new String[100];
	}
	
	@Override
	public void saveInfo(int index, String subject, int score) {
		// TODO Auto-generated method stub
		this.subject[index] = subject;
		this.finalExamScore[index] = score;
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("이 학생은 ComStudent 입니다.");
		System.out.println("학번 : " + this.sno);
		System.out.println(" 이름 : " + this.name);
		for(int i = 0; i < this.finalExamScore.length ; i++) {
			if(this.subject[i] != null) {
				System.out.println(" 과목 : " + this.subject[i]
						+ ", 점수 : " + this.finalExamScore[i]);
			}
		}
	}

	@Override
	public double getAvg() {
		// TODO Auto-generated method stub
		double examAvg;
		int examSum = 0;
		int subjectNum = 0;;
		for(int i = 0; i < this.finalExamScore.length ; i++) {
			if(this.subject[i] != null) {
				examSum += this.finalExamScore[i];
				subjectNum ++;
			}
		}
		
		examAvg = (double)examSum / subjectNum;
		return examAvg;
	}
}
