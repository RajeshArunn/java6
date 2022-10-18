package newpackage3;
import java.util.Scanner;
public class NewMain6
{
public static void main(String args[]) throws ScoreException
{
Scanner sc = new Scanner(System.in);
int studentId[] = { 1201, 1202, 1203, 1204, 1205 };
int scores[] = new int[5];
int score;
for(int i = 0; i < studentId.length; i++)
{
try
{
System.out.print("Enter a numeric test score for the student"+(i+1)+" of Id "+studentId[i]+" : ");
score = sc.nextInt();
if(score < 0 || score > 100)
{
scores[i] = 0;
throw new ScoreException("Input should be between 1 and 100");
}
else
{
scores[i] = score;
}
}
catch(ScoreException ex)
{
System.out.println("\n"+ex.getMessage()+"\n");
}
}
System.out.println("\n\nStudent Id \t Score ");
System.out.println("=============================");
for(int i = 0; i < studentId.length; i++)
{
System.out.println(studentId[i]+"\t\t"+scores[i]);
}
}
}
class ScoreException extends Exception
{
ScoreException(String msg)
{
super(msg);
}
}
