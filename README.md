# Conversor de Monedas - Java

![Conversor de Monedas](img/Conversor-Monedas-Banner.png)


## Descripción

Este proyecto permite al usuario realizar la conversión de monedas al tipo de cambio actualizado a la fecha, según las opciones propuestas en Menú.
Así mismo el usuario podrá solicitar se le muestre un historial con los tipos de cambio consultados.

El sistema:
- Muestra un menú con opciones de conversión de monedas.
- Obtiene los valores actualizados, del tipo de cambio,  de las monedas desde la API externa.
- Realiza la conversión de monedas previamente seleccionada por el usuario.
- Mantiene un historial de las conversiones realizadas, el cual puede ser consultado por el usuario, si así lo desea.

## Tecnologías Utilizadas

- Mac Os ![OS](https://img.shields.io/badge/mac%20os-000000?style=for-the-badge&logo=apple&logoColor=white)
- Intellij IDEA ver. 2024.1.1 ![IDE](https://img.shields.io/badge/IntelliJ_IDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)
- JDK de Java 21.0.2 ![JDK](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
- Biblioteca Gson 2.10.1
- ExchangeRate-API

    #### Notas:
    El sistema realiza una busqueda de los valores del tipo de cambio a través de una API externa.
    los cuales son instanciados a un gson, con el cual se manejan los datos para mostrar la conversión del tipo de cambio.
    Toda ves hecho lo anterior se van guardando las conversiones en un ArrayList para crear el historial de dichas conversiones. 
    Dicho historico solo es temporal, mientras el usuario permenece en el sistema y va realizando conversiones.
    Por otro lado se da formato de Fecha y moneda a las variables de los valores obtenidos, esto para que el usuario tenga un mejor experiencia visual de la información que se le presenta.
    En cuanto al menejo de errores, entre otros y no menos importante es cuando el usuario intenta ingresar un valor fuera de los contenidos en el menú. Indicandole al usuario de dicho error y permitiendo que siga con la conversión de otras monedas.



## Demostración del Sistema

Menú de inicio al sistema.
![Menu-inicio](img/01-Menu-Inicio.png)

Selección del Usuario, de moneda a convertir.
![Selec-User](img/02-Selecc-User.png)

Resultado de la conversión seleccionada.
![Result-Consulta](img/03-Result-Consult.png)

Segunda Conversion del usuario.
![Segunda-Consulta](img/04-2a-Consulta.png)

Resultado de la segunda Conversión.
![Resul-segunda-consulta](img/05-2do-Resultado.png)

Consulta al histórica de Conversiones.
![Consulta-Hostorico](img/06-Consulta-Historico.png)

Error al intentar ingresar un valor fuera del menú.
![Error-No-Admitido](img/07-Error-Valor-No-Admitido.png)

Salida y fin del sistema
![Salida](img/08-Salida.png)


## Estado del Proyecto

El proyecto se encuentra en su versión 1.0.0.

## Acceso al Proyecto

Puedes acceder al proyecto y obtener el código fuente desde su repositorio en [GitHub Conversor de monedas en Java](https://github.com/MAValerdi/Conversor-monedas-java).

## Instrucciones de Uso

1. Clona el repositorio desde GitHub.
2. Asegurate que el proyecto este en alguna ubicación en tu equipo local.
3. Importa el proyecto desde tu IDE Intellij IDEA o el IDE de tu preferencia.
4. Ejecuta la aplicación y sigue las instrucciones en pantalla.

## Autor
Mario Alberto Valerdi Garduño
[Linkedin Mario Valerdi](www.linkedin.com/in/mariovalerdi).


#### Anotaciones finales:
Challenge "CONVERSOR DE MONEDAS".
Del curso Java Orientado a Objetos
de ALURA Latam, Oracle ONE G6
