package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class map_set_list_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 다음은 학생들의 이름과 점수가 포함된 Map입니다. 각 학생의 평균 점수를 계산하여 출력하세요.
		
		Map<String, List<Integer>> studentScores = new HashMap<>();
        studentScores.put("Alice", Arrays.asList(85, 90, 92));
        studentScores.put("Bob", Arrays.asList(75, 80, 85));
        studentScores.put("Charlie", Arrays.asList(90, 95, 98));

        // 각 학생의 평균 점수 계산 및 출력
        for (Map.Entry<String, List<Integer>> entry : studentScores.entrySet()) {
            String studentName = entry.getKey();
            List<Integer> scores = entry.getValue();
            int total = 0;
            for (int score : scores) {
                total += score;
            }
            double average = (double) total / scores.size();
            System.out.println(studentName + "'s average score: " + average);
        }
        
        Set<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> setB = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));

        // 합집합 계산
        Set<Integer> union = new HashSet<>(setA);
        union.addAll(setB);

        // 결과 출력
        System.out.println("Union of setA and setB: " + union);
        
        List<String> cities = Arrays.asList("New York", "Paris", "Tokyo", "London", "Seoul");

        // 길이 기준 오름차순 정렬
        Collections.sort(cities, Comparator.comparingInt(String::length));

        // 결과 출력
        System.out.println("Cities sorted by length: " + cities);
        
	}

}
