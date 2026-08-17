package Arrays;

public class first {

	public static void main(string[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[5];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("-------------------");
		for(int i=0;i<a.length;i++) {
		if(a[i]>3) {
				System.out.println(a[i]);
			}
		}
		
	}

}
