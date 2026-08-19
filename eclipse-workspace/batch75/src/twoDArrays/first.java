package twoDArrays;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] num=new int[4][5];
		
		num[0][0]=10;
		num[0][1]=20;
		num[0][2]=30;
		num[0][3]=40;
		num[0][4]=50;
		
		num[1][0]=50;
		num[1][1]=60;
		num[1][2]=70;
		num[1][3]=80;
		num[1][4]=90;
		
		for(int[] n1:num) {
			for(int n:n1) {
				System.out.print(n+" ");
			}
			System.out.println();
		}
		
	}

}
