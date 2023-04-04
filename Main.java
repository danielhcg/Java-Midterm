import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {

    Scanner sc1 = new Scanner(System.in);
    String again;

    do {

      // for loop
      System.out.println("\nPrinting out values using a for loop");
      for (int i = 0; i < 5; i++) {
        System.out.print(i + " ");
      }
  
      // while loop
      System.out.println("\n\nPrinting out values using a while loop");
      int j = 0;
      while(j < 10) {
        System.out.print(j + " ");
        j++;
      }
  
      // do while
      System.out.println("\n\nPrining out values using a do while loop");
      int a = 1;
      do {
        System.out.print(a + " ");
        a++;
      } while (a <= 10);
  
      // bool
      Random rand = new Random();
      Scanner sc = new Scanner(System.in);
      boolean randBool = rand.nextBoolean();
      String boo1 = "\n\nWant to test your luck? Think of a yes or no question and ";
      String boo2 = "enter 1 when your ready to know your fate buahahahaha!!!";
      String boo = boo1 + boo2;
      System.out.println(boo);
      sc.nextInt();
      if (randBool = true) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
      
  
      // to accept  user input
      double var1, var2;
      System.out.println("\n\nEnter 2 values: ");
      var1 = sc.nextDouble();
      var2 = sc.nextDouble();
  
      System.out.println("\nSelect one: \n1. +\n2. -\n3. *\n4. /\n");
      int y = sc.nextInt();
  
      switch(y) {
        case 1:
          System.out.println(add(var1, var2));
          break;
        case 2:
          System.out.println(sub(var1, var2));
          break;
        case 3:
          System.out.println(mult(var1, var2));
          break;
        case 4:
          System.out.println(div(var1, var2));
          break;
        default:
          System.out.println("Invalid");
          return;
      }
      
      System.out.println("Would you like to repeat the program? (Y/N): ");
      again = sc1.nextLine();
    } while (again.equals("Y"));

    System.out.println("Thanks for tyring out my program! Bye!");
    

    
  }
  // function to add to numbers
  public static double add(double x, double y) {
    return x + y;
  }
  
  // function to subtract two numbers
  public static double sub(double x, double y) {
    return x - y;
  }
  
  // function to multiply two numbers
  public static double mult(double x, double y) {
    return x * y;
  }
  
  // function to divide two numbers
  public static double div(double x, double y) {
    return x / y;
  }
}



/*

for loop @
while loop @
do while loop @

delcare int @
assign int @
print int @

declare double @
assign double @
print double @

declare bool @
assign bool @
print bool @

declare string @
assign string  @
concatenate string @

multi parameter function @


*/