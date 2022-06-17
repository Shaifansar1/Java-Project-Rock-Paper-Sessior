import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;
import java.util.Random;

public class shaif_41_rock_paper_scissor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 0 for rock , 1 for paper , 2 for scissor");
        int UserInput=sc.nextInt();

        Random random=new Random();
        int ComputerInput=random.nextInt(3);

        if (UserInput==ComputerInput)
        {
            System.out.println("Draw the Game");
        }
        else
        {
            if (UserInput==0&&ComputerInput==2||UserInput==1&&ComputerInput==0
                    ||UserInput==2&&ComputerInput==1)
            {
                System.out.println("You win the Game");
            }
            else
            {
                System.out.println("Computer win the Game");
            }
        }

        if (ComputerInput==0)
        {
            System.out.println("Computer choice : Rock");
        }
        else  if (ComputerInput==1)
        {
            System.out.println("Computer choice : Paper");
        }
        else if (ComputerInput==2)
        {
            System.out.println("Computer choice : Scissor");
        }

    }
}
