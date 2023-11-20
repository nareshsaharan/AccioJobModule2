
class Fraction {
    
    private int num;
    private int deno;
    
    Fraction() {}
    
    Fraction(int num, int deno) {
        this.num = num;
        this.deno = deno;
    }
    
    public int getNum() {
        return this.num;
    }
    
    public void setNum(int num) {
        this.num = num;
    }
    
    public int getDeno() {
        return this.deno;
    }
    
    public void setDeno(int deno) {
        this.deno = deno;
    }
    
    public String toString() {
        return this.num + " / " + this.deno;
    }
    
    
    public static Fraction multiply(Fraction f1, Fraction f2) {
        Fraction f3 = new Fraction();
        f3.num = f1.num * f2.num;
        f3.deno = f1.deno * f2.deno;
        return f3;
    }
    
    public static Fraction add(Fraction f1, Fraction f2) {
        Fraction f3 = new Fraction();
        
        f3.num = f1.num * f2.deno + f2.num * f1.deno;
        f3.deno = f1.deno * f2.deno;
        return f3;
    }
    
    //HW
    // sub (-)
    
    // div (/)
    
}

public class MyClass {
    public static void main(String args[]) {
        Fraction f1 = new Fraction(3, 4);
        Fraction f2 = new Fraction(4, 5);
        Fraction f3 = Fraction.multiply(f1, f2);
        Fraction f4 = Fraction.add(f1, f2);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
    }
}
