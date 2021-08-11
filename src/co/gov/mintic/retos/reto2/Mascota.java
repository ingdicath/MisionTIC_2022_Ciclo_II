package co.gov.mintic.retos.reto2;

public class Mascota {
    private String nombre;
    private double peso;
    private int edad;
    private String documentoPropietario;

    public Mascota(String nombre, double peso, int edad, String docProp) {
        this.nombre = nombre;
        this.peso = peso;
        this.edad = edad;
        documentoPropietario = docProp;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\n\tPeso: " + peso + " kg" +
                "\n\tedad: " + edad + " meses" +
                "\n\tdocumento: " + documentoPropietario;
    }
}
