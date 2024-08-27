package model;

public abstract class empleado {

    private String nombre;
    private Double salario;

    public empleado() {
    }
    public empleado(String nombre, Double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setSalario(Double salario){
        this.salario = salario;
    }
    public  String getNombre(){
        return this.nombre;
    }
    public  Double getSalario(){
        return this.salario;
    }
    public abstract Double calcularPago();
}
