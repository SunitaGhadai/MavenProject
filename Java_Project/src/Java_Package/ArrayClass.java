package Java_Package;

public class ArrayClass {
  //Single Dimensional array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare and create an Array to store 5 integer number
		int[]numbers=new int[5];
		//step-2 initialize the array with values
		numbers[0]=10;
		numbers[1]=20;		
		numbers[2]=30;
		numbers[3]=40;
		numbers[4]=50;
		//step-3 access and print each element in array
		System.out.println("Array Elements");
		for (int i=0;i<numbers.length;i++) {
		System.out.println("Element at index"+i+":"+numbers[i]);	
	}
	//calculate and print the sum of all elements in the array
	int sum = 0;
	for (int i=0;i<numbers.length;i++) {
	sum += numbers[i];	
	}
	
		System.out.println("sum of array Elements:"+ sum);

	}
	

}
