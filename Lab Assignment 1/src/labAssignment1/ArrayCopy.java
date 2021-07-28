package labAssignment1;

public class ArrayCopy {
	
	public static int[] CopyOfFun(int[] array) {
        
    	int[] result = new int[array.length];
        
    	for(int i=0; i<array.length; i++) {
            result[i] = array[i];
        }
    	
        return result;
       
    }

	public static void main(String[] args) {

        int[] array = {1232, 21, 29, 99, 28, 75};
        int[] result = CopyOfFun(array);
        
        System.out.print("Copy of the given array is: ");
        
        for(int i : result) {
            System.out.print(i + " ");
        }
    }

}
