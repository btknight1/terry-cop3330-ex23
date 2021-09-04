/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brandon Terry
 */
package org.example;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        String ans = "";
        Scanner input = new Scanner(System.in);

        System.out.print("Is the car silent when you turn the key? ");
        ans = input.nextLine();

        if(ans.equals("y"))
        {
            System.out.print("Are the battery terminals corroded? ");
            ans = input.nextLine();
            if(ans.equals("y"))
            {
                System.out.print("Clean terminals and try starting again.");
                return;
            }
            else if(ans.equals("n"))
            {
                System.out.print("Replace cables and try again.");
                return;
            }
        }
        else if(ans.equals("n"))
        {
            System.out.print("Does the car make a slicking noise? ");
            ans = input.nextLine();
            if(ans.equals("y"))
            {
                System.out.print("Replace the battery.");
                return;
            }
            else if(ans.equals("n"))
            {
                System.out.print("Does the car crank up but fail to start? ");
                ans = input.nextLine();
                if(ans.equals("y"))
                {
                    System.out.print("Check spark plug connections.");
                    return;
                }
                else if(ans.equals("n"))
                {
                    System.out.print("Does the engine start and then die? ");
                    ans = input.nextLine();
                    if(ans.equals("y"))
                    {
                        System.out.print("Does you car have fuel injection? ");
                        ans = input.nextLine();
                        if(ans.equals("y"))
                        {
                            System.out.print("Get it in for service.");
                            return;
                        }
                        else if(ans.equals("n"))
                        {
                            System.out.print("Check to ensure the choke is opening and closing.");
                            return;
                        }
                    }
                    else if(ans.equals("n"))
                    {
                        System.out.print("This should not be possible.");
                        return;
                    }
                }
            }
        }
    }
}