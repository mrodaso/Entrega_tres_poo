public class Empleado {
    String codigo;
    String nombre;
    int horas;
    int valor;
    int porcentaje;
    
    
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
   Empleado(){
       setCodigo("4381");
       setNombre("Marisol Rodas");
       setHoras(40);
       setPorcentaje(10);
       setValor(500);
                     
    }
    public int bruto() {
    int salario_bruto= getValor() * getHoras();
    
    
    return salario_bruto;


  }
      public int neto() {
    int resto= (bruto() * getPorcentaje())/100;
    int salario_neto = bruto()-resto;
    
    return salario_neto;


  }
      
      
      
      
      
      
}
