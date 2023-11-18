package JAVA;

import java.util.Scanner;


public class BFs
{
    static  int v[]=new int[10];
    static  int a[][]=new int[10][10];
    static int n,u;
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of nodes :");
        n=sc.nextInt();


        System.out.println("enter 1 if node are adjacent otherwise 0");
        System.out.println("enter graph in matrix form:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {

                a[i][j]=sc.nextInt();
            }
        }bfsearch();


    }
    public static void bfsearch()
    {

        for(int i=0;i<n;i++)
        {
            v[i]=0;

        }
        for(int i=0;i<n;i++)
        {
            if(v[i]== 0)
                bfs(i);
        }
    }
    public static void bfs(int i)
    {
        int rear=0,front=0,j=0;
        int queue[] = new int[n];
        v[i]=1;
        queue[rear]=i;
        rear++;

        if(front==-1)
        {
            front=0;
        }
        while(front!=rear)
        {
            u=queue[front];
            System.out.println("visited node:"+(u+1));
            front++;
            for(j=0;j<n;j++){
                if( a[u][j] == 1 && v[j] == 0)
                {
                    v[j]=1;
                    queue[rear]=j;
                    rear++;

                }
            }
            for(i=front;i<rear;i++)
            {
                System.out.println("queue: "+(queue[i]+1));
            }
        }
    }
}