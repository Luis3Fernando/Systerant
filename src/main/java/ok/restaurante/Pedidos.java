    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ok.restaurante;

import javax.swing.ImageIcon;

/**
 *
 * @author Luis Fernando
 */
public class Pedidos {
    private static int n=0;
    private static Comida pedidosYA[] = new Comida[30];
	
	Pedidos() {
		
	}
	
	private void Campos() {
            if(n==0) {
		for(int i=0; i<30; i++) {
            	pedidosYA[i] = new Comida();
            }
	}
	}
			
	public void Añadir(Comida objeto) {
		Campos();
		pedidosYA[n] = objeto;
		n++;
	}
        
        public void Eliminar(int n){
            pedidosYA[n] = null;
        }
        
        
        
        public String getNombre(int n){
            
            return pedidosYA[n].getNombre();
        }
    
        public String getDescripcion(int n){
            return pedidosYA[n].getDescripcion();
        }
        public double getPrecio(int n){
            return pedidosYA[n].getPrecio();
        }
        public ImageIcon getImagen(int n){
            return pedidosYA[n].getImagen();
        }
        public int Numero_Elementos(){
            return n;
        }
        
	/*
	public int Buscar(String contra) {
            int j=0;
		int c=0;
		for (c=0; c<n; c++) {
			if(data[c].getContraseña().equalsIgnoreCase(contra)) {
				j=1;
				break;
			}
		}
		if(j==1) {
			u=c;
			return c;
		}
		else {
			return -1;
		}
	}
	
	public int Ubicacion() {
		return u;
	}
	
	private int Buscar_Destino(String numero) {
		int j=0;
		int c=0;
		for (c=0; c<n; c++) {
			if(data[c].getNumero_cuenta1().equalsIgnoreCase(numero)) {
				j=1;
				break;
			}
		}
		if(j==1) {
			d=c;
			return c;
		}
		else {
			return -1;
		}
	}*/
}
