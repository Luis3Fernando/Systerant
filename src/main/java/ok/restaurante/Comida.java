package ok.restaurante;

import javax.swing.ImageIcon;

public class Comida {
    //ATRIBUTOS DE LOS PLATOS DE COMIDA
    private String nombre;
    private double precio = 0;
    private String descripcion;
    private ImageIcon imagen = new ImageIcon();
    
    Comida(){
        nombre = "Desconocido";
        precio = 0;
        descripcion = "Desconocido";
        imagen = new ImageIcon();
    }

    public Comida(String nombre, String descripcion, double precio, ImageIcon imagen) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.imagen = imagen;
    }
     
    
    public String getNombre() {
        return nombre;
    }
    
    /** El metodo set para nombre*/
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }
    
    /**
     *Descripcion: Funcion para asignar el precio al atributo precio
     * @param quantity Cantidad de dinero
     * @param currenty solo enteros
     * @return quantity  no devuelve nada
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }
    
    
}
