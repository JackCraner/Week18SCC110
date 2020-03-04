public class Operators
{
    int output;
    String sign;
    public Operators(int a, int b, int c)
    {
        if (a == 1)
        {
            output = b + c;
            sign = "+";
        } 
        else 
        {
            output = b - c;
            sign = "-";
        }



    }
    public int getReturn()
    {
        return output;
    }
    public String getSign()
    {
        return sign;
    }
}