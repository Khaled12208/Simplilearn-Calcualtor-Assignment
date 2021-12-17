package Simple;

import java.util.Scanner;

public class Calculator {
	
	
	public static void main(String[] args)
    {
        System.out.println("---- Welecome To Calcualtor app by Khaled M. Farh--- ");
        int num1,num2,choose,ans;
        Scanner inp= new Scanner(System.in);
        boolean ON = true;

		while (ON){
	    System.out.println("Please Enter The Operation Code: 1 for Addition, 2 for substraction 3 for Multiplication and 4 for division:");
        choose = inp.nextInt();
        if (choose == 1 || choose == 2 ||choose ==  3 ||choose ==  4) {
        System.out.println("Enter first number:");
        num1 = inp.nextInt();
        System.out.println("Enter Second number:");
        num2 = inp.nextInt();
        switch (choose){
        case 1:
            System.out.println(num1+"+"+num2+"="+ add( num1,num2));
            break;
        case 2:
            System.out.println(num1+"-"+num2+"="+sub( num1,num2));
            break;      
        case 3:
            System.out.println(num1+"x"+num2+"="+mult( num1,num2));
            break;
        case 4:
            System.out.println(num1+"/"+num2+"="+div( num1,num2));
            break;
            default:

        }
        }else {
            System.out.println("Calcualtor switched OFF ..");
            ON=false;
        }
        
		}

    }
    public static int add(int x, int y)
    {
        int result = x + y;
        return result;
    }
    public static int sub(int x, int y)
    {
        int result = x-y;
        return result;
    }
    public static int mult(int x, int y)
    {
        int result = x*y;
        return result;
    }
    public static int div(int x, int y)
    {
        int result = x/y;
        return result;
    }

}
