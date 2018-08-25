package Inheritance;

public class HybridInheritance {

	public static void main(String[] args) 
	{
		Result obj = new Result();
		obj.disp();
	}

}
class Student
{
	int roll = 101, practicalMark=50;
}

class Exam extends Student 
{
	int theoryMark=100, totallMark = practicalMark + theoryMark;
}

interface Project
{
	int projectMark =200;
	void disp();
	
}



class Result extends Exam implements Project 
{
	public void disp()
	{
		System.out.println("Roll No: " + roll);
		System.out.println("Exam Marks: " + totallMark );
		System.out.println("Project Marks: " + projectMark );
	}
}