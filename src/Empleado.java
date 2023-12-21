public class Empleado {
    // Propiedades
    private String nombre;
    private double salarioBase;

    // Constructor
    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    // Método para calcular el salario
    public double calcularSalario() {
        return this.salarioBase;
    }
}
