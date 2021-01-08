import utils.ListUtils;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.print("Enter text: ");
        Scanner scn = new Scanner(System.in);
        String text = scn.nextLine();
        printResult(ListUtils.toString(Logic.findNumbers(text)));
    }

    private static void printResult(String numbers)
    {
        if (numbers == null || numbers.equals(""))
        {
            System.out.println("There are no numbers in the text!\n");
        }
        else
        {
            System.out.printf("All numbers from text: %s\n", numbers);
        }
    }
}
