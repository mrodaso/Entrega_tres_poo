public class Empleado {
String nombre;
int salario;
int horas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    Empleado(int salario, int horas, String nombre){
      setNombre(nombre);
      setSalario(salario);
      setHoras(horas);
        
    }
public String resto(){
     String mensaje;
     int resto=getSalario()*getHoras();
     if (resto<450000){
     mensaje=getNombre();
     }
     else {
     mensaje="EL EMPLEADO "+getNombre()+" GANA "+resto;
     }
    return mensaje;
}      
   
}
    
    

