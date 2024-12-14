package Practice;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr []= {10,20,30,40,50};// Storing the values in array
		
		// Fetching the values of array
		System.out.println("Value of 0th position--"+arr[0]);
		System.out.println("Value of 1st position--"+arr[1]);
		System.out.println("Value of 2nd position--"+arr[2]);
		System.out.println("Value of 3rd position--"+arr[3]);
		System.out.println("Value of 4th position--"+arr[4]);
		
		//Adding the values in the array
		int a[]=new int[6];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		a[5]=600;
		
		System.out.println(a[2]);
		
		// printing the values with for each loop
		System.out.println("===========for each loop===================");
		for(int i:a) {
			System.out.println(i);
		}
		
		System.out.println("===========for loop===================");
		// using for loop
		for(int k=0;k<a.length;k++) {
			System.out.println(a[k]);
		}
		
		
		// Data in string format
		System.out.println("=========Data in String format=======================");
		
		String[] VehicleComp= {"Tata","Audi","Mahindra","Hyundai","Maruti"};
		
		System.out.println(VehicleComp[1]);
		System.out.println(VehicleComp.length);
		
		VehicleComp[1]="ford";
		System.out.println(VehicleComp[1]);
		System.out.println(VehicleComp.length);
		
	}

}
