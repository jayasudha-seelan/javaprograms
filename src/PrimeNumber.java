import java.util.Scanner;
import static java.lang.Math.sqrt;

public class PrimeNumber {
    public static void main(String[] args) {
        IsPrime();
    }


    public static void IsPrime() {
        System.out.println("Enter the number to check");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if (number<=1)
        {
            System.out.println("The number is not a prime number");
        }
        else if (number==2)
        {
            System.out.println("The number is a prime number");
        }
        else if (number%2==0)
        {
            System.out.println("The number is not a prime number");
        }
        else
        {
            Boolean isprime=true;
            for(int i=3;i<=sqrt(number);i+=2)
            {
                if (number%i==0)
                {
                    System.out.println("The number is not a prime number");
                    isprime=false;
                    break;
                }
            }
            if(isprime) {
                System.out.println("The number is a prime number");
            }
        }

    }
}

/*
Walkthrough with Number 23 :
----------------------------
1.	Main Method:
•	The main method calls the IsPrime method.
2.	IsPrime Method:
•	Prints "Enter the number to check".
3.	Scanner:
•	Reads the user input. User inputs 23.
4.	If Statement:
•	Checks if number <= 1. Since 23 <= 1 is false, this block is skipped.
5.	Else If Statement:
•	Checks if number == 2. Since 23 == 2 is false, this block is skipped.
6.	Else If Statement:
•	Checks if number % 2 == 0. Since 23 % 2 == 0 is false, this block is skipped.
7.	Else Block:
•	Initializes the boolean variable isprime to true.
•	Enters a for loop with i = 3 to i <= sqrt(23) (i.e., i <= 4.79583).
•	i = 3: Checks if 23 % 3 == 0. Since 23 % 3 != 0, this block is skipped.
•	i = 5: Checks if 23 % 5 == 0. Since 23 % 5 != 0, this block is skipped.
•	Exits the loop as i exceeds sqrt(23).
8.	Post-loop:
•	Since no divisors were found, it prints "The number is a prime number".
*/