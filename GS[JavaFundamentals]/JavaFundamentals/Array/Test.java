package Array;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Test {
	
	static Scanner sc = new Scanner(System.in);
	static Random rand = new Random();
	
	static int team;
	static String choice;
	
	static String yourTeam;
	static String oppositeTeam;
	static String batBall;
	
	
	static int playerNo=1;
	static int bowlerNo=1;
	
	static int ballNo=1,score=0,totalScore=0,over=0,flag =0,wicket=0;
	
	//Main Class
	public static void main(String[] args)  
	{
		
		
		System.out.println("Let's play 2 Overs cricket match India vs England");
		System.out.println("---------------------");
		
		System.out.println("Pick Team 1.India 2.England");
		
		team = sc.nextInt();
		
		
		if(team == 1) 
		{
			yourTeam="India";
			System.out.println("Selected team : " + yourTeam );
		}
			
		else if(team == 2)
		{
			yourTeam="England";
			System.out.println("Selected team : " + yourTeam );
		}
		
		System.out.println("---------------------");
		System.out.println("*****Toss Time*****");
		
		//calling Toss Method
		toss();
		
		System.out.println("---------------------");
		//overs();
		//scoreBoard();
		
	}
	
	//Toss Method after toss show scoreBoard At the beginning of match start 
	public static void toss() 
	{
		
		String toss[] = {"Head", "Tail"};
		choice = toss[rand.nextInt(toss.length)];
		
		System.out.println("You got:"  + choice);
		
		int flag = 0 ;
		
		if(yourTeam.equals("India"))
		{
			oppositeTeam = "England";
		}
		else oppositeTeam ="India";
		
		if(choice.equals("Tail"))
		{
			System.out.println(yourTeam + " team loss the toss " + oppositeTeam + " is Batting");
			batBall = "Fielding";
			
			//calling scoreBorad Method
			scoreBoard();
		}
		else
		{
			System.out.println(yourTeam + " won the toss \nplease choose from following 1.Batting 2.Fielding");
			flag=1;
		}
		
		
		if(flag == 1 )
		{
			int select = sc.nextInt();
		
			if(select == 1) 
			{
				batBall="Batting";
				System.out.println( yourTeam + " selected : " + batBall);
				
				//calling scoreBorad Method
				scoreBoard();
				
			}
			else 
			{
				batBall = "Fielding";
				System.out.println(yourTeam + " selected: " + batBall);
				
				//calling scoreBorad Method
				scoreBoard();
				
			}
		}
		
		
			
	}
	
	//ScoreBoard Method
	public static void scoreBoard() 
	{
		
		System.out.println("\t\t*****************");
		if(batBall.equals("Batting"))
		{
			
			System.out.println("\t\t*  ScoreBoard\t*" + "\n" + "\t\t*  1" + yourTeam + ":" +totalScore +"/" + wicket + "\t*");
			System.out.println("\t\t*****************");
			
			sc.nextLine();
			overs();
			
			
		}
		else 
			{
			System.out.println("\t\t*  ScoreBoard\t*" + "\n" + "\t\t*  " + oppositeTeam +":" + totalScore + "/" + wicket + "\t*");
			System.out.println("\t\t*****************");
			
			sc.nextLine();
			overs();
			
			}
		
		
	}
	
	//Over Method
	public static void overs() 
	{
		System.out.println("Press Enter To Continue");
		sc.nextLine();
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
		flag = 1;
		over++;
		
		
		if(flag == 1 && over < 2)
		{
			ballNo = 1;
			
			System.out.println( "*****Over : " + over + " Finished****");
			scoreBoard(); // scoreboard for 1st over
			
			
			System.out.println("Press Enter To Continue");
			sc.nextLine();
		}
		
		
		
	}
	
	public static void play() 
	{
		
		
		
	}
}
