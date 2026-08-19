package twoDArrays;

public class curly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] numbers= {{9,8,7,6},{5,4,3},{2,1},{1}};
		
		
		for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers[i].length;j++) {
				System.out.print(numbers[i][j]+" ");
			}
//		for(int[] num:numbers) {
//			for(int n:num) {
//				System.out.print(n+" ");
//			}
			System.out.println();
		}
	}

}
