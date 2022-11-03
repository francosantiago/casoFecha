package ejecutable;

import modelo.fecha;

public class Test 
{
    public static void main(String[] args) 
    {

        fecha f = new fecha();
        f.setDia(2);
        f.setMes(10);
        f.setAnio(1970);

        System.out.println("Dia = " + f.getDia());
        System.out.println("Mes = " + f.getMes());
        System.out.println("Año = " + f.getAnio());
        System.out.println(f);
        
    }
}
