// Clase Desarrollador
public class Desarrollador extends Empleado {
    // Propiedad adicional
    private double horasExtras;
    private double tarifaHoraExtra;

    // Constructor
    public Desarrollador(String nombre, double salarioBase, double horasExtras, double tarifaHoraExtra) {
        super(nombre, salarioBase);
        this.horasExtras = horasExtras;
        this.tarifaHoraExtra = tarifaHoraExtra;
    }

    // Sobrescribir el método calcularSalario()
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (this.horasExtras * this.tarifaHoraExtra);
    }
}