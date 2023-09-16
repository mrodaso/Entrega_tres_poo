package ejercicio_23;
public class Raices {
    int A;
    int B;
    int C;
    

    public int getA() {
        return A;
    }

    public void setA(int A) {
        this.A = A;
    }

    public int getB() {
        return B;
    }

    public void setB(int B) {
        this.B = B;
    }

    public int getC() {
        return C;
    }

    public void setC(int C) {
        this.C = C;
    }
    
    Raices(int A, int B, int C){
    setA(A);
    setB(B);
    setC(C);
}
 public String soluciones(){
     int x1;
     int x2;
     String mensaje;
     int discriminante = getB() * getB() - 4 * getA() * getC();
     if (discriminante < 0) {
     mensaje="La ecuación no tiene solución en los reales.";
     } else {
     x1 = (int) ((-getB() + Math.sqrt(discriminante)) / (2 * getA()));
     x2 = (int) ((-getB() - Math.sqrt(discriminante)) / (2 * getA())); 
     mensaje="las raices son x1: "+x1+ " y x2: "+x2;
     }   
     return mensaje;
}
 
}