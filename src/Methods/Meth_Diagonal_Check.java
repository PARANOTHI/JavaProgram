package Methods;

public class Meth_Diagonal_Check {
	boolean diagonalChecker(int arr[][]) {
		for(int r=0;r<arr.length;r++) {
			for(int c=0;c<arr[0].length;c++) {
				if((r==c && arr[r][c]!=1) || (r!=c && arr[r][c]!=0)) {
					return false;
				}
				
			}
			
		}
		return true;
		
	}

	public static void main(String[] args) {
		int arr[][]= {{1,0,0},{0,1,0},{0,0,1}};
		int arr1[][]= {{1,0,1},{0,1,0},{0,0,1}};
		Meth_Diagonal_Check u= new Meth_Diagonal_Check();
		System.out.println((u.diagonalChecker(arr))?"Diagonal":"Not Diagonal");
		System.out.println((u.diagonalChecker(arr1))?"Diagonal":"Not Diagonal");

	}

}
