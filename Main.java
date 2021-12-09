package EjercicioSesión4;

/*Ejercicio Sesión 4*/

/* En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas:
SmartPhone y SmartWatch.

     1. Agregaréis atributos tal cual tendrían esos objetos en la realidad.
     2. Crear constructor vacío y con todos los parámetros para cada clase.
     3. Desde una clase Main: crearéis objetos de cada una y los utilizaréis
      para imprimir sus valores por consola.*/


public class Main {



        public static void main(String[] args) {
            SmartDevice xioami = new SmartDevice();
            SmartWatch foreruner = new SmartWatch("Garmin", "245", 145.50F, 2015, true, false, 7, "Android");
            SmartPhone xiominote = new SmartPhone("Xiomi", "Note9", 154.20f, 2020, "4G", "MediaTek Dimensity 700", 128, 4, 9, "Triple Cam 48 megapizxel", true);

            System.out.println(xioami);
            System.out.println(xiominote.fabricante +" "
                    + xiominote.añolanzamiento+" "
                    + xiominote.generacion+" "
                    + xiominote.modelo + " "
                    + xiominote.precio+" "
                    );

        }
    //Crear una clase smartDevice
    //Crear las clases hijas

    //SmartPhone
    //SmartWatch

    //Agregar atributos tal cual tendrian esos objetos en la realidad
    //Crear contructor vacio y con todo los parametros para cada clase
    // Desde una clasa Main: crear Objetos de cada una y utilizarlos para imprimir sus valores por consola.
    }

