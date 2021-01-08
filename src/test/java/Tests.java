import org.junit.Assert;
import org.junit.Test;
import utils.FileUtils;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;

public class Tests
{
    @Test
    public void test1() throws FileNotFoundException
    {
        String text = FileUtils.readTextFromFile(".\\tests\\input1.txt");
        List<String> expectedList = Arrays.asList("678", "35.89", "378", "-135");
        List<String> numbersList = FinderNumbersInText.findNumbers(text);
        Assert.assertEquals(expectedList, numbersList);
    }

    @Test
    public void test2() throws FileNotFoundException
    {
        String text = FileUtils.readTextFromFile(".\\tests\\input2.txt");
        List<String> expectedList = Arrays.asList("12", "5", "7.6", "2", "27", "0,99");
        List<String> numbersList = FinderNumbersInText.findNumbers(text);
        Assert.assertEquals(expectedList, numbersList);
    }

    @Test
    public void test3() throws FileNotFoundException
    {
        String text = FileUtils.readTextFromFile(".\\tests\\input3.txt");
        List<String> expectedList = Arrays.asList("-1", "23", "678.789", "777,588");
        List<String> numbersList = FinderNumbersInText.findNumbers(text);
        Assert.assertEquals(expectedList, numbersList);
    }

    @Test
    public void test4() throws FileNotFoundException
    {
        String text = FileUtils.readTextFromFile(".\\tests\\input4.txt");
        List<String> expectedList = Arrays.asList();
        List<String> numbersList = FinderNumbersInText.findNumbers(text);
        Assert.assertEquals(expectedList, numbersList);
    }

    @Test
    public void test5() throws FileNotFoundException
    {
        String text = FileUtils.readTextFromFile(".\\tests\\input5.txt");
        List<String> expectedList = Arrays.asList("0", "898098989.8978845342", "-3456.47464",
                "8", "3", "0845465,447");
        List<String> numbersList = FinderNumbersInText.findNumbers(text);
        Assert.assertEquals(expectedList, numbersList);
    }
}
