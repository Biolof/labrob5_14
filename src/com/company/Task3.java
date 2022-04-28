package com.company;
import java.util.Scanner;

public class Task3
{
    public static void main(String[] args)
    {
        Scanner num = new Scanner(System.in);
        System.out.println("Введіть перше дробове число - ");
        if (num.hasNextDouble())
        {
            double num1 = num.nextDouble();
            System.out.println("Введіть друге дробове число - ");
            if (num.hasNextDouble())
            {
                double num2 = num.nextDouble();
                System.out.println("Введіть третє дробове число - ");
                if (num.hasNextDouble())
                {
                    double num3 = num.nextDouble();
                    if (num1 > num2 && num1 > num3)
                        System.out.println("Перше число є найбільшим");
                    else if (num2 > num1 && num2 > num3)
                        System.out.println("Друге число є найбільшим");
                    else if (num3 > num1 && num3 > num2)
                        System.out.println("Третє число є найбільшим");
                    else if(num1 == num2 && num2 == num3 )
                        System.out.println("Всі числа однакові");
                }
                else
                    System.out.println("Ви ввели не дробове число ");
            }
            else
                System.out.println("Ви ввели не дробове число ");
        }
        else
            System.out.println("Ви ввели не дробове число ");

    }
}
