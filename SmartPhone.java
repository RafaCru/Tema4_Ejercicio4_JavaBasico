package EjercicioSesión4;

public class SmartPhone extends SmartDevice {

    //1. Attributes

    protected String generacion;//4G, 5G
    public String procedador;
    public int capacidad;//memoria 60Mb, 128Mb...
    public int ram;
    public int tamaño;// 6", 8"...
    public String camara;
    public boolean lectorhuellas;

    //2. Constructor
    public SmartPhone(){

    }
    public SmartPhone(String fabricante, String modelo, float precio, int añolanzamiento, String generacion, String procedador, int capacidad, int ram, int tamaño, String camara, boolean lectorhuellas) {
        super(fabricante, modelo, precio, añolanzamiento);
        this.generacion = generacion;
        this.procedador = procedador;
        this.capacidad = capacidad;
        this.ram = ram;
        this.tamaño = tamaño;
        this.camara = camara;
        this.lectorhuellas = lectorhuellas;

    }
    //3. metodos
}
