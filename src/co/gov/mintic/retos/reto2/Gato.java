package co.gov.mintic.retos.reto2;

public class Gato extends Mascota {

    private String marcaArena;

    public Gato(String nombre, double peso, int edad, String docProp, String marcaArena) {
        super(nombre, peso, edad, docProp);
        this.marcaArena = marcaArena;
    }

    @Override
    public String toString() {
        String res = super.toString();
        res += "\n\tMarca arena: " + marcaArena;
        return res;
    }
}
