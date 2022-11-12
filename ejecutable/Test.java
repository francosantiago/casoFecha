package ejecutable;

import modelo.fecha;

public class Test 
{
    public static void main(String[] args) 
    {

        fecha f = new fecha(2,10,1970);
        f.setDia(2);
        f.setMes(10);
        f.setAnio(1970);

        System.out.println("Dia = " + f.getDia());
        System.out.println("Mes = " + f.getMes());
        System.out.println("Año = " + f.getAnio());
        System.out.println(f);
        
        fecha otra = new fecha(0,11,1990);
        otra.setDia(0);
        otra.setAnio(1990);
        otra.setMes(11);

        if (f.equals(otra))
        {
            System.out.println("Las fechas son iguales.");
        }
        else
        {
            System.out.println("Las fechas son diferentes.");
        }

        System.out.
        

    }
}
