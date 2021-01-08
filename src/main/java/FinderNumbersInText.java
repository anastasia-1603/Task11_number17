import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FinderNumbersInText
{
    public static List<String> findNumbers(String text)
    {
        List<String> listNumbers = new ArrayList<>();
        Pattern pattern = Pattern.compile("-?\\d+([\\.,]\\d*)?");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find())
        {
            listNumbers.add(matcher.group());
        }
        return listNumbers;
    }
}
