package Constructors;


// -------PARAMETERIZED CONSTRUCTOR USING WITH USER INPUT SCANNER CLASS-------
import java.util.Scanner;
public class CricketPlayer {
	static String playerName;
	static int MatchesPlayed;
	int totalRuns;
	
	CricketPlayer(String Name,int Played,int Runs){
		playerName=Name;
		MatchesPlayed=Played;
		totalRuns=Runs;
		show();
	}
	
	void show() {
		System.out.println("Player Name:"+playerName);
		System.out.println("Matches Played:"+MatchesPlayed);
		System.out.println("Total Runs:"+totalRuns);
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String PlayerName=sc.nextLine();
		
		int MatchesPlayed=sc.nextInt();
	
		int totalruns=sc.nextInt();
		
		CricketPlayer cri=new CricketPlayer(PlayerName,MatchesPlayed,totalruns);
		
	}

}
