package Arrays;

public class sumAvgMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks= {99,90,78,98,100,75};
		
		double sum=0;
		double avg=0;
		
		for(int i=0;i<marks.length;i++) {
			sum=sum+marks[i];
		}
		
//		for(int m:marks) {
//			sum=sum+m;
//		}
		avg=sum/marks.length;
		System.out.println("sum of total marks:"+sum);
		System.out.println("average marks of total:"+avg);
	}

}
