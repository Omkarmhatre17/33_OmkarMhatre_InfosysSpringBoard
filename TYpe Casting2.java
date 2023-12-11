package abc;

public class Calculation{
	   public static void main(String[] args){
	      double d = 234.04;
	      long l = (long)d;   //explicit type casting
	      int i = (int)l;     // explicit type casting
	      System.out.println("double value :"+d);
	      System.out.println("long value :"+l);
	      System.out.println("int value :"+i);
	   }
}

Output:

double value :234.04
long value :234
int value :234
