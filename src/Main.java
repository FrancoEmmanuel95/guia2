import model.empleadoTiempoCompleto;
import model.empleadoPorHoras;


public class Main {
    public static void main(String[] args) {

    empleadoPorHoras eph1 = new empleadoPorHoras("juan perez",3570D,40.2f);
    empleadoTiempoCompleto etp1 = new empleadoTiempoCompleto("jorge lopez",873000.00D,"atencion al cliente");

        System.out.printf("Nombre: "+etp1.getNombre()+"\nSalario: $"+etp1.getSalario()+"\nSalario calculado: $"+etp1.calcularPago());
        System.out.printf("\n\n\nNombre: "+eph1.getNombre()+"\nSalario: $"+eph1.getSalario()+"\nHoras trabajadas: "+eph1.getHorasTrabajadas()+"\ncalculo pago: $"+eph1.calcularPago());


    }
}