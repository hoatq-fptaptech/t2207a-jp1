package asm;

public class Fraction {
    public int tuSo;
    public int mauSo;

    public void print(){
        System.out.println(tuSo+"/"+mauSo);
    }

    public void rutGon(){
        int ucln = 1;
        int min = Math.min(Math.abs(tuSo),Math.abs(mauSo));
        for(int i= min;i>1;i--){
            if(tuSo%i==0 && mauSo%i==0){
                ucln = i;
                break;
            }
        }
        tuSo = tuSo/ucln;
        mauSo = mauSo/ucln;
    }

    public void nghichDao(){
        if(tuSo != 0){
            int tmp = tuSo;
            tuSo = mauSo;
            mauSo = tmp;
        }
    }

    public Fraction add(Fraction f){
        int ts = this.tuSo* f.mauSo + this.mauSo * f.tuSo;
        int ms = this.mauSo * f.mauSo;
        Fraction tong = new Fraction();
        tong.tuSo = ts;
        tong.mauSo = ms;
        return tong;
    }

    public Fraction sub(Fraction f){
        int ts = this.tuSo* f.mauSo - this.mauSo * f.tuSo;
        int ms = this.mauSo * f.mauSo;
        Fraction kq = new Fraction();
        kq.tuSo = ts;
        kq.mauSo = ms;
        return kq;
    }

    public Fraction mul(Fraction f){
        int ts = this.tuSo*  f.tuSo;
        int ms = this.mauSo * f.mauSo;
        Fraction kq = new Fraction();
        kq.tuSo = ts;
        kq.mauSo = ms;
        return kq;
    }

    public Fraction div(Fraction f){
        if(f.tuSo != 0){
            int ts = this.tuSo*  f.mauSo;
            int ms = this.mauSo * f.tuSo;
            Fraction kq = new Fraction();
            kq.tuSo = ts;
            kq.mauSo = ms;
            return kq;
        }
        return null;
    }
}
