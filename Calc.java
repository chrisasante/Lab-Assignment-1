import java.util.*;
public class Calc
{
  public static void main (String[]parameters)
  {
    if (parameters[0].equals("add"))
    {
      double one = Double.parseDouble(parameters[1]);
      double two = Double.parseDouble(parameters[2]);
      System.out.println(one+two);
    
    }
    
    else if (parameters[0].equals("subtract"))
    {
      double one = Double.parseDouble(parameters[1]);
      double two = Double.parseDouble(parameters[2]);
      System.out.println(one-two);
    
    }
    
  }
}