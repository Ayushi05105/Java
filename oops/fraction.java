package oops;

public class fraction {

    



    int num;
    int den;
    public fraction(int num,int den){
        this.num=num;
        this.den=den;
    }
    public static void main(String[] args) {
        fraction f1 = new fraction(7, 3);
        System.out.println(f1.num+"/"+f1.den);

    }
    
    
    
    public class Fraction {
    int num;
    int den;
    public Fraction(int num,int den){
        this.num=num;
        this.den=den;
    }

    public static void main(String[] args) {
        Fraction f1=new Fraction(3, 7);
        System.out.println(f1.num+"/"+f1.den);
    }
    
}

    
}
