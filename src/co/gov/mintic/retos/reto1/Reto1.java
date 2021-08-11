/*
 * @author diani
 * Created on: Jul-2021
 */

package co.gov.mintic.retos.reto1;

import java.util.Scanner;

public class Reto1 {

    public static Scanner sc = new Scanner(System.in);

    public static String planetCategory1(int distance) {
        String category = "";
        if (distance > 50)
            category = "cuatro";
        else if (distance >= 31)
            category = "tres";
        else if (distance >= 21)
            category = "dos";
        else if (distance >= 0)
            category = "uno";
        return category;
    }

    public static void main(String[] args) {
        int terraDist = sc.nextInt();
        int loonaDist = 2 * terraDist + 4;
        int zaiberDist = (3 * terraDist + 4) / 5;
        System.out.printf("%d %d %d\n", terraDist, loonaDist, zaiberDist);
        System.out.println(planetCategory1(zaiberDist));
    }
}
