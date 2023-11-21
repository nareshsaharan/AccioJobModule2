class Complex {
    private int real;
    private int imag;
    
    Complex() {
        
    }
    
    Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }
    
    public int getReal() {
        return this.real;
    }
    
    public void setReal(int real) {
        this.real = real;
    }
    
    public int getImag() {
        return this.imag;
    }
    
    public void setImag(int imag) {
        this.imag = imag;
    }

    public String toString() {
        return this.real +" + "+imag +" i";
    }
    
    public Complex add(Complex temp) {
        Complex c3 = new Complex();
        
        c3.real = this.real + temp.real;
        c3.imag = this.imag + temp.imag;
        
        return c3;
    }
    
    public Complex sub(Complex temp) {
        Complex c3 = new Complex();
        
        c3.real = this.real - temp.real;
        c3.imag = this.imag - temp.imag;
        
        return c3;
    }
    
    // HW
    // multi
    // div
    

}

public class MyClass {
    public static void main(String args[]) {
      // 1 + 2i
      Complex c1 = new Complex(1, 2);
      Complex c2 = new Complex(3, 4);
      Complex c3 = c1.add(c2);
      Complex c4 = c1.sub(c2);
      
      System.out.println(c1);
      System.out.println(c2);
      System.out.println(c3);
      System.out.println(c4);
    }
}
