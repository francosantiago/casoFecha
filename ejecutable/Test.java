package ejecutable;

import modelo.fecha;
import modelo.FechaHora;
import modelo.MuestraConjunto;
import modelo.fechaDetallada;

public class Test {
    public static void main(String[] args) {
        fecha f = new fecha(2, 10, 1970);
        System.out.println("Dia: " + f.getDia());
        System.out.println("Mes: " + f.getMes());
        System.out.println("Año: " + f.getAnio());
        System.out.println(f);

        fecha f2 = new fecha();
        System.out.println("Clase Fecha vacia: " + f2);

        fecha f3 = new fecha ("10/11/2022");
        System.out.println("Clase Fecha Tipo String: " + f3);

        fecha otra = new fecha(5, 5, 1995);
        otra.setDia(5);
        otra.setMes(5);
        otra.setAnio(1995);

        System.out.println(otra.equals(f));

        if (otra.equals(f) == false){
            System.out.println("Las dos fechas son diferentes");
        }

        if (otra.equals(f) == true) {
            System.out.println("Las dos fechas son iguales");
        }

        System.out.println("Punto 4");
        fecha f4 = new fecha("23/12/1980");
        f4.addDias(180);
        System.out.println(f4);

        Object[] arr = {new fecha(2,10,1970), new fechaDetallada(23,12,1948), new String("Esto es una cadena"), new Integer(34)};

        //Como el metodo es estático lo invocamos a través de la clase
        MuestraConjunto.mostrar(arr);

        FechaHora fh = new FechaHora(null, 14, 30, 10);
        System.out.println(fh);
    }
}
    