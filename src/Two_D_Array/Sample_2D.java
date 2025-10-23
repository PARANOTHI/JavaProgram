package Two_D_Array;
import java.util.*;

public class Sample_2D {
		public static void main(String[] args) {

			int arr[]= {1,2,3,4,5};

			System.out.println(Arrays.toString(arr));

						//row   0           1          2

			           //col   0 1 2 3   0 1 2 3   0  1  2  3

			int arr2d [] []= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

			System.out.println("By using For loop");

			for(int row=0;row<arr2d.length;row++) {

				for(int col=0;col<arr2d[row].length;col++) {

					System.out.print(arr2d[row][col]+" ");

				}

				System.out.println();

			}

			System.out.println("By using foe each loop");

			for(int [] a:arr2d) {

				for(int num:a) {

					System.out.print(num+" ");

				}

				System.out.println();

			}




		}
	}



