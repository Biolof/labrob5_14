package com.company;
import java.util.Scanner;

public class Task1
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
        String a = str1.concat(str2);
        String b = a.concat(str3);
        String c = b.concat(str4);
        String d = c.concat(str5);
        System.out.println(d);
    }
}
