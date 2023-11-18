package JAVA;
import java.util.*;
public class DFs {
    static int n;
    static int v[]=new int[10];
    static int G[][]=new int[10][10];
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of nodes :");
        n=sc.nextInt();

        System.out.println("enter 1 if node are adjacent otherwise 0");
        System.out.println("Enter graph in matrix form:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                G[i][j]=sc.nextInt();
            }
        }
        dfsearch();
    }

    public static void dfsearch()
    {
        for(int i=0;i<n;i++)
        {
            v[i]=0;
        }
        for(int i=0;i<n;i++)
        {
            if(v[i]== 0)
                dfs(i);
        }
    }
    public static void dfs( int i)
    {
        v[i]=1;
        System.out.println("visited node:"+(i+1));
        for(int j=0;j<n;j++)
        {
            if( G[i][j] == 1 && v[j] == 0)
            {
                dfs(j);
            }
        }
    }
}