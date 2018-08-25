package CricketGame;

import java.util.Random;
import java.util.Scanner;

public class CricketGame {
	
	//Static Variables
	static Scanner sc = new Scanner(System.in);
	static Random rand = new Random();
	
	static int team;
	static String choice;
	
	static String yourTeam;
	static String oppositeTeam;
	static String batBall;
	
	
	static int playerNo=1;
	static int bowlerNo=1;
	
	static int ballNo=1,score=0,totalScore=0,over=0,flag =0,wicket=0,maxOver=2,teamOneScore=0, teamTwoScore=0;
	

	//Main Class
	public static void main(String[] args) 
	{
		System.out.println("Let's play 2 Overs cricket match India vs England");
		System.out.println("---------------------");
		
		//Pick Team
		System.out.println("Pick Team 1.India 2.England");
		team = sc.nextInt();
		pickTeam(team);
		
		//Toss method calling inside from pickTeam Method
		//scoreBoar Method calling inside from toss Method
		//over Method called inside scoreBoard Method
	}
	public static void pickTeam(int team)
	{

		if(team == 1) 
		{
			yourTeam="India";
			System.out.println("Selected team : " + yourTeam );
			toss(yourTeam);
		}
			
		else if(team == 2)
		{
			yourTeam="England";
			System.out.println("Selected team : " + yourTeam );
			toss(yourTeam);
		}
	}
	
	//Toss 
	/* Tail then opposite team batting
	 * Head then you have choice 1.Batting 2.Fielding
	 * if you are batting show score card
	 * if you are fielding show oppositeTeam scoreCard
	 * 
	 * 
	 */
	public static void toss(String selectedTeam) 
	{
		String toss[] = {"Head", "Tail"};
		choice = toss[rand.nextInt(toss.length)]; //Randomly select every time
		
		System.out.println("You got:"  + choice);
		
		//Switch Team if you loss toss or you selected fieling
		if(selectedTeam.equals("India"))
		{
			oppositeTeam = "England";
		}
		else oppositeTeam ="India";
		
		//Tail then opposite team Batting else Head then you have choice 1.Batting 2.Fielding
		if(choice.equals("Tail"))
		{
			System.out.println(selectedTeam + " team loss the toss " + oppositeTeam + " is Batting");
			batBall = "Fielding";
			scoreBoard(batBall);
			
		}
		else
		{
			System.out.println(selectedTeam + " won the toss \nplease choose from following 1.Batting 2.Fielding");
		
			int select = sc.nextInt();
			
			if(select == 1) 
			{
				batBall="Batting";
				System.out.println( selectedTeam + " selected : " + batBall);
				scoreBoard(batBall);
				
			}
			else 
			{
				batBall = "Fielding";
				System.out.println(selectedTeam + " selected: " + batBall);
				scoreBoard(batBall);
			}
			
		}

	}//end of toss class
	
	//scoreBoard Method
	/*
	 *1.Show scoreBoard Beginning of Game
	 *2.Show scoreBoard at the End of each Over
	 * 
	 */
	public static void scoreBoard(String selection)
	{
		//Wicket Criteria
		if(totalScore > 35)
		{
			wicket++;
		}
		else if(totalScore > 35)
		{
			wicket++;
		}
		else if(totalScore > 45)
		{
			wicket++;
		}
		else if(totalScore > 55)
		{
			wicket++;
		}
		
		System.out.println("\t\t*****************");
		if(selection.equals("Batting"))
		{
			System.out.println("\t\t*  ScoreBoard\t*" + "\n" + "\t\t*  " + yourTeam + ":" +totalScore +"/" + wicket + "\t*");
			System.out.println("\t\t*****************");
			
			sc.nextLine();
			
			
		}
		else
		{
			System.out.println("\t\t*  ScoreBoard\t*" + "\n" + "\t\t*  " + oppositeTeam +":" + totalScore + "/" + wicket + "\t*");
			System.out.println("\t\t*****************");
			
	
			sc.nextLine();
			
			
		}
		over();
	}//end of scoreBoard Method
	
	//play Method
	/* 
	 * 1)How Many Overs you want to keep in your game
	 * 2)Stop Over after 6 ball and do same thing for another over
	 * 3)Show scoreBoard after each over
	 * 
	 */
	public static void over()
	{
		System.out.println("Press Enter to start Game");
		sc.nextLine();
			
		System.out.println("Game Started");
		
		GAME:
		if(over < 2 )
		{
			ballNo = 1;
			
			for(int i=1; i<=6; i++)
			{
				System.out.println("ball No: " + ballNo );
				ballNo++;
				
				score = rand.nextInt(6) + 1 ;
				System.out.println("Scored " + score);
				
				totalScore += score;
				
				
				System.out.println("Press Enter For Next Ball");
				sc.nextLine(); 
				
				
			}
			over++;
			scoreBoard(batBall);
			
		}
		
		else
		{
			teamOneScore = totalScore;
			System.out.println("TEAM1 TOTALSCORE : " + totalScore);  
			secondIning();
		}
		
		
	}
	public static void secondIning() 
	{
		over=0; totalScore = 0 ; ballNo=1 ;score = 0 ; wicket=0;
		
		System.out.println("Second ining Startted BOOM BOOM");
		
		
		while(over < 2)
		{
			ballNo=1;
			for(int i=1; i<=6; i++)
			{
				System.out.println("ball No: " + ballNo );
				ballNo++;
				
				score = rand.nextInt(6) + 1 ;
				System.out.println("Scored " + score);
				
				totalScore += score;
				
				
				System.out.println("Press Enter For Next Ball");
				sc.nextLine(); 
				
				if(totalScore > teamOneScore) break;
				
				
			}
			if(batBall.equals("Fielding"))
			{
				
				System.out.println("\t\t*****************");
				System.out.println("\t\t*  ScoreBoard\t*" + "\n" + "\t\t*  " + yourTeam + ":" +totalScore +"/" + wicket + "\t*");
				System.out.println("\t\t*****************");
				
			}
			else if(batBall.equals("Batting"))
			{
				yourTeam = oppositeTeam;
				System.out.println("\t\t*****************");
				System.out.println("\t\t*  ScoreBoard\t*" + "\n" + "\t\t*  " + yourTeam + ":" +totalScore +"/" + wicket + "\t*");
				System.out.println("\t\t*****************");
			}
			over++;
			
		}
		
		teamTwoScore = totalScore;
		
		if(batBall.equals("Fielding"))
		{
			System.out.println( oppositeTeam + "TEAM1 TOTALSCORE :" + teamOneScore);
			System.out.println( yourTeam+  "TEAM2 TOTALSCORE :" + teamTwoScore);
		}
		else
		{
			yourTeam = oppositeTeam;
			System.out.println( yourTeam + " TEAM1 TOTALSCORE :" + teamOneScore);
			System.out.println( oppositeTeam+  " TEAM2 TOTALSCORE :" + teamTwoScore);
		}
		
			
		
		if(teamOneScore > teamTwoScore)
		{
			System.out.println("CONGO " + oppositeTeam + " WON THE MACTH" );
		}
		else System.out.println(" CONGO " + yourTeam + " WON THE MATCH");
		
		
		
		
	}
	
	

}//end CricketGame Class
