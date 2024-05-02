package test;

class MyThread extends Thread {
    public static int val =0;
    public void run() {
        while(val < 100)
        {
        	System.out.println(val);
        	val++;
        }
    }
}

public class adsadsasad {

	    public static void main(String[] args) {
	        MyThread thread = new MyThread();
	        thread.start(); // 새로운 스레드 시작
	        thread = new MyThread();
	        thread.start(); // 새로운 스레드 시작

	        for (int i = 0; i < 5; i++) {
	            System.out.println("Main: " + i);
	            try {
	                Thread.sleep(10); // 1초 대기
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }
}
