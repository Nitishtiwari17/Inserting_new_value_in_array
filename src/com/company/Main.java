package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int n,m,p;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no.of element in array");
        n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n+1];

        System.out.print("enter value");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.print("enter index of new value to be inserted");
        m=sc.nextInt();
        System.out.print("enter new value to be inserted");
        p=sc.nextInt();
        for(int i=0;i<n+1;i++)
        {
            if(i<m)
            {
                b[i]=a[i];
            }
            else if(i==m)
            {
                b[i]=p;
            }
            else
            {
                b[i]=a[i-1];
            }
            System.out.print("element are:");
            for( i=0;i<n+1;i++)
            {
                System.out.println(b[i]);
            }
        }
	// write your code here
    }
}
