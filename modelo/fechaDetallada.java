package modelo;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class fechaDetallada extends Fecha

{
    String MES[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    public void obtenerMesAño() 
    {
        anio = c1.get(Fecha.YEAR);
        mes = MES[c1.get(Fecha.MONTH)];
    }
}
