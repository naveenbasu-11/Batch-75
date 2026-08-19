package twoDArrays;

public class innerfor {

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
		
		num[2][0]=10;
		num[2][1]=20;
		num[2][2]=30;
		num[2][3]=40;
		num[2][4]=50;
		
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}

	}

}
