package Arrays;

import java.lang.*;

public class positiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {1,-2,-5,4,5,0,0,7};
		int[] pos=new int[4];
		int[] neg=new int[4];
		int[] zero=new int[2];
		
		int p=0;
		int n=0;
		int z=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]>0){ 
				pos[p]=num[i];
				p++;
			}else if(num[i]<0) {
				neg[n]=num[i];
				n++;
			}else {
				zero[z]=num[i];
				z++;
			}
			}
//		System.out.println("positive values:");
//		for(int i=0;i<p;i++) {
//			System.out.println(pos[i]);
//		}
//		System.out.println("negative values:");
//		for(int i=0;i<n;i++) {
//			System.out.println(neg[i]);
//		}
//		System.out.println("zero values:");
//		for(int i=0;i<z;i++) {
//			System.out.println(zero[i]);
//		}
		}
	}


