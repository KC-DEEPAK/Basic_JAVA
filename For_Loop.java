// Now we execute a For loop which when we are using a while loop ..
// it contain condition and initilizition and increment are in diffrent line..
// in for loop syntax is for(data type variable_name;condition;increment/decrement);
class For_loop
{
  public static void main(String args[])
  {
    this is example of time table of office that we use a for loop and nested for and switch case.. 
    for(int i=1;i<=5;i++)
    {
      System.out.println("DAY No->"+ i);
      for(int j=1;j<=9;j++)
      {
        System.out.println(" " +(j+8) + " - " +(j+9));
        switch(i)
        {
          case 1 ->System.out.println("Small_works..");
          case 2 ->System.out.println("More_works..");
          case 3 ->System.out.println("NO_works..");
          case 4 ->System.out.println("Afternoon_works..");
          case 5 ->System.out.println("evening_works..");
          
        }
      }
    }
    we have a another example is printing a pattern..
    for(int i=5;i>=1;i--)
    {
      for(int j=1;j<=i;j++)
      {
        
        System.out.print("*");
      }
      System.out.println( );
    }

  }
}