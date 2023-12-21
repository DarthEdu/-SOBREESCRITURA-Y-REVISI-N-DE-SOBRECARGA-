// Clase Gerente
public class Gerente extends Empleado {
    // Propiedad adicional
    private double bono;

    // Constructor
    public Gerente(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        this.bono = bono;
    }

    // Sobrescribir el método calcularSalario()
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + this.bono;
    }
}