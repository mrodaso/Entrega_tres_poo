public class TriánguloRectángulo {
int base; // Atributo que define la base de un triángulo rectángulo
int altura; // Atributo que define la altura de un triángulo rectángulo
/**
* Constructor de la clase TriánguloRectángulo
* @param base Parámetro que define la base de un triángulo
* rectángulo
* @param altura Parámetro que define la altura de un triángulo
* rectángulo
*/
public TriánguloRectángulo(int base, int altura) {
this.base = base;
this.altura = altura;
}
/**
* Método que calcula y devuelve el área de un triángulo rectángulo
* como la base multiplicada por la altura sobre 2
* @return Área de un triángulo rectángulo
*/
double calcularArea() {
return (base * altura / 2);
}
double calcularPerímetro() {
return (base + altura + calcularHipotenusa()); /* Invoca al
método calcular hipotenusa */
}
double calcularHipotenusa() {
return Math.pow(base*base + altura*altura, 0.5);
}

void determinarTipoTriángulo() {
if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa()))
System.out.println("Es un triángulo equilátero");
else if 
((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa()))
System.out.println("Es un triángulo escaleno");
else 
System.out.println("Es un triángulo isósceles");
}
}
