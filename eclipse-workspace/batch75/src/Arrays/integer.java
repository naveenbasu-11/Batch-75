package Arrays;

public class integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ages=new int[4];
		ages[0]=21;
		ages[1]=22;
		ages[2]=25;
		ages[3]=26;
		
		for(int age:ages) {
			if(age>22) {
			System.out.println(age);
			}
		}
	}

}
