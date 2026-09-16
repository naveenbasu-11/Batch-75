package polymorphism;

import java.util.Scanner;

class Student1{
    	void displayMarks() {
    		System.out.println("---------Student Info--------");
    	}
    }
    
    class Engineering extends Student1{
    	void displayMarks() {
    		Scanner sc=new Scanner(System.in);
    		System.out.println("------Engineering info------");
    		System.out.println("enter Engineering marks:");
    		int[] marks=new int[3];
    		
    		for(int i=0;i<marks.length;i++) {
    			marks[i]=sc.nextInt();
    		}
    		System.out.println("java:"+marks[0]);
    		System.out.println("Sql:"+marks[1]);
    		System.out.println("pyton:"+marks[2]);
    		
    		int total=marks[0]+marks[1]+marks[2];
    		double avg=total/3.0;
    		
    		System.out.println("Toatl marks:"+total);
    		System.out.println("Average Marks:"+avg);
    		
    	}
    }
    
    class medical extends Student{
    	void displayMarks() {
    		Scanner sc=new Scanner(System.in);
    		System.out.println("------Medical info------");
    		System.out.println("enter Medical marks:");
    		int[] marks=new int[3];
    		System.out.println("biology:"+marks[0]);
    		System.out.println("anatomy:"+marks[1]);
    		System.out.println("chemistry:"+marks[2]);
    		
    		int total=marks[0]+marks[1]+marks[2];
    		
    		double avg=total/3.0;
    		System.out.println("Toatl marks:"+total);
    		System.out.println("Average Marks:"+avg);
    	}
    }
    
    class management extends Student{
    	void displayMarks() {
    		Scanner sc=new Scanner(System.in);
    		System.out.println("------Management info------");
    		System.out.println("enter Management marks:");
    		int[] marks=new int[3];
    		System.out.println("finanace"+marks[0]);
    		System.out.println("Marketing:"+marks[1]);
    		System.out.println("HR:"+marks[2]);
    		
    		int total=marks[0]+marks[1]+marks[2];
    		
    		double avg=total/3.0;
    		System.out.println("Toatl marks:"+total);
    		System.out.println("Average Marks:"+avg);
    	}
    }
    		
public class marksOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s;
		s=new Engineering();
		s.displayMarks();
	}

}
