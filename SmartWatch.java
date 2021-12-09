package EjercicioSesión4;

public class SmartWatch extends SmartDevice {
    //1. Attributes
    public boolean FC; //Control frecuencia cardiaca
    public boolean pantallacolor;
    public int autonomia; //dias autonomia
    public String compatibilidad; //iphone, android
    //2. Constructor
    public SmartWatch (){

    }
    public SmartWatch(String fabricante, String modelo, float precio, int añolanzamiento, boolean FC, boolean pantallacolor, int autonomia, String compatibilidad) {
        super(fabricante, modelo, precio, añolanzamiento);
        this.FC = FC;
        this.pantallacolor = pantallacolor;
        this.autonomia = autonomia;
        this.compatibilidad = compatibilidad;
    }
}
