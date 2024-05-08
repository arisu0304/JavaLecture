package chap99_homework.myself05.advance;

public class CommonStat {
	
	//학번
	protected int sno;
	protected String name;
	protected String[] subject;
	protected int[] finalExamScore;
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getSubject() {
		return subject;
	}
	public void setSubject(String[] subject) {
		this.subject = subject;
	}
	public int[] getFinalExamScore() {
		return finalExamScore;
	}
	public void setFinalExamScore(int[] finalExamScore) {
		this.finalExamScore = finalExamScore;
	}
}
