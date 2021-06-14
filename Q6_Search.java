import java.io.*;
import java.util.Scanner;
public class Q6_Search
{
    public static void main(String[] args) throws IOException
    {
        int n, ele, flag = 0, i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements:");
        for(i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the element to find:");
        ele = sc.nextInt();
        for(i = 0; i < n; i++)
        {
            if(a[i] == ele)
            {
                flag = 1;
                break;
            }
            else
            {
                flag = 0;
            }
        }
        if(flag == 1)
        {
            System.out.println("Element found at position:"+(i + 1));
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}