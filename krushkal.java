package JAVA;

import java.util.*;
public class krushkal {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of Nodes:");
        int n = sc.nextInt();

        int M[][]= new int[n][n];

        for(int i=0;i<n;i++){
            System.out.println("Enter Weight of nodes adjecent with:"+i);
            for(int j=0;j<n;j++){
                M[i][j]=sc.nextInt();
            }
        }

        int mn=0,max=0;
        int u=0,sum=0;
        int v=0,x=0;

        int V[] = {0,1,2,3,4,5,6};
        while(x<n-1){

            int min=100;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(M[i][j]<min){
                        min=M[i][j];
                        u=i;
                        v=j;
                    }
                }
            }
            if(V[u]!=V[v])
            {
                x++;
                sum=sum+min;
                System.out.println(u+" "+v+" "+min);
                if(V[u]<V[v]){
                    mn=V[u];
                    max=V[v];
                }
                else{
                    mn=V[v];
                    max=V[u];
                }
                V[u]=V[v]=mn;
                for(int i=0;i<n;i++)
                {
                    if(V[i]==max) {
                        V[i]=mn;
                    }
                }

            }
            M[u][v]=M[v][u]=100;
        }
        System.out.println(sum);
    }
}

