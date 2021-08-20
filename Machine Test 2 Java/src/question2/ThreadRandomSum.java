package question2;

import java.util.Random;

class CalculateSum implements Runnable {
	
	int result;
	
	public CalculateSum(int result) {
		this.result = result;
	}
	
	@Override
	public void run() {
		
		Random random = new Random();
		int randomNumber = random.nextInt(10) + 1;
		
		System.out.println("Random Number generated this time is: " + randomNumber);
		result = result + randomNumber;
		
	}
	
}

public class ThreadRandomSum {
	
	public static void main(String[] args) {
		
		CalculateSum total = new CalculateSum(0);

		Thread thread1 = new Thread( total );
		Thread thread2 = new Thread( total );
		Thread thread3 = new Thread( total );
		Thread thread4 = new Thread( total );
		Thread thread5 = new Thread( total );
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		
		try {
			thread1.join();
			thread2.join();
			thread3.join();
			thread4.join();
			thread5.join();
		}
		
		catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		
		finally {
			System.out.println();
			System.out.println("Total sum of the numbers generated is: " + total.result);
		}
		
	}
	
}
