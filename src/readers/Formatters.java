package readers;

import java.util.Scanner;

public class Formatters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.printf("%s",s1);
            for(int j=1;j<=15-s1.length();j++)
                System.out.printf(" ");
            if(x>9 && x<100)
                System.out.printf("%s\n","0"+x);
            else if(x>=0 && x<10)
                System.out.printf("%s\n","00"+x);
            else
                System.out.printf("%d\n",x);
        }
        System.out.println("================================");
    }
}
