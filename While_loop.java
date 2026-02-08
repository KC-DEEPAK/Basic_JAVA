//In  java we come across a diffrent loops in java are for ,while,do-while..
//Now we do while loop..and Nested while loop..

class loops
{
  public static void main(String args[])
  {
    int i=1;
    while(i<=5)
    {
      System.out.println("Hii "+ i);
      i++;
    int j=1;// this part is called as nested while 
    while(j<=3)
    {
      System.out.println("Hello "+j);
      j++;
    }
    }


    // print a odd numbers using a while loop in the range between 1-50...
    int i=1;

    while(i<=50)
    {
      if(i%2==1)
      {
        System.out.println(i);
      }
      i++;
    }


    //Another question is sum of all the digits in  numbers using numbers..
    int n=1;
    int result=0;

    while(n<=6)
    {
      result=result+n;
      n++;
    
    }
    System.out.println(result);


    //We have a another example is Find the sum of digits of a number using while loop.
    int n=123;
    int sum=0;

    while(n!=0)
    {
      sum=sum+(n%10);
      n=n/10;

    }
    System.out.println(sum);
  } 
}