package chap18_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class _10_HashMapEx_myself {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Integer> intList2 = 
				new ArrayList<>();
		
		for(int i = 0; i < 6; i++) {
			System.out.print("정수를 입력하세요.");
			intList2.add(sc.nextInt());
		}
		
		List<Integer> sumList = new ArrayList<>();
		
		Map<String, Integer> intMap = new HashMap<>();
		
		for(int i = 0; i < intList2.size(); i++) {
			for(int j = i + 1; j < intList2.size(); j++) {
				if(j != i) {
					sumList.add(intList2.get(i) + intList2.get(j));
				}
			}
		}
		
		for(int i = 0; i < sumList.size(); i++) {
			int sumCnt = 1;
			
			for(int j = 0; j < sumList.size(); j++) {
				if(i != j) {
					if(sumList.get(i) == sumList.get(j)) {
						sumCnt++;
					} 
				}
			}
			intMap.put(String.valueOf(sumList.get(i)), sumCnt);
		}
		
		System.out.println(intMap);
		
//		int sum = 0;
//		
//		for(Integer i : intMap.values()) {
//			if(i == 1) {
//				sum++;
//			}
//		}
		
		int sum2 = 0;
		
		for(Entry<String, Integer> entry : intMap.entrySet()) {
			if(entry.getValue() == 1) {
				System.out.println(entry.getKey());
				sum2++;
			}
		}
		
	//	System.out.println(sum2);
		
	}
}
