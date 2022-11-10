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

}