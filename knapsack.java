package JAVA;
import java.util.*;

public class knapsack {
    public static void main(String[] args) {

        int n, i, u = 0;
        double W, max;
        double p = 0;
        double weight = 0;
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the number of object");
        n = Sc.nextInt();

        double w[] = new double[n];
        double v[] = new double[n];
        double x[] = new double[n];

        for (i = 0; i < n; i++) {
            x[i] = 0;
        }
        System.out.println("enter the weight:");

        for (i = 0; i < n; i++) {
            w[i] = Sc.nextDouble();
        }
        System.out.println("enter the value:");
        for (i = 0; i < n; i++) {
            v[i] = Sc.nextDouble();
        }

        double s[] = new double[n];
        for (i = 0; i < n; i++) {
            s[i] = v[i] / w[i];
        }

        System.out.println("enter the knapsack capacity:");
        W = Sc.nextDouble();

        while (weight < W) {
            max = 0;
            for (i = 0; i < n; i++) {
                if (s[i] > max) {
                    max = s[i];
                    u = i;

                }
            }
            if ((weight + w[u]) <= W) {
                x[u] = i;
                weight = weight + w[u];
                p = p + v[u];
            }
            else {
                x[u] = (W - weight) / w[u];
                p = p + (v[u] * x[u]);
                weight = W;
            }
            s[u] = 0;
            System.out.println("Fraction of object:");
            for (i = 0; i < n; i++) {
                System.out.println(x[i] + "");
            }

            System.out.println("total profit:" + p);
        }
    }
}
