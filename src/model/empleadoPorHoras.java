package model;

public class empleadoPorHoras extends empleado{
    private Float horasTrabajadas;

    public empleadoPorHoras(){
    }



    public empleadoPorHoras(String nombre,Double salario, Float horasTrabajadas){
        super(nombre, salario);
        this.horasTrabajadas = horasTrabajadas;
    }

    public void setHorasTrabajadas(Float horasTrabajadas){
        this.horasTrabajadas = horasTrabajadas;
    }
    public Float getHorasTrabajadas(){
        return this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public Double calcularPago() {
        return this.horasTrabajadas * getSalario();
    }
}
