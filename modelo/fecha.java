package modelo;

public class fecha
{

    //ATRIBUTOS
    
    private int dia;
    private int mes;
    private int anio;

    //METODOS

    public fecha(int d, int m, int a)
    {

        this.dia = d;
        this.mes = m;
        this.anio = a;

    }

    //CONSTRUCTOR SIN PARAMETROS

    public fecha()
    {

        this.dia = 0;
        this.mes = 0;
        this.anio = 0;

    }

    //CONSTRUCTOR CON PARAMETROS DE STRING

    public fecha(String s)
    {
        //BUSCAMOS LA PRIMERA OCURRENCIA DE /
        int pos1 = s.indexOf('/');

        //BUSCAMOS LA ULTIMA OCURRENCIA DE /
        int pos2 = s.lastIndexOf('/');

        //EXTRAEMOS EL DIA
        String sDia = s.substring(0, pos1);
        dia = Integer.parseInt(sDia);

        //EXTRAEMOS EL MES
        String sMes = s.substring(pos1+1, pos2);
        mes = Integer.parseInt(sMes);

        //EXTRAEMOS EL AÑO
        String sAnio = s.substring(pos2+1);
        anio = Integer.parseInt(sAnio);

        

    }

    //METODOS DE ACCESO(setter y getter)

    public void setAnio(int anio) 
    {
        this.anio = anio;
    }
    
    public void setDia(int dia) 
    {
        this.dia = dia;
    }

    public void setMes(int mes) 
    {
        this.mes = mes;
    }

    public int getAnio() 
    {
        return anio;
    }

    public int getDia() 
    {
        return dia;
    }

    public int getMes() 
    {
        return mes;
    }

    //METODO SOBREESCRITO DE LA CLASE OBJECT

    public String toString()
    {
        return dia + "/" + mes + "/" + anio;
    }

    public boolean equals(Object obj)
    {
        fecha otra = (fecha)obj;
        return (dia==otra.dia) && (mes==otra.mes) && (anio==otra.anio);
    }

    public void addDIas(int d)
    {
        
    }

    private int fechaToDias()
    {
        return
    }

    private void diasToFecha(int i)
    {

    }
}