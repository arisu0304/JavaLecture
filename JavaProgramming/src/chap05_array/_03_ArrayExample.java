package chap05_array;

public class _03_ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3. chArr의 요소 중 소문자는 대문자로, 대문자는 소문자로 변환하여 
		// convertArr에 저장하세요.
		char[] chArr = {'b', 'I', 't', 'C'};
		//{'B', 'i', 'T', 'c'}
		char[] convertArr = new char[4];
		for(int i = 0 ; i < convertArr.length; i++) {
			if(chArr[i] >= 'a' && chArr[i] <= 'z') {
				//convertArr[i] = (char) (chArr[i]-32);
				convertArr[i] = Character.toUpperCase(chArr[i]);
			}else {
				//convertArr[i] = (char) (chArr[i]+32);
				convertArr[i] = Character.toLowerCase(chArr[i]);
			}
			System.out.println(convertArr[i]);
		}
		
	}

}