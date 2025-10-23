package ArrayConcepts;

public class Declaration {

	public static void main(String[] args) {
		
		String arr[]= {"Kavin","Harish","Paranjothi","Praneush"};
		int arr1[]= {1,2,3,4,5,6};
		float []arr2= {1.0f,2.5f,2.3f,5.9f,52.5f,222.5f};
//		System.out.println(arr[2]);
//		System.out.println(arr1[5]);
//		System.out.println(arr2[4]);
//		arr[1]="Thayanithi";
//		System.out.println(arr[2]);
//		System.out.println(arr1);
//		//to find the length of the array
//		System.out.println(arr2.length);
//		//to find the last index value of the array
//		System.out.println(arr[arr.length-1]);
//		//for continues check and print the namess and reverse print
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);}
		}

}
