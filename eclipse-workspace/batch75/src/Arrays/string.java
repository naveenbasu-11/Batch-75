package Arrays;

public class string {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		String[] names=new String[5];
		names[1] ="rohit";
		names[0] ="rahul";
		names[2] ="virat";
		names[3] ="gill";
		
	//  for loop
	//	for(int i=0;i<names.length;i++) {
	//		System.out.println(names[i]);
	//	}
	// for each
		for(String name:names) {
			System.out.println(name);
		}
	}

}
