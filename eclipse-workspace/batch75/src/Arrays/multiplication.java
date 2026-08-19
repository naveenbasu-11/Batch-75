package Arrays;
import java.util.*;
public class multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1= {3,4,5,6};
		int[] a2= {3,4,5,6,4,7};;
		
		int len=0;
		if(a1.length>a2.length) {
			len=a1.length;
		}else {
			len=a2.length;
		}
		int[] c=new int[len];
		for(int i=0;i<len;i++) {
			if(a2.length<=i) {
				c[i]=a1[i];
			}else if(a1.length<=i) {
				c[i]=a2[i];
			}else {
				c[i]=a2[i]*a1[i];
			}
			
		}
		System.out.print(Arrays.toString(c));
		
	}

}
