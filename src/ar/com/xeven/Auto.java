package ar.com.xeven;
//De cada auto, necesito conocer la marca, año, modelo, precio.
public class Auto {
    private String marca;
    private String modelo;
    private Integer anio;
    private Double precio;

    public Auto(String marca, String modelo, Integer anio, Double precio){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
    }

    public void setPrecio(Double precio){
        this.precio = precio;
    }

    public String getMarca(){
        return marca;
    }
    public Integer getAnio(){
        return anio;
    }
    public String getModelo(){
        return modelo;
    }
    public Double getPrecio(){
        return precio;
    }

    public String fichaTecnica(){
        return marca+" "+modelo+" ("+anio+"): $"+precio;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                ", precio=" + precio +
                '}';
    }
}
