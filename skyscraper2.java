import java.util.*;
public class skyscraper2{
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the total number floors in the building : ");
        int n = read.nextInt();
        int x[] = new int[n+1];
        int i=109;
        for(i=1;i<n+1;i++){
            System.out.println("Enter the floor size given on day : "+i);
            int m=read.nextInt();
            x[m]=i;
        }
        int j=n;
        boolean fl;
        System.out.println("The order of construction is as follows ");
        for(i=1;i<=n;i++){
            fl=false;
            System.out.print("Day "+i+" :");
            System.out.println();
            while(j>=1 && x[j]<=i){
                fl=true;
                System.out.print(j +" ");
                j--;
            }
            if(fl==true){
                System.out.print("\n");
            }
        }
    }
}