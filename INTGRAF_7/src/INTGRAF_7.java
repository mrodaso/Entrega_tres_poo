public class INTGRAF_7 {
    int A;
    int B;

    public void setA(int A) {
        this.A = A;
    }

    public void setB(int B) {
        this.B = B;
    }

    public int getA() {
        return A;
    }

    public int getB() {
        return B;
    }
      
    INTGRAF_7 (int A,int B){
    setA(A);
    setB(B);
            
 }
    public String diferencia() {
      int A=getA();
      int B=getB();
      String retorno="";
        if (A > B) {
            retorno="A es mayor que B"; 
            return retorno;
        } else if (A < B) {
            retorno="A es menor que B";
            return retorno;
        } else {
            retorno="A es igual a B";
            return retorno;
        }
    }
}
  