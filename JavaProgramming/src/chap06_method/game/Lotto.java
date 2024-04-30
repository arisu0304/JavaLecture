package chap06_method.game;

public class Lotto {
	// 1. 1~45까지 숫자 중 랜덤 값 7개를 저장해서 배열로 리턴하는 메소드 generateLottoArray
	// 를 구현하세요. 매개변수는 없음
	
	// 2. 정수형 배열과 int 타입의 인덱스를 매개변수로 받아서 중복체크하는 메소드
	// isDuplicated를 구현하세요. 리턴타입은 boolean
	// 중복 있으면 true, 없으면 false
	public int[] generateLottoArray () {
		int[] lotto = new int[7];
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45) + 1;
			
			if(isDuplicated(lotto, i)) {
				i--;
			}
			
		}
		return lotto;
	}
	
	public boolean isDuplicated(int[] arr, int idx ) {
		for(int i = 0 ; i < idx ; i++) {
			if(arr[idx] == arr[i]) {
				return true;
			}
		}
		return false;
	}
}
