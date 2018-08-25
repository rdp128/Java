package CricketGame;

import java.util.Random;
import java.util.Scanner;

public class Over 
{
	static int ballNo=1,score=0,totalScore=0,over=0,flag =0,wicket=0;
	
	static Scanner sc = new Scanner(System.in);
	static Random rand = new Random();
	
	public static void main(String[] args)
	{
		System.out.println("Press Enter To Continue");
		sc.nextLine();
		overs(); //1-st over
		scoreBoard(over);
		
		
		
	}
	
	public static void overs()
	{
		for(int i=1; i<=6; i++)
		{
			System.out.println(" ball No: " + ballNo );
			ballNo++;
			
			score = rand.nextInt(6) + 1 ;
			System.out.println(" Scored " + score);
			
			totalScore += score;
			
			if(ballNo > 6)
			{
				System.out.println("Over Finished");
			}
			else
			{
			System.out.println("Press Enter For Next Ball");
			sc.nextLine();
			}
			
		}
		flag = 1;
		over++;
		
		
		if(flag == 1 && over < 3)
		{
			ballNo = 1;
			
		
			System.out.println( "----Over : " + over + " Finished------");
			scoreBoard(over); // scoreboard for 1st over
			System.out.println("Press Enter To Continue");
			sc.nextLine();
			overs(); // second over
			
	
		}
		
	}
	
	public static void scoreBoard(int over)
	{
	
		if(totalScore > 25)
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
		System.out.println("****ScoreBoard****");
		System.out.println(totalScore + "/" + wicket);
	}

}
