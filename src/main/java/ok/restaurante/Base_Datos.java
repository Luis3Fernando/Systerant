package ok.restaurante;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;

public class Base_Datos{
    
    public static Platos platos[] = new Platos[54];
    public static Postres postres[] = new Postres[21];
    public static Bebidas bebidas[] = new Bebidas[19];
    public static int p=0, po=0, b=0;
    
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    
    protected void Generando_Campos_Platos(){
        if(p==0){
            for(int i=0; i<54; i++){
            platos[i] = new Platos();
            
            }
            p++;
        }
    }
    
     protected void Generando_Campos_Postres(){
        if(po==0){
            for(int i=0; i<21; i++){
            postres[i] = new Postres();
            }
            po++;
        }
         
    }
    
    protected void Generando_Campos_Bebidas(){
        if(b==0){
           for(int i=0; i<19; i++){
            bebidas[i] = new Bebidas();
            }
           b++;
        }
        
    } 
     
    public void Almacenando_Datos_Platos(){
        Generando_Campos_Platos();
        
        for(int i=0; i<54; i++){
            platos[i].setNombre(ok(i));
            platos[i].setPrecio(ok1(i));
            platos[i].setDescripcion(ok2(i));
            platos[i].setImagen(ok3(i));
        }
  
    }
    
    public void Almacenando_Datos_Postres(){
        
      for(int i=0; i<21; i++){
            postres[i].setNombre(ok(i));
            postres[i].setPrecio(ok1(i));
            postres[i].setDescripcion(ok2(i));
            postres[i].setImagen(ok3(i));
        }
    }
    
    public void Almacenando_Datos_Bebidas(){
        for(int i=0; i<19; i++){
            bebidas[i].setNombre(ok(i));
            bebidas[i].setPrecio(ok1(i));
            bebidas[i].setDescripcion(ok2(i));
            bebidas[i].setImagen(ok3(i));
        }
        
        
    }   
    
    
    //PLATOS
    public String getNombrePlatos(int n){
        Almacenando_Datos_Platos();
        return platos[n].getNombre();
    }
    
    public String getDescripcionPlatos(int n){
        Almacenando_Datos_Platos();
        return platos[n].getDescripcion();
    }
    public double getPrecioPlatos(int n){
        Almacenando_Datos_Platos();
        return platos[n].getPrecio();
    }
    public ImageIcon getImagenPlatos(int n){
        Almacenando_Datos_Platos();
        return platos[n].getImagen();
    }
    public Platos getObjetoPlatos(int n){
        return platos[n];
    }
    
    //POSTRES
    public String getNombrePostres(int n){
        Almacenando_Datos_Postres();
        return postres[n].getNombre();
    }
    
    public String getDescripcionPostres(int n){
        Almacenando_Datos_Postres();
        return postres[n].getDescripcion();
    }
    public double getPrecioPostres(int n){
        Almacenando_Datos_Postres();
        return postres[n].getPrecio();
    }
    public ImageIcon getImagenPostres(int n){
        Almacenando_Datos_Postres();
        return postres[n].getImagen();
    }
    public Postres getObjetoPostre(int n){
        return postres[n];
    }
    
    
    //BEBIDAS
    public String getNombreBebidas(int n){
        Almacenando_Datos_Bebidas();
        return bebidas[n].getNombre();
    }
    
    public String getDescripcionBebidas(int n){
        Almacenando_Datos_Bebidas();
        return bebidas[n].getDescripcion();
    }
    public double getPrecioBebidas(int n){
        Almacenando_Datos_Bebidas();
        return bebidas[n].getPrecio();
    }
    public ImageIcon getImagenBebidas(int n){
        Almacenando_Datos_Bebidas();
        return bebidas[n].getImagen();
    }
    public Bebidas getObjetoBebida(int n){
        return bebidas[n];
    }
    
    
    public String ok(int id){
       String cl = new String();
       String sql = "SELECT * FROM platos  WHERE Id = ?";
       try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           ps.setInt(1, id);
           rs = ps.executeQuery();
           cl = rs.getString("Nombre");
           /*if (rs.next()) {
               cl.setId(rs.getInt("id"));
               cl.setNombre(rs.getString("nombre"));
               cl.setTelefono(rs.getString("telefono"));
               cl.setDireccion(rs.getString("direccion"));
           }*/
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return cl;
   } 
    public int ok1(int id){
       String cl = new String();
       int n=0;
       String sql = "SELECT * FROM platos  WHERE Id = ?";
       try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           ps.setInt(1, id);
           rs = ps.executeQuery();
           cl = rs.getString("Precio");
           /*if (rs.next()) {
               cl.setId(rs.getInt("id"));
               cl.setNombre(rs.getString("nombre"));
               cl.setTelefono(rs.getString("telefono"));
               cl.setDireccion(rs.getString("direccion"));
           }*/
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       
       n = Integer.parseInt(cl);
       return n;
   }
    public String ok2(int id){
       String cl = new String();
       String sql = "SELECT * FROM platos  WHERE Id = ?";
       try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           ps.setInt(1, id);
           rs = ps.executeQuery();
           cl = rs.getString("Descripcion");
           /*if (rs.next()) {
               cl.setId(rs.getInt("id"));
               cl.setNombre(rs.getString("nombre"));
               cl.setTelefono(rs.getString("telefono"));
               cl.setDireccion(rs.getString("direccion"));
           }*/
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return cl;
   }
    
    public ImageIcon ok3(int id){
       String cl = new String();
       ImageIcon c = new ImageIcon("ds");
       String sql = "SELECT * FROM platos  WHERE Id = ?";
       try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           ps.setInt(1, id);
           rs = ps.executeQuery();
           cl  = rs.getString("Imagen");
           /*if (rs.next()) {
               cl.setId(rs.getInt("id"));
               cl.setNombre(rs.getString("nombre"));
               cl.setTelefono(rs.getString("telefono"));
               cl.setDireccion(rs.getString("direccion"));
           }*/
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return c;
   }
    
}
