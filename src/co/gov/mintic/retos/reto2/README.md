#Reto 2


##La Tienda Veterinaria Pooopis

El Dr. Stuart Pequeño quiere encomendarle el desarrollo de un pequeño demo de aplicación de la tienda y clínica veterinaria Pooopis.  Se desea hacer un registro de todas las mascotas que pasan por la clínica. Para ello se define una clase llamada Mascota. Una Mascota tiene nombre, peso, edad y documento del propietario. Se tienen dos tipos de mascota: Perro y Gato. Si es perrito, se debe identificar la marca de hueso que consume. Si es Gato se debe registrar inicialmente la marca de arena de gato que consume.

Considere la especificación del siguiente diagrama de clases para este reto:

<p align="center"><img src="src/co/gov/mintic/retos/reto2/Reto_2_UML.png" width="60%" height="60%"></p>

![Demo bonus part](src/co/gov/mintic/retos/reto2/Reto_2_UML.png)

###Procesar Comandos

En la clase MisClientes, se debe definir la función procesar comandos que realiza las siguientes operaciones:

####<br >Agregar Mascota: Opción 1

Se puede añadir un perrito el siguiente comando:

`1&Perro&nombre&peso&edadMeses&idDueño&marcaHueso`

Ejemplo:

`1&Perro&Max&12.3&48&18282727&Laikal`

Se puede añadir un gatico con el siguiente comando:

`1&Gato&nombre&peso&edadMeses&idDueño&marcaArena`

Ejemplo:

`1&Gato&Sam&4.1&26&1FB3CD&CanadaLitter`

####<br >Listar ítems del inventario: Opción 2

Se debe mostrar la frase: “***Clientes***” Seguida por las mascotas en el orden en el que fueron agregadas.

Si se trata de un Perro se mostrará así. Recuerde que `\t` implica correr el ítem unos espacios a la derecha:

```
Nombre: Max
    Peso: 12.3 kg
    edad: 48 meses
    documento: 18282727
    Marca hueso: Laikal
```
Si se trata de un Gato se mostrará así:

```
Nombre: Sam
    Peso: 4.1 kg
    edad: 26 meses
    documento: 1FB3CD
    Marca arena: CanadaLitter
```

####<br >Salir: Opción 3

**Nota 1**: Observe que el único comando que tiene salida es el listar.

**Nota 2**: En este ejercicio se requiere subir cuatro archivos.

- Uno correspondiente a las mascotas llamado _Mascota.java_,

- otro correspondiente a perros particular llamado _Perro.java_

- otro correspondiente a gatos llamado _Gato.java_

- otro correspondiente al inventario de Clientes llamado _MisClientes.java_ (aquí va el main)



Ejemplo:

Un ejemplo de ejecución del programa es el siguiente:

####Entrada

`1&Perro&Max&12.3&48&18282727&Laikal`
<br >`1&Gato&Sam&4.1&26&1FB3CD&CanadaLitter`
<br >`2`
<br >`3`

####Salida
```
***Clientes***                                                                
Nombre: Max                                                                     
    Peso: 12.3 kg                                                           
    edad: 48 meses                                                          
    documento: 18282727                                                     
    Marca hueso: Laikal                                                     
Nombre: Sam                                                                     
    Peso: 4.1 kg                                                            
    edad: 26 meses                                                          
    documento: 1FB3CD                                                       
    Marca arena: CanadaLitter