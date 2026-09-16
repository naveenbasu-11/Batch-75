package polymorphism;

  class Assesments{
	  //Assessement 1,2,3,4
	  
	  void add(int english1,int english2,int english3,double english4) {
		  System.out.println("----English Marks----");
		  System.out.println(english1+english2+english3+english4);
	  }
	  void add(int science1,int science2,int science3,int science4) {
		  System.out.println("-----Science marks-----");
		  System.out.println(science1+science2+science3+science4);
	  }
	  void add(double social1,double social2,double social3,double social4) {
		  System.out.println("----Social marks----");
		  System.out.println(social1+social2+social3+social4);
	  }
	
  }

public class overloading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assesments a=new Assesments();
		a.add(19, 20, 18, 19.0);
		a.add(18, 17, 19, 19);
		a.add(18.0, 19.0, 16.0, 15.0);
	}

}
