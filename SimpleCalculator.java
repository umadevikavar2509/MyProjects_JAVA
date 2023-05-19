package org.example;
//importing scanner
import java.util.Scanner;
//class name SimpleCalculator
public class SimpleCalculator
{
    //Main method
    public static void main(String[] args)
    {
        //taking input from user
        Scanner input= new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1=input.nextInt();
        System.out.println("Enter the second number: ");
        int num2=input.nextInt();

        System.out.println("Which operation You want to do: \n1.Addition \n2.Subtraction \n3.Multiplication \n4.Division \n5.Power \n6.Remainder \n7.Exit \n");
        int operation=input.nextInt();

        //Switch-case
         switch (operation)
         {
             case 1: {
                 //Addition
                 int add = num1 + num2;
                 System.out.println("\n" + num1 + " + " + num2 + " = " + add);
                 break;
             }
             case 2:
             {
                 //Subtraction
                 int min = num1 - num2;
                 System.out.println("\n" + num1 + " - " + num2 + " = " + min);
                 break;
             }
             case 3:
             {
                 //Multiplication
                 int mul = num1 * num2;
                 System.out.println("\n" + num1 + " * " + num2 + " = " + mul);
                 break;
             }
             case 4:
             {
                 //Division
                 int div = num1 / num2;
                 System.out.println("\n" + num1 + " / " + num2 + " = " + div);
                 break;
             }
             case 5:
             {
                 //power
                 double pow = Math.pow(num1, num2);
                 System.out.println("\n" + num1 + " ** " + num2 + " = " + pow);
                 break;
             }
             case 6:
             {
                 //Module
                 float rem = num1 % num2;
                 System.out.println("\n" + num1 + " % " + num2 + " = " + rem);
                 break;
             }
             case 7:
             {
                 //Stop the Execution of switch
                 break;
             }
             default:
             {
                 System.out.println("Invalid Choice!!");
             }
         }
    }
}


