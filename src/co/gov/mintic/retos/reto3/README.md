# Reto 3

Odtimuz necesita tu ayuda para crear una clase en Java llamada Repuesto que pueda integrar a su sistema. La clase debe tener las siguientes funciones:

### obtenerRepuestos(l)
Dada una lista de repuestos l que contiene nombres de artículos la función genera una lista de los artículos sin repetición.

Ejemplo:
<br >`l = ['CHASIS', 'FRENOS', 'MOTOR', 'FRENOS', 'DIRECCION', 'EMBRAGUE', 'MOTOR']`

La función debe retornar la siguiente lista:
<br >`['CHASIS', 'FRENOS', 'MOTOR', 'DIRECCION', 'EMBRAGUE']`

### <br >obtenerRepuestosFaltantes(lpos, faltantes, cat) 
Dada una lista con las posiciones de los repuestos que faltan lpos, una lista de repuestos faltantes **faltantes** y el nombre de un repuesto **cat**, se debe obtener la lista de posiciones de los repuestos faltantes. Ejemplo:

`lpos = [0, 1, 4, 5, 6]`
<br >`faltantes =['EMBRAGUE', 'FRENOS', 'MOTOR', 'FRENOS', 'DIRECCION', 'EMBRAGUE', 'MOTOR']`
<br >`cat = ‘EMBRAGUE’`

Se debe retornar la siguiente lista: `[0, 5]`

### <br >obtenerFaltantes(lotro, lodtimuz)
Para poder realizar un intercambio de repuestos, dada la lista de repuestos que tienen otro autobot llamada **lotro**, y la lista de repuestos que tiene Odtimuz actualmente llamada **lodtimuz**, retorna la lista de repuestos que me interesan del otro autobot.

Ejemplo: si se tiene como entrada:

`lotro =['EMBRAGUE', 'RUEDA', 'FRENOS', 'MOTOR', 'DIRECCION', 'CAJA']`
<br >`lodtimuz  = ['SUSPENSION', 'RUEDA', 'CAJA', 'EMBRAGUE', 'PATIN']`

La función debe retornar una lista que contiene: `['FRENOS', 'MOTOR', 'DIRECCION']`

### <br >obtenerSobrantesIntercambiables(lotro, lodtimuz) 
dadas la lista de repuestos sobrantes de otro autobot **lotro** y las que a Odtimuz **lodtimuz** que le sobran, debe retornar el número de repuestos que se pueden intercambiar entre sí.

Ejemplo: si se tiene como entrada
<br >`lotro = ['EXPLORADORA', 'RUEDA', 'FRENOS', 'MOTOR', 'DIRECCION', 'CAJA']`
<br >`lodtimuz = ['SUSPENSION', 'RUEDA', 'CAJA', 'EMBRAGUE', 'PATIN']`

La función debe retornar: **3**.  Al otro le interesan 3 repuestos de Odtimuz. A Odtimuz, le interesan 4 repuestos del otro, luego podrían intercambiar máximo 3. Para que sea evaluada correctamente por Odtimuz, **la función debe retornar un Integer**.

## Entrada:

Este programa no requiere entrada. Ni generará salida. Se requiere que el estudiante genere un archivo con el nombre _Repuesto.java_ con la clase **Repuesto.java** y que definan los nombres de las funciones dadas y sus parámetros tal cual está especificado en el enunciado definiendo la clase Repuesto.
