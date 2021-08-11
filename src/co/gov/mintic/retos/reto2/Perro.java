package co.gov.mintic.retos.reto2;

public class Perro extends Mascota {

    private String marcaHueso;

    public Perro(String nombre, double peso, int edad, String docProp, String marcaH) {
        super(nombre, peso, edad, docProp);
        marcaHueso = marcaH;
    }

    @Override
    public String toString() {
        String res = super.toString();
        res += "\n\tMarca hueso: " + marcaHueso;
        return res;
    }
}
