public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Empleado
        Empleado empleado = new Empleado("Juan", 3000);
        System.out.println("Salario del empleado: " + empleado.calcularSalario());

        // Crear una instancia de Gerente
        Gerente gerente = new Gerente("Ana", 5000, 1000);
        System.out.println("Salario del gerente: " + gerente.calcularSalario());

        // Crear una instancia de Desarrollador
        Desarrollador desarrollador = new Desarrollador("Carlos", 4000, 10, 20);
        System.out.println("Salario del desarrollador: " + desarrollador.calcularSalario());
    }
}
