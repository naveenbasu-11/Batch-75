package Arrays;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []num=new int[3];
		num[0]=20;
		num[1]=30;
		num[2]=35;
		
		int sum=0;
		int avg=0;
		
		for(int i=0;i<num.length;i++) {
			sum=sum+num[i];
			avg=sum/num.length;
			
		}
		System.out.println(sum);
		System.out.println(avg);
//		for(int n:num) {
//			System.out.println(n);
//		}
		
	}

}
