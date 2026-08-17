package Arrays;

public class minMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {5,3,7,8,1,9,10,-5};
		int min=numbers[0];
		int max=numbers[0];
		
		for(int i=0;i<numbers.length;i++) {
//			if(numbers[i]<min) {
//				min=numbers[i];
//			}
//			if(numbers[i]>max) {
//				max=numbers[i];
//			}
			
			if(numbers[i]<min) {
				min=numbers[i];
			}else if(numbers[i]>max) {
				max=numbers[i];
			}
		}
		
		
		// for each 
//		for(int n:numbers) {
//			if(n<min) {
//				min=n;
//			}
//			if(n>max) {
//				max=n;
//			}
//	}
		System.out.println("minimum value:"+min);
		System.out.println("maximum value:"+max);
	}

}
