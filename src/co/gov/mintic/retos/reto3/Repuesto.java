package co.gov.mintic.retos.reto3;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Repuesto {

    /*
     * Option # 1, excluye duplicados, mantiene el orden de los elementos
     */
    public List<String> obtenerRepuestos(List<String> l) {
        List<String> noDuplicados = new ArrayList<>();
        for (String elemento : l) {
            if (!noDuplicados.contains(elemento)) {
                noDuplicados.add(elemento);
            }
        }
        return noDuplicados;
    }

    /*
     * Option # 2, excluye duplicados, sin mantener el orden de la lista original
     */
    //    public List<String> obtenerRepuestos(List<String> l) {
    //        Set<String> noDuplicados = new HashSet<>(l);
    //        return new ArrayList<>(noDuplicados);
    //    }

    /*
     * Option # 3, excluye duplicados, mantiene el orden de los elementos
     */
    //     public List<String> obtenerRepuestos(List<String> l) {
    //         return l.stream().distinct().collect(Collectors.toList());
    //     }

    public List<Integer> obtenerRepuestosFaltantes(List<Integer> lpos, List<String> faltantes, String cat) {
        List<Integer> res = new ArrayList<>();
        for (Integer index : lpos) {
            if (faltantes.get(index).equals(cat))
                res.add(index);
        }
        return res;
    }

    public List<String> obtenerFaltantes(List<String> lotro, List<String> lodtimuz) {
        List<String> faltantes = new ArrayList<>();
        for (String elemento : lotro) {
            if (!lodtimuz.contains(elemento))
                faltantes.add(elemento);
        }
        return faltantes;
    }

    public Integer obtenerSobrantesIntercambiables(List<String> lotro, List<String> lodtimuz) {
        Integer cuentaLotro = 0;
        Integer cuentaLodtimuz = 0;
        for (String elemento : lotro) {
            if (!lodtimuz.contains(elemento)) {
                cuentaLotro++;
            }
        }
        for (String elemento : lodtimuz) {
            if (!lotro.contains(elemento))
                cuentaLodtimuz++;
        }
        if (cuentaLotro < cuentaLodtimuz)
            return cuentaLotro;
        else
            return cuentaLodtimuz;
    }
}
