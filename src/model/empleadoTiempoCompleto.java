package model;

public class empleadoTiempoCompleto extends empleado{

    private String puesto;

    public empleadoTiempoCompleto(){}
    public empleadoTiempoCompleto(String nombre,Double salario,String puesto){
        super(nombre, salario);
        this.puesto = puesto;
    }

   @Override
   public Double calcularPago(){
       return getSalario();
   }

}
