package modelo;

public class FechaHora extends fechaDetallada
{
    private int hora;
    private int minuto;
    private int segundo;

    public FechaHora(String sFecha, int hora, int min, int seg)
    {
        super(sFecha);
        this.hora = hora;
        this.minuto = min;
        this.segundo = seg;
    }

    public String toString()
    {
        //Se invoca el metodo toString del padre
        return super.toString() + " (" + hora + ":" + minuto + ";" + segundo + ")";
    }
}   

