package asm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//        HocSinh[] hs = new HocSinh[10];
        ArrayList<HocSinh> hs = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<10;i++){
            System.out.println("NHap ten:");
            String ten = sc.nextLine();
            System.out.println("Nhap ngay sinh");
            String ns = sc.nextLine();
            System.out.println("Dia chi:");
            String dc = sc.nextLine();
            System.out.println("Lớp:");
            String lh = sc.nextLine();
            System.out.println("Điểm trung bình:");
            double tb = sc.nextDouble();
            hs.add(new HocSinh(ten,ns,dc,lh,tb));
        }

//        for(int i=0;i<hs.length-1;i++){
//            for(int j=0;j<hs.length-i-1;j++){
//                if(hs[j].getTrungBinh() < hs[j+1].getTrungBinh()){
//                    HocSinh tmp;
//                    tmp = hs[j];
//                    hs[j] = hs[j+1];
//                    hs[j+1] = tmp;
//                }
//            }
//        }

//        for(int i=0;i<hs.length;i++){
//            hs[i].inThongTin();
//        }
        // cao nhat: hs[0]
        // thap nhat: hs[hs.length-1]

        // xuat sac:
//        for(int i=0;i<hs.length;i++){
//            if(hs[i].getTrungBinh() >= 9.5)
//                hs[i].inThongTin();
//        }

        Collections.sort(hs, new Comparator<HocSinh>() {
            @Override
            public int compare(HocSinh o1, HocSinh o2) {
                return o1.getTrungBinh() - o2.getTrungBinh()>0? 0:-1;
            }
        });
    }

    public static void main2(String[] args){
        Fraction t1 = new Fraction();
        t1.tuSo= 1;
        t1.mauSo = 2;
        Fraction t2 = new Fraction();
        t2.tuSo = 4;
        t2.mauSo = 2;

        Fraction t = t1.add(t2);
        Fraction h = t1.sub(t2);
        Fraction n = t1.mul(t2);
        Fraction c = t1.div(t2);

        t.rutGon();
        h.rutGon();
        n.rutGon();
        c.rutGon();

        t.print();
        h.print();
        n.print();
        c.print();
    }
}
