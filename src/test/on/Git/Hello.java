package test.on.Git;

import java.util.*;
public class HalfDiamondPattern
	
{
	public static void main(String[] args) {
	 	Scanner sc=new Scanner(System.in);
		int max=sc.nextInt();
		System.out.println("*");
	 for (int i = 1; i <= max; i++)
        {
            System.out.print("*");
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--)
            {
                System.out.print(j);
            }
            System.out.println("*");
        }
        for (int i = max-1; i >= 1; i--)
        {
             System.out.print("*");
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--)
            {
                System.out.print(j);
            }
            System.out.println("*");
        }
        	System.out.println("*");
	}
}
