
package exercise1;


public class OperasiPengurangan extends OperasiBilanganAbs{
     protected double a,b,c;
    
    @Override
    protected double getA() {
        return a;
    }

    @Override
    protected void setA(double a) {
      this.a =a;  
    }

    @Override
    protected double getB() {
        return b;
    }

    @Override
    protected void setB(double b) {
        this.b=b;
    }

    @Override
    protected double getC() {
        return c;
    }

    @Override
    protected void setC() {
        this.c=a-b;
    }

    @Override    
    protected void tampil() {
        System.out.println("Hasil pengurangan dari "+a+" - "+b+" = "+c);
    }
}
