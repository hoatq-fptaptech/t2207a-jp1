package session8;

public class Session8Main {
    public static void main(String[] args){
        try {
            int x = 10;
            int y = 0;
//            if(y<5){
//                throw new Exception("Thích thì báo lỗi");
//            }
            System.out.println("x/y=");
            int z = phepChia(x,y);
            System.out.println(z);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("Lỗi rồi..."+e.getMessage());
        }finally {
            // lúc nào cũng chạy qua đây
        }

        System.out.println("Done");
    }

    public static int phepChia(int a,int b) throws Exception
    {
        return a/b;
    }
}
