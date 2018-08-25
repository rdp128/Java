package CricketGame;

import java.util.Random;
import java.util.Scanner;

public class Test {

	static int ballNo=1,score=0,totalScore=0,over=0,flag =0,wicket=0;
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Press Enter To Continue");
		sc.nextLine();
		
			for(int i=1; i<=6; i++)
			{
				System.out.println(" ball No: " + ballNo );
				ballNo++;
				
				score = rand.nextInt(6) + 1 ;
				System.out.println(" Scored " + score);
				
				totalScore += score;
				
				System.out.println("Press Enter For Next Ball");
				
			}
			
	
		flag = 1;
	
		System.out.println("Over 1 Finished");
		System.out.println("----------------");
		System.out.println("ScoreBoard");
		
		System.out.println("TotalScore: " + totalScore +":" + wicket);
		
		System.out.println("----------------");
		
		System.out.println("Press Enter To Continue");
		sc.nextLine();
		
		if(flag == 1)
		{
			
			/*ballNo = 1;
			for(int i=1; i<=6; i++)
			{
				System.out.println(" ball No: " + ballNo );
				ballNo++;
				
				score = rand.nextInt(6) + 1 ;
				System.out.println(" Scored " + score);
				
				totalScore += score;
				
				System.out.println("Press Enter For Next Ball");
				sc.nextLine();
			}*/
		}
		if(totalScore > 35)
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
		System.out.println("Inning 1 Finished");
		System.out.println("----------------");
		System.out.println("ScoreBoard");
		
		System.out.println("Team1 TotalScore: " + totalScore + ":"  +wicket);
		
		System.out.println("----------------");
		
		int teamOneScore = totalScore;
		
		//team 2 inining
		System.out.println("----------------");
		System.out.println("Second Ining going to Start");
		System.out.println("----------------");
		
		
		totalScore = 0; ballNo = 1;
		System.out.println("Press Enter To Continue");
		sc.nextLine();

			for(int i=1; i<=6; i++)
			{
				System.out.println(" ball No: " + ballNo );
				ballNo++;
				
				score = rand.nextInt(6) + 1 ;
				System.out.println(" Scored " + score);
				
				totalScore += score;
				
				System.out.println("Press Enter For Next Ball");
				sc.nextLine();
			}
			
			if(totalScore > 25)
			{
				wicket++;
			}
		flag = 1;
	
		System.out.println("Over 1 Finished");
		System.out.println("----------------");
		System.out.println("ScoreBoard");
		
		System.out.println("TotalScore: " + totalScore +":" + wicket);
		
		System.out.println("----------------");
		
		System.out.println("Press Enter To Continue");
		sc.nextLine();
		
		if(flag == 1)
		{
			ballNo = 1;
			for(int i=1; i<=6; i++)
			{
				System.out.println(" ball No: " + ballNo );
				ballNo++;
				
				score = rand.nextInt(6) + 1 ;
				System.out.println(" Scored " + score);
				
				totalScore += score;
				
				System.out.println("Press Enter For Next Ball");
				sc.nextLine();
				
				if(totalScore > teamOneScore)
				{
					break;
				}
				else continue;
				
				
			}
		}
		if(totalScore > 35)
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
		System.out.println("Inning 1 Finished");
		System.out.println("----------------");
		System.out.println("ScoreBoard");
		
		System.out.println("Team2 TotalScore: " + totalScore + ":"  +wicket);
		
		System.out.println("----------------");
		int teamTwoScore = totalScore;
		
		
		System.out.println("Team1 "+ teamOneScore);
		System.out.println("Team2 "+ teamTwoScore);
		
		if(teamOneScore > teamTwoScore)
		{
			System.out.println("CONGO team1 won ");
		}
		else System.out.println("CONGO team2 won ");
	}


}
