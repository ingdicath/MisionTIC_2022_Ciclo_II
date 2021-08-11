package co.gov.mintic.retos.reto2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MisClientes {

    private List<Mascota> mascotas;
    private Scanner sc;

    public MisClientes() {
        mascotas = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    public void agregarMascota(Mascota m) {
        mascotas.add(m);
    }

    public void listarMascotas() {
        System.out.println("***Clientes***");
        for (Mascota m : mascotas) {
            System.out.println(m);
        }
    }

    public void procesarComandos() {
        String[] comando = null;
        do {
            comando = sc.nextLine().split("&");
            switch (comando[0]) {
                case "1":
                    Mascota mascota = null;
                    if (comando[1].equals("Perro")) {
                        mascota = new Perro(comando[2], Double.parseDouble(comando[3]), Integer.parseInt(comando[4]), comando[5], comando[6]);
                    } else if (comando[1].equals("Gato")) {
                        mascota = new Gato(comando[2], Double.parseDouble(comando[3]), Integer.parseInt(comando[4]), comando[5], comando[6]);
                    }
                    agregarMascota(mascota);
                    break;
                case "2":
                    listarMascotas();
                    break;
                case "3":
                    break;
            }
        } while (!comando[0].equals("3"));
    }

    public static void main(String[] args) {
        MisClientes clientes = new MisClientes();
        clientes.procesarComandos();
    }
}
