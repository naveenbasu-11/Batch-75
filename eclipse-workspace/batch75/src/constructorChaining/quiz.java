package constructorChaining;

public class quiz {
	String subject;
	int totalQuestions;
	int Timelimit;
	
	 quiz(){
		 this("english");
	 }
	 
	 quiz(String subject){
		 this("social",22);
		 System.out.println("Subject:"+subject);
		 System.out.println("--------------------------");
		 
	 }
	 quiz(String subject,int totalQuestions){
		 this("maths",20,20);
		 System.out.println("subject:"+subject);
		 System.out.println("total questions:"+totalQuestions);
		 System.out.println("--------------------------");
		 
	 }
	 
	 quiz(String subject,int totalQuestions,int Timelimit){
		 this.subject=subject;
		 this.totalQuestions=totalQuestions;
		 this.Timelimit=Timelimit;
	 }
	 void show() {
		 System.out.println("Subject:"+subject);
		 System.out.println("Number of Questions:"+totalQuestions);
		 System.out.println("Time Limit:"+Timelimit);
	 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		quiz q=new quiz();
		q.show();
		
	}

}
