package session1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello world!");
        int x = 10;
        double y = 3.14;
        String s = "Hello";
        System.out.println("x= "+x);
        y = y + 20 *x;

        if(y>100){
            System.out.println("y = "+y);
        }else{
            System.out.println("x ="+x);
        }

        for(int i=0;i<10;i++){
            System.out.println("i = "+i);
        }

        // tinh S = 1 + 2 + 3+ 4 + ... + 1000;
        // tinh S = 1 + 1/2+ 1/3+ ... + 1/1000
        int S1 = 0;
        for(int i=1;i<=1000;i++){
            S1 = S1 +i;
        }
        System.out.println("S1 = "+S1);
        double S2 = 0;
        for(int i=1;i<=1000;i++){
            S2 = S2 + (double) 1/i;
        }
        System.out.println("S2 = "+S2);

        int z = tinhTong(10,15);
        boolean t = true;

        // nhap 1 so nguyen tu ban phim
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 1 so nguyen:");
        int n = sc.nextInt();

        System.out.println("Nhap 1 so thuc:");
        double d = sc.nextDouble();
        sc.nextLine();
        System.out.println("NHap 1 string:");
        String str = sc.nextLine();
        System.out.println("n: "+n);
        System.out.println("d: "+d);
        System.out.println("str: "+str);

        // Nhập 1 số nguyên n từ bàn phím,
        // tính tổng S = 1+ 2 + 3 .. + n

        // kiểm tra n có phải số nguyên tố hay không
    }

    static int tinhTong(int a,int b){
        return a+b;
    }

    static int tinhHieu(int a,int b){
        return a-b;
    }

    static int tinhTich(int a,int b){
        return a*b;
    }

    static int tinhThuong(int a,int b){
        return b==0?null:a/b;
    }
}