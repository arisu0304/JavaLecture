package chap99_homework.myself03;

public class Userbook {
//	UserBook 클래스를 생성하세요.
//	basic 3번 문제에서 만든 User클래스 타입의 값을 100개 저장할 수 있는 
//	배열과 현재 배열에 위치를 저장하는 index를 필드로 생성합니다.
//	매개변수로 username과 password를 받아서 User 객체를 생성하여 
//	배열에 저장하는 메소드 saveUserInfo를 구현하세요. 이 때 User의 id는
//	index + 1로 지정합니다.
	
	User[] users = new User[100];
	int index;
	
	public void saveUserInfo(String username, String password) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setId(index + 1);
		users[index] = user;
		index++;
	}
	
}
