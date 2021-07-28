package labAssignment1;

public class FibonacciNumbers {

	static void fibonacci_numbers(int number)
	{
	    int sum = 0;
	    int temp1 = 0;
	    int temp2 = 1;

	    if (number < 1){
	        return;
	    }
	        
	    for (int count=1; count<=number; count++)
	    {
	        System.out.print(temp2 + " ");
	        sum += temp2;
	        int temp = temp1 + temp2;
	        temp1 = temp2;
	        temp2 = temp;
	    }
	    System.out.println();
	    System.out.println("Average of nos is: " + (float)sum/20);
	}
	
	public static void main(String[] args) {
		fibonacci_numbers(20);
	}

}
