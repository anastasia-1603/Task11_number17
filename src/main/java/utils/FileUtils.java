package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileUtils
{
    public static String readTextFromFile(String filename)
    {
        StringBuilder sb = new StringBuilder();
        try (Scanner scanner = new Scanner(new File(filename), "UTF-8"))
        {
            while (scanner.hasNext())
            {
                sb.append(scanner.nextLine() + "\n");
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
