import java.util.Arrays;
import java.util.Scanner;

public  class java_linterview {

    public static void  reverse(int [] g, int h){
        int [] o = new int[h];
        int z=h;
        System.out.println(g[0]);
        System.out.println(g[1]);
        System.out.println(z);

        for (int b=0;b<h;b++){
            o[z-1]=g[b];
            z=z-1;
        }
        System.out.println(z);
        System.out.println("The reversed array is \n");
        for (int element=0;element<h;element++){
            System.out.println(o[element]);
        }
        for (int ss:o){
            System.out.println(ss);
        }
        System.out.println(Arrays.toString(o));
    }

    public static void main(String[] args) {

        System.out.println("Average in Array.");
        Scanner sms= new Scanner(System.in);
        int [] s = {1, 2, 3, 4, 5, 6, 7,8};
        float m = 0, n = 0;
        int i;
        for (i = 0; i < s.length; i++) {

            m = s[i] + m;
            n = n + 1;


        }

        float avg;
        avg = m / n;
        System.out.println("Average in the arrays is " + avg);

        for(int element:s){
            System.out.println(element);
        }

        System.out.println(" Enter the no of elements :");
        int f=sms.nextInt();
        int [] mms= new int[f];
        float q=0,w=0,e=0;
        System.out.println("Enter the elements:");
        for(int j=0;j<f;j++){
            mms[j]=sms.nextInt();

        }
        for (int p=0;p<mms.length;p++){
            q=mms[p]+q;
            w=w+1;
        }
        e=q/w;
        System.out.println("Average in the arrays is " + e);
//        System.out.println(Arrays.toString(mms));
        System.out.println(mms.length);
        reverse(mms,mms.length);


    }
}

