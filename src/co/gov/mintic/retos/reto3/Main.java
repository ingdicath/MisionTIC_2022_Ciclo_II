package co.gov.mintic.retos.reto3;

import java.util.Arrays;
import java.util.List;

/*
 * Resultado esperado metodo 1: ['CHASIS', 'FRENOS', 'MOTOR', 'DIRECCION', 'EMBRAGUE']
 * Resultado esperado metodo 2: [0,5]
 * Resultado esperado metodo 3: ['FRENOS', 'MOTOR', 'DIRECCION']
 * Resultado esperado metodo 4: 3
 */
public class Main {
    public static void main(String[] args) {
        Repuesto respuesto = new Repuesto();

        String lista[] = {"CHASIS", "FRENOS", "MOTOR", "FRENOS", "DIRECCION", "EMBRAGUE", "MOTOR"};
        List<String> list = Arrays.asList(lista);
        System.out.println(respuesto.obtenerRepuestos(list));

        Integer intPos[] = {0, 1, 4, 5, 6};
        List<Integer> listadoPos = Arrays.asList(intPos);
        String repuestosFaltantes[] = {"EMBRAGUE", "FRENOS", "MOTOR", "FRENOS", "DIRECCION", "EMBRAGUE", "MOTOR"};
        List<String> faltantes = Arrays.asList(repuestosFaltantes);
        String cat = "EMBRAGUE";
        System.out.println(respuesto.obtenerRepuestosFaltantes(listadoPos, faltantes, cat));

        String lotro[] = {"EMBRAGUE", "RUEDA", "FRENOS", "MOTOR", "DIRECCION", "CAJA"};
        List<String> otro = Arrays.asList(lotro);
        String lodtimuz[] = {"SUSPENSION", "RUEDA", "CAJA", "EMBRAGUE", "PATIN"};
        List<String> odtimuz = Arrays.asList(lodtimuz);
        System.out.println(respuesto.obtenerFaltantes(otro, odtimuz));

        String lotro2[] = {"EXPLORADORA", "RUEDA", "FRENOS", "MOTOR", "DIRECCION", "CAJA"};
        List<String> otro2 = Arrays.asList(lotro2);
        String lodtimuz2[] = {"SUSPENSION", "RUEDA", "CAJA", "EMBRAGUE", "PATIN"};
        List<String> odtimuz2 = Arrays.asList(lodtimuz2);
        Integer res = respuesto.obtenerSobrantesIntercambiables(otro2, odtimuz2);
        System.out.println(res);
    }
}