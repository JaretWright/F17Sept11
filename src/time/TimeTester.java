package time;

import java.util.Scanner;

/**
 *
 * @author JWright
 */
public class TimeTester {

    public static void main(String[] args)
    {
        Time time = new Time();
        
        int hours, minutes, seconds;
        boolean invalidInputs = true;
        Scanner keyboard = new Scanner(System.in);
        
        do
        {
            System.out.print("Enter the hours: ");
            hours = keyboard.nextInt();
            
            System.out.printf("%nEnter the minutes: ");
            minutes = keyboard.nextInt();
           
            System.out.printf("%nEnter the seconds: ");
            seconds = keyboard.nextInt();
           
            try
            {
                time.setTime(hours, minutes, seconds);
                invalidInputs = false;
            }
            catch (IllegalArgumentException e)
            {
                System.err.printf("%s%n", e.getMessage());
            }
        }   while (invalidInputs);
        
        
        System.out.printf("The time is %s%n", time.toMilitaryTime());
        System.out.printf("The time is %s%n", time.toStandardTime());
        
    }
}
