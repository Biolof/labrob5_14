package com.company;
import java.util.Scanner;

public class Task4
{
    public static void main(String[] args)
    {
        Scanner str = new Scanner(System.in);
        System.out.println("Введіть перше слово - ");
        String str1 = str.nextLine();
        System.out.println("Введіть друге слово - ");
        String str2 = str.nextLine();
        System.out.println("Перше і друге слово однакові - " + str1.equalsIgnoreCase(str2));
    }
}
