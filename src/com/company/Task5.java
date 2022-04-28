package com.company;

import java.util.Scanner;

public class Task5
{
    public static void main(String[] args)
    {
        Scanner str = new Scanner(System.in);
        System.out.println("Введіть перший рядок - ");
        String str1 = str.nextLine();
        System.out.println("Введіть другий рядок - ");
        String str2 = str.nextLine();
        int length1 = str1.length();
        int length2 = str2.length();
        if (length1 > length2)
            System.out.println("Перший рядок більший за другий");
        else if (length2>length1)
            System.out.println("Другий рядок більший за перший");
        else
            System.out.println("Два рядки однакові");
    }
}
