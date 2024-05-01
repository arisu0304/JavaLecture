package test;

import java.util.Random;

public class Snowfall {
    public static void main(String[] args) {
        int width = 40; // 출력할 영역의 너비
        int height = 30; // 출력할 영역의 높이
        
        // 눈이 내리는 영역을 표현하기 위한 배열
        char[][] snowArea = new char[height][width];
        
        // 초기화: 모든 셀을 공백으로 설정
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                snowArea[i][j] = ' ';
            }
        }
        
        Random random = new Random();
        
        // 시뮬레이션 시작
        while (true) {
            // 눈 생성
            int x = random.nextInt(width);
            snowArea[0][x] = '*';
            
            // 눈이 아래로 이동
            for (int i = height - 1; i > 0; i--) {
                snowArea[i] = snowArea[i - 1];
            }
            
            // 새로운 빈 줄 생성
            snowArea[0] = new char[width];
            for (int j = 0; j < width; j++) {
                snowArea[0][j] = ' ';
            }
            
            // 화면 출력
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    System.out.print(snowArea[i][j]);
                }
                System.out.println();
            }
            
            // 잠시 멈춤 (0.5초)
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            // 콘솔을 지우고 다시 위로 올리기 (화면 지우기)
              System.out.print("\033[H\033[2J");
              System.out.flush();
        }
    }
}

