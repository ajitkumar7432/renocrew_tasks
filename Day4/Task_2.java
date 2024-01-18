import java.util.Scanner;
import java.util.Random;

public class Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("Enter the choice (rock,paper,scizzor) : ");
        String userinput = sc.nextLine();
        String []computer = {"rock","paper","scizzor"};
        String computerchoice = computer[rd.nextInt(3)];
        System.out.println("The computer chose : " + computerchoice);
        if(userinput.equals(computerchoice))
        {
            System.out.println("It is tie");
        }
        else if(userinput.equals("rock") && computerchoice.equals("scizzor") ||userinput.equals ( "paper") && computerchoice.equals("rock") || userinput.equals( "scizzor") && computerchoice.equals( "paper" ))
        {
            System.out.println("You Won");
        }
        else
        {
            System.out.println("Computer Won");
        }



    }
}
