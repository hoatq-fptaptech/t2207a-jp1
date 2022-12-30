package session2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        int x = 10;
        x++;
      //  age++;
        Student s1 = new Student();
      //  s1.age++;
      //  s1.eat();
        Student s2 = new Student();
       // s2.eat();
        Student s3 = new Student();

        System.out.println("S1: "+s1.name);
        System.out.println("S2: "+s2.name);
        System.out.println("S3: "+s3.name);

        // array
        int[] arrNums = new int[10];// mang 10 so nguyeen
        arrNums[0] = 12;
        arrNums[1] = 9;

        for(int i=0;i<10;i++){
            arrNums[i] = i;
        }

//        arrNums[10] = 18;
//        arrNums[10]++;
//        System.out.println(arrNums[10]);

        ArrayList<String> strs = new ArrayList<>();
        strs.add("Hello");
        strs.add("world");
        strs.add("every body");

        System.out.println(strs.get(0));
        System.out.println(strs.get(1));
        System.out.println(strs.get(2));

        for(int i=0;i<strs.size();i++){
            System.out.println(strs.get(i));
        }

        ArrayList<Student> sts = new ArrayList<>();// mang cac sinh vien
        sts.add(s1);
        sts.add(s2);
        sts.add(s3);

        sts.add(new Student());
    }
    //Xây dựng lớp tam giác có các thông tin gồm độ dài các cạnh.
    //Sau đó viết các method tính chu vi và diện tích của tam giác.

}
