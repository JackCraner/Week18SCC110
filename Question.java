import java.util.Random;
public class Question
{
    String resultString;
    int num1;
    int num2;
    int resultInt;
    public Question()
    {
        num1 = generateNumber(10);
        num2 = generateNumber(10);
        Operators result = new Operators(generateNumber(2), num1, num2);
        resultInt = result.getReturn();
       
        resultString = num1 + " " + result.getSign() + " " + num2;
      



    }
    private int generateNumber(int x)
    {
        Random r1 = new Random();
        return r1.nextInt(x);
    }
    public String getQuestion()
    {
        return resultString;
    }
    public int GetResult()
    {
        return resultInt;
    }

}