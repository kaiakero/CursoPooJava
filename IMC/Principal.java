public class Principal {
    public static void main(String[] args) {
        // Criação de três instâncias de Paciente com valores diferentes
        Paciente paciente1 = new Paciente(70, 1.75); // IMC ~ 22.86
        Paciente paciente2 = new Paciente(95, 1.70); // IMC ~ 32.87
        Paciente paciente3 = new Paciente(45, 1.60); // IMC ~ 17.58

        // Impressão dos resultados para o primeiro paciente
        System.out.println("Paciente 1:");
        System.out.println("IMC: " + paciente1.calcularIMC());
        System.out.println("Diagnóstico: " + paciente1.diagnostico());
        System.out.println();

        // Impressão dos resultados para o segundo paciente
        System.out.println("Paciente 2:");
        System.out.println("IMC: " + paciente2.calcularIMC());
        System.out.println("Diagnóstico: " + paciente2.diagnostico());
        System.out.println();

        // Impressão dos resultados para o terceiro paciente
        System.out.println("Paciente 3:");
        System.out.println("IMC: " + paciente3.calcularIMC());
        System.out.println("Diagnóstico: " + paciente3.diagnostico());
        System.out.println();
    }
}
