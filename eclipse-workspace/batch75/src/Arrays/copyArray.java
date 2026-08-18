package Arrays;

import java.util.Arrays;

public class copyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1= {1,2,3,4,5};
		int[] a2= {6,7,8,9,10,11};
		
		int[] a3=new int[a1.length+a2.length];
		
		for(int i=0;i<a1.length;i++) {
			a3[i]=a1[i];
		}
		for(int i=0;i<a2.length;i++) {
			a3[a1.length+i]=a2[i];
		}
		System.out.println(Arrays.toString(a3));
	}

}
