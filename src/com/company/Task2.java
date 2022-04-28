package com.company;
import java.util.Scanner;

public class Task2
{
    public static void main(String[] args)
    {

        Scanner str = new Scanner(System.in);
        System.out.println("Введіть перше слово - ");
        String str1 = str.nextLine();
        System.out.println("Введіть друге слово - ");
        String str2 = str.nextLine();
        System.out.println("Введіть третє слово - ");
        String str3 = str.nextLine();
        System.out.println("Введіть четверте слово - ");
        String str4 = str.nextLine();
        System.out.println("Введіть п'яте слово - ");
        String str5 = str.nextLine();
        System.out.println("Перша буква першого слова - " + str1.substring(0,1));
        System.out.println("Перша буква другого слова - " + str2.substring(0,1));
        System.out.println("Перша буква третього слова - " + str3.substring(0,1));
        System.out.println("Перша буква четвертого слова - " + str4.substring(0,1));
        System.out.println("Перша буква п'ятого слова - " + str5.substring(0,1));
    }
}