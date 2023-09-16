package estudiante;
public class Estudiante {
 String inscripcion;
 String nombre;
 int patrimonio;
 int estrato;

    public String getInscripcion() {
        return inscripcion;
    }

    public void setInscripcion(String inscripcion) {
        this.inscripcion = inscripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(int patrimonio) {
        this.patrimonio = patrimonio;
    }

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

Estudiante(int patrimonio,int estrato, String inscripcion, String nombre){
    setInscripcion(inscripcion);
    setNombre(nombre);
    setPatrimonio(patrimonio);
    setEstrato(estrato);

}
public double matricula(){
    double matricula=50000;
if (getPatrimonio()>2000000 && getEstrato()>3) {
    matricula=(getPatrimonio()*0.03)+matricula;
    
    
} return matricula;
} 
    
    
    
}
