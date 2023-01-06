package session4;

import asm.HocSinh;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        HocSinh[] hs = new HocSinh[10];

        ArrayList<HocSinh> ls = new ArrayList<>();
        ls.add(new HocSinh());
        ls.add(new HocSinh("Trung","25/12/2005","8 Ton that thuyet","T2207A",8.5));

        // in thong tin sv 1
        ls.get(1).inThongTin();

        ArrayList<String> strs = new ArrayList<>();

       // ArrayList<Integer>
    }
    // Tạo 1 lớp Car gồm: brand, name, price
    // Tạo 1 ArrayList Car, sau đó sắp xếp theo giá tăng dần
}
