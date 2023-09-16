package ejercicio_19;

import static java.lang.Math.sqrt;

public class Triangulo {
    double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
 Triangulo (double lado){
 setLado(lado);
 }
 public double perimetro(){
 double perimetro=getLado()*3;
 return perimetro;
 }
    
public double area(){
    
double area=sqrt(3)*Math.pow(getLado(), 2);
area=area/4;
return area;
}    
public double altura(){
double altura=sqrt(3)*getLado();
altura=altura/2;
return altura;
}
}
