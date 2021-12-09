package EjercicioSesión4;

public class SmartDevice {
    //1. Attributes
    protected String fabricante;
    protected String modelo;
    protected int tamaño;//6", 8"
    protected float precio;
    protected int añolanzamiento;

    //2. Contractors
    public SmartDevice(){

    }

    public SmartDevice(String fabricante, String modelo, float precio, int añolanzamiento) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.precio = precio;
        this.añolanzamiento=añolanzamiento;
    }
//3.Methods
    public void oferta (int descuento){
        this.precio=this.precio-this.precio*descuento;
    }
}
