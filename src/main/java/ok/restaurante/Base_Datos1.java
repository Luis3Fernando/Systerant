package ok.restaurante;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;

public class Base_Datos1 {
    
    public static Platos platos[] = new Platos[54];
    public static Postres postres[] = new Postres[21];
    public static Bebidas bebidas[] = new Bebidas[19];
    public static int p=0, po=0, b=0;

    
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
        
        /*String sql = "SELECT * FROM platos WHERE Id = 1";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            platos[1].setNombre(rs.getString("Nombre"));
            
        } catch (SQLException e) {
            System.out.println(e.toString());
        }*/

        
        platos[0].setNombre("CEVICHE");
        platos[0].setPrecio(28);
        platos[0].setDescripcion("Plato típico del Perú\n Si estas de visita debes probarlo");
        platos[0].setImagen(new ImageIcon("src\\main\\java\\Platos\\ceviche.jpg"));
        
        platos[1].setNombre("LOMO SALTADO");
        platos[1].setPrecio(39);
        platos[1].setDescripcion("El lomo saltado forma parte de la gastronomía peruana y es uno de los platos bandera a nivel nacional");
        platos[1].setImagen(new ImageIcon("src\\main\\java\\Platos\\lomo_saltado.png"));
        //file:/C:/Users/Luis%20Fernando/Documents/Unamba/Ciclo%204/Desarrolllo%20de%20Software/SYSTERANT/RESTAURANTE/src/main/java/Platos/ceviche.jpg

        platos[2].setNombre("PAPA A LA HUANCAINA");
        platos[2].setPrecio(13);
        platos[2].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[2].setImagen(new ImageIcon("src\\main\\java\\Platos\\papa_a_la_huancaina.jpg"));

        platos[3].setNombre("AJI DE GALLINA");
        platos[3].setPrecio(19);
        platos[3].setDescripcion("El ají de gallina es uno de los platos bandera en la cocina peruana.");
        platos[3].setImagen(new ImageIcon("src\\main\\java\\Platos\\aji_gallina.jpg"));

        platos[4].setNombre("ARROZ CON POLLO");
        platos[4].setPrecio(19);
        platos[4].setDescripcion("El arroz con pollo es uno de los platos típicos de la gastronomía peruana.");
        platos[4].setImagen(new ImageIcon("src\\main\\java\\Platos\\arroz_con_pollo.jpg"));

        platos[5].setNombre("CAUSA LIMEÑA");
        platos[5].setPrecio(25);
        platos[5].setDescripcion("La causa rellena de pollo es un plato de origen peruano muy versátil el cual podemos variar dependiendo el insumo.");
        platos[5].setImagen(new ImageIcon("src\\main\\java\\Platos\\causa_limeña.jpg"));

        platos[6].setNombre("ROCOTO RELLENO");
        platos[6].setPrecio(20);
        platos[6].setDescripcion("El rocoto relleno arequipeño es un plato insignia del Perú.");
        platos[6].setImagen(new ImageIcon("src\\main\\java\\Platos\\rocoto_relleno.jpg"));

        platos[7].setNombre("SECO A LA NORTEÑA");
        platos[7].setPrecio(15);
        platos[7].setDescripcion("El seco a la norteña es uno de los platos bandera de la gastronomía peruana.");
        platos[7].setImagen(new ImageIcon("src\\main\\java\\Platos\\seco_a_la_norteña.jpg"));

        platos[8].setNombre("ESTOFADO DE POLLO");
        platos[8].setPrecio(16);
        platos[8].setDescripcion("El estofado de pollo es uno de los platos mas representativos en la gastronomía peruana.");
        platos[8].setImagen(new ImageIcon("src\\main\\java\\Platos\\estofado_de_pollo.jpg"));

        platos[9].setNombre("ARROZ CHAUFA");
        platos[9].setPrecio(17);
        platos[9].setDescripcion("El arroz chaufa es uno de los platos que se supo ganar el aprecio de todos los peruanos.");
        platos[9].setImagen(new ImageIcon("src\\main\\java\\Platos\\arroz_chaufa.jpg"));

        platos[10].setNombre("PARIHUELA DE MARISCOS");
        platos[10].setPrecio(30);
        platos[10].setDescripcion("La parihuela de mariscos es una sopa de pescado, un plato tradicional en la gastronomía peruana.");
        platos[10].setImagen(new ImageIcon("src\\main\\java\\Platos\\parihuela_de_mariscos.jpg"));

        platos[11].setNombre("RACHI");
        platos[11].setPrecio(20);
        platos[11].setDescripcion("El rachi es un plato típico de la gastronomía peruana.");
        platos[11].setImagen(new ImageIcon("src\\main\\java\\Platos\\rachi.jpg"));

        platos[12].setNombre("POLLO AL LIMON");
        platos[12].setPrecio(19);
        platos[12].setDescripcion("El pollo al limón es un plato típico de la cocina peruana y forma parte de los platos cítricos bandera de nuestra gastronomía.");
        platos[12].setImagen(new ImageIcon("src\\main\\java\\Platos\\pollo_al_limon.jpg"));

        platos[13].setNombre("TALLARIN SALTADO");
        platos[13].setPrecio(30);
        platos[13].setDescripcion("El tallarín saltado de pollo es la combinación de la pasta con nuestro plato bandera el lomo saltado.");
        platos[13].setImagen(new ImageIcon("src\\main\\java\\Platos\\tallarin_saltado_de_pollo.jpg"));

        platos[14].setNombre("ARROZ A LA JARDINERA");
        platos[14].setPrecio(45);
        platos[14].setDescripcion("El arroz a la jardinera es un plato muy conocido en Perú.");
        platos[14].setImagen(new ImageIcon("src\\main\\java\\Platos\\arroz_a_la_jardinera.jpg"));

        platos[15].setNombre("CHICHAROON DE PESCADO");
        platos[15].setPrecio(36);
        platos[15].setDescripcion("El chicharrón de pescado forma parte de la gastronomía marina del Perú.");
        platos[15].setImagen(new ImageIcon("src\\main\\java\\Platos\\chicharron_de_pescado.jpg"));

        platos[16].setNombre("MONDONGUITO ITALIANO");
        platos[16].setPrecio(21);
        platos[16].setDescripcion("El mondonguito a la italiana es un plato creado a fines del siglo XIX por la influencia de los italianos que llegaron a Perú.");
        platos[16].setImagen(new ImageIcon("src\\main\\java\\Platos\\mondonguito_a_la_italiana.jpg"));

        platos[17].setNombre("BISTECK A LO POBRE");
        platos[17].setPrecio(25);
        platos[17].setDescripcion("La receta de bistec a lo pobre es uno de los favoritos en la mesa peruana.");
        platos[17].setImagen(new ImageIcon("src\\main\\java\\Platos\\bistec_a_lo_pobre.jpg"));

        platos[18].setNombre("HIGADO EMPANIZADO");
        platos[18].setPrecio(15);
        platos[18].setDescripcion("El hígado empanizado es un alimento delicioso y alto en vitaminas muy recomendado para pequeños y adultos.");
        platos[18].setImagen(new ImageIcon("src\\main\\java\\Platos\\higado_empanizado.jpg"));

        platos[19].setNombre("POLLO AL MANI");
        platos[19].setPrecio(36);
        platos[19].setDescripcion("Pollo al maní, deliciosa receta peruana que no debe faltar en la mesa.");
        platos[19].setImagen(new ImageIcon("src\\main\\java\\Platos\\pollo_al_mani.jpg"));

        platos[20].setNombre("ESCABECHE DE POLLO");
        platos[20].setPrecio(15);
        platos[20].setDescripcion("El escabeche de pollo es un plato típico de la gastronomía peruana el cual tuvo presencia en la época del virreinato.");
        platos[20].setImagen(new ImageIcon("src\\main\\java\\Platos\\escabeche_de_pollo.jpg"));

        platos[21].setNombre("ASADO DE PAVITA");
        platos[21].setPrecio(18);
        platos[21].setDescripcion("Se caracteriza por tener poca grasa y bajo nivel de colesterol.");
        platos[21].setImagen(new ImageIcon("src\\main\\java\\Platos\\asado_de_pavita.png"));

        platos[22].setNombre("PICANTE DE POLLO");
        platos[22].setPrecio(24);
        platos[22].setDescripcion("Una exquisita comida a base de pollo que ha pasado entre generaciones durante mucho tiempo.");
        platos[22].setImagen(new ImageIcon("src\\main\\java\\Platos\\picante_de_pollo.jpg"));

        platos[23].setNombre("CHUPE DE OLLUCO");
        platos[23].setPrecio(28);
        platos[23].setDescripcion("Te hablamos de un potaje increible a base de diversas verduras dejando como protagonista del plato al olluco.");
        platos[23].setImagen(new ImageIcon("src\\main\\java\\Platos\\chupe_de_olluco.jpg"));

        platos[24].setNombre("TACACHO CON CESINA");
        platos[24].setPrecio(32);
        platos[24].setDescripcion("Unos de los platos representativos de la amazonia peruana, una delicia preparada en todo el Perú.");
        platos[24].setImagen(new ImageIcon("src\\main\\java\\Platos\\tacacho_con_cecina.jpg"));

        platos[25].setNombre("CHICHARRON DE POTA");
        platos[25].setPrecio(35);
        platos[25].setDescripcion("El chicharrón de pota es uno de los manjares marinos que tiene el Perú.");
        platos[25].setImagen(new ImageIcon("src\\main\\java\\Platos\\chicharron_de_pota.jpg"));

        platos[26].setNombre("JAUNE DE GALLINA");
        platos[26].setPrecio(26);
        platos[26].setDescripcion("El juane de gallina es uno de los platos representativos de la amazonia peruana.");
        platos[26].setImagen(new ImageIcon("src\\main\\java\\Platos\\juane_de_gallina.jpg"));

        platos[27].setNombre("CHANCHO CON PIÑA");
        platos[27].setPrecio(25);
        platos[27].setDescripcion("El chancho con piña es uno de los platos con mayor demanda en los chifas peruanos.");
        platos[27].setImagen(new ImageIcon("src\\main\\java\\Platos\\chancho_con_piña.png"));

        platos[28].setNombre("ARROZ CON PATO");
        platos[28].setPrecio(15);
        platos[28].setDescripcion("El arroz con pato proviene de la región de Lambayeque en Perú.");
        platos[28].setImagen(new ImageIcon("src\\main\\java\\Platos\\arroz_con_pato.jpg"));

        platos[29].setNombre("GUIZO DE GARBANZOS");
        platos[29].setPrecio(13);
        platos[29].setDescripcion("Guiso de garbanzos receta peruana que no puede faltar en la mesa.");
        platos[29].setImagen(new ImageIcon("src\\main\\java\\Platos\\guizo_de_garbanzos.jpg"));

        platos[30].setNombre("PATITA CON MANI");
        platos[30].setPrecio(16);
        platos[30].setDescripcion("Las patas contienen propiedades gelatinosas el cual aporta energía sin riego a incrementar el colesterol.");
        platos[30].setImagen(new ImageIcon("src\\main\\java\\Platos\\patita_con_mani.jpg"));

        platos[31].setNombre("LENTEJAS");
        platos[31].setPrecio(17);
        platos[31].setDescripcion("Las lentejas con pollo es un tipo de preparación culinaria estofada.");
        platos[31].setImagen(new ImageIcon("src\\main\\java\\Platos\\lentejas_con_pollo.jpg"));

        platos[32].setNombre("INCHICAPI DE GALLINA");
        platos[32].setPrecio(22);
        platos[32].setDescripcion("Inchicapi de gallina o sopa de maní es un platillo muy rico de la selva amazónica.");
        platos[32].setImagen(new ImageIcon("src\\main\\java\\Platos\\inchicapi_de_gallina.jpg"));

        platos[33].setNombre("PALLARES CON SECO");
        platos[33].setPrecio(25);
        platos[33].setDescripcion("Los pallares con seco de pollo forman parte de nuestra gastronomía peruana.");
        platos[33].setImagen(new ImageIcon("src\\main\\java\\Platos\\pallares_con_seco_de_carne.jpg"));

        platos[34].setNombre("CUY CHACTADO");
        platos[34].setPrecio(45);
        platos[34].setDescripcion("Este plato se origina en la región de Cajamarca y posteriormente se expande por todo el Perú.");
        platos[34].setImagen(new ImageIcon("src\\main\\java\\Platos\\cuy_chactado.jpg"));

        platos[35].setNombre("POLLO CHIJAUKAY");
        platos[35].setPrecio(21);
        platos[35].setDescripcion("Pollo chijaukay es un plato chino-peruano resultado de la fusión de ambas gastronomías durante la inmigración china al Perú.");
        platos[35].setImagen(new ImageIcon("src\\main\\java\\Platos\\pollo_chijaukay.jpg"));

        platos[36].setNombre("AJI DE COCONA");
        platos[36].setPrecio(26);
        platos[36].setDescripcion("El ají de cocona es consumido como acompañamiento de distintos platillos de la selva.");
        platos[36].setImagen(new ImageIcon("src\\main\\java\\Platos\\aji_de_cocona.jpg"));

        platos[37].setNombre("MAJADO DE YUCA");
        platos[37].setPrecio(27);
        platos[37].setDescripcion("Se dice de este plato que es el \"primo\" del seco de chabelos, que lleva plátano maduro machacado y una proteína.");
        platos[37].setImagen(new ImageIcon("src\\main\\java\\Platos\\majado_de_yuca.jpg"));

        platos[38].setNombre("CAU CAU MONDONGO");
        platos[38].setPrecio(16);
        platos[38].setDescripcion("Este popular guiso se caracteriza por el toque a hierbabuena y el color amarillo que da el siempre protagonista ají amarillo.");
        platos[38].setImagen(new ImageIcon("src\\main\\java\\Platos\\cau_cau_de_mondongo.jpg"));

        platos[39].setNombre("AGÜADITO DE POLLO");
        platos[39].setPrecio(19);
        platos[39].setDescripcion("La receta está hecha a base de caldo, pollo y arroz, pero lleva muchas verduras.");
        platos[39].setImagen(new ImageIcon("src\\main\\java\\Platos\\aguadito_de_pollo.jpg"));

        platos[40].setNombre("POLLO AL SILLAO");
        platos[40].setPrecio(24);
        platos[40].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[40].setImagen(new ImageIcon("src\\main\\java\\Platos\\pollo_al_sillao.jpg"));

        platos[41].setNombre("SALTADO DE POLLO");
        platos[41].setPrecio(25);
        platos[41].setDescripcion("Se trata de un guiso de carne molida al sillao con choclo peruano muy sencillo y práctica de hacer.");
        platos[41].setImagen(new ImageIcon("src\\main\\java\\Platos\\saltado_de_pollo_con_holantao.jpg"));

        platos[42].setNombre("MARISCO NORTEÑO");
        platos[42].setPrecio(30);
        platos[42].setDescripcion("El majarisco es una de las recetas más tradicionales del norte de Perú.");
        platos[42].setImagen(new ImageIcon("src\\main\\java\\Platos\\mariscos_norteño.jpg"));

        platos[43].setNombre("OLLUQUITO CON POLLO");
        platos[43].setPrecio(15);
        platos[43].setDescripcion("El olluco peruano es un tubérculo con muchas propiedades beneficiosas para el organismo.");
        platos[43].setImagen(new ImageIcon("src\\main\\java\\Platos\\olluquito_de_pollo.jpg"));

        platos[44].setNombre("ARROZ TAPADO");
        platos[44].setPrecio(35);
        platos[44].setDescripcion("Consiste en una especie de pastel con una capa de arroz.");
        platos[44].setImagen(new ImageIcon("src\\main\\java\\Platos\\arroz_tapado.jpg"));

        platos[45].setNombre("CHUPE DE MARISCOS");
        platos[45].setPrecio(20);
        platos[45].setDescripcion("Este chupe de mariscos está hecho a base de una variedad de frutos del mar.");
        platos[45].setImagen(new ImageIcon("src\\main\\java\\Platos\\chupe_de_camarones.jpg"));

        platos[46].setNombre("CAUSA LIMEÑA");
        platos[46].setPrecio(15);
        platos[46].setDescripcion("Esta rica causa es un jugoso y sustancioso plato.");
        platos[46].setImagen(new ImageIcon("src\\main\\java\\Platos\\causa_limeña.jpg"));

        platos[47].setNombre("CARAPULCRA LIMEÑA");
        platos[47].setPrecio(23);
        platos[47].setDescripcion("Este delicioso plato está hecho a base de papa deshidratada con un típico aderezo de ají panca y cebolla roja.");
        platos[47].setImagen(new ImageIcon("src\\main\\java\\Platos\\carapulcra_limeña.jpg"));

        platos[48].setNombre("LOMO NEGRO");
        platos[48].setPrecio(25);
        platos[48].setDescripcion("A este plato, los venezolanos solemos llamarlo cariñosamente “Asado”.");
        platos[48].setImagen(new ImageIcon("src\\main\\java\\Platos\\lomo_negro.jpg"));

        platos[49].setNombre("SOLTERO DE QUESO");
        platos[49].setPrecio(25);
        platos[49].setDescripcion("Se trata de una ensalada que forma parte de los platos típicos de de Arequipa.");
        platos[49].setImagen(new ImageIcon("src\\main\\java\\Platos\\soltero_de_queso.jpg"));

        platos[50].setNombre("ALBONDIGAS DE CARNE");
        platos[50].setPrecio(23);
        platos[50].setDescripcion("La carne molida es rica en vitaminas y tenemos la opción de poder reforzarla a nuestro gusto.");
        platos[50].setImagen(new ImageIcon("src\\main\\java\\Platos\\albondigas_de_carne.jpg"));

        platos[51].setNombre("TALLARINES ROJOS");
        platos[51].setPrecio(24);
        platos[51].setDescripcion("Los tallarines rojos son uno de los platos más comunes en los hogares peruanos.");
        platos[51].setImagen(new ImageIcon("src\\main\\java\\Platos\\tallarines_rojos.jpg"));

        platos[51].setNombre("MALARRABIA NORTEÑA");
        platos[51].setPrecio(17);
        platos[51].setDescripcion("Este potaje, servido normalmente como guarnición, esta hecho a base de plátano hervido.");
        platos[51].setImagen(new ImageIcon("src\\main\\java\\Platos\\malarrabia_norteña.jpg"));

        platos[52].setNombre("TALLARINES VERDES");
        platos[52].setPrecio(30);
        platos[52].setDescripcion("Este plato es una variante de la conocida pasta al pesto y puede realizarse con cualquier tipo de pasta larga.");
        platos[52].setImagen(new ImageIcon("src\\main\\java\\Platos\\tallarines_verdes.jpg"));

        platos[53].setNombre("FREJOL CON SECO");
        platos[53].setPrecio(14);
        platos[53].setDescripcion("Los frejoles con seco forma parte de la gastronomía peruana.");
        platos[53].setImagen(new ImageIcon("src\\main\\java\\Platos\\frejol_con_seco.jpg"));

  
    }
    
    public void Almacenando_Datos_Postres(){
        Generando_Campos_Postres();
        postres[0].setNombre("ARROZ CON LECHE");
        postres[0].setPrecio(6);
        postres[0].setDescripcion("El arroz con leche es un postre tradicional que se disfruta en cada hogar de Perú.");
        postres[0].setImagen(new ImageIcon("src\\main\\java\\Postres\\arroz-con-leche.jpg"));
        
        postres[1].setNombre("MAZAMORRA MORADA");
        postres[1].setPrecio(6);
        postres[1].setDescripcion("La mazamorra morada es uno de los postres más populares de Perú.");
        postres[1].setImagen(new ImageIcon("src\\main\\java\\Postres\\mazamorra_morada.jpg"));
        
        postres[2].setNombre("MAZAMORRA DE CALABAZA");
        postres[2].setPrecio(8);
        postres[2].setDescripcion("La mazamorra de calabaza, también conocida como dulce de Chiclayo.");
        postres[2].setImagen(new ImageIcon("src\\main\\java\\Postres\\mazamorra_de_calabaza.jpg"));
        
        postres[3].setNombre("CHOCOTEJAS");
        postres[3].setPrecio(7);
        postres[3].setDescripcion("Se trata de un delicioso bombón, típico del Perú, cuya característica más resaltable son sus rellenos.");
        postres[3].setImagen(new ImageIcon("src\\main\\java\\Postres\\chocotejas.jpg"));
        
        postres[4].setNombre("CHURROS");
        postres[4].setPrecio(8);
        postres[4].setDescripcion("Este dulce, delicioso, apetitoso, sencillo y ligero.");
        postres[4].setImagen(new ImageIcon("src\\main\\java\\Postres\\churros.jpg"));
        
        postres[5].setNombre("LECHE ASADA");
        postres[5].setPrecio(12);
        postres[5].setDescripcion("Es muy parecido a un flan o quesillo en textura y tiene un sabor muy suave.");
        postres[5].setImagen(new ImageIcon("src\\main\\java\\Postres\\leche_asada.jpg"));
        
        postres[6].setNombre("PASTEL DE CHOCLO");
        postres[6].setPrecio(6);
        postres[6].setDescripcion("El pastel de choclo o queque de choclo puede ser dulce o salado, este ultimo va relleno con carne.");
        postres[6].setImagen(new ImageIcon("src\\main\\java\\Postres\\pastel_de_choclo.jpg"));
        
        postres[7].setNombre("BUDIN DE PAN");
        postres[7].setPrecio(7);
        postres[7].setDescripcion("El budín de pan casero también tiene fama de ser un postre para gente mayor, y es que a los niños no suele gustarles mucho.");
        postres[7].setImagen(new ImageIcon("src\\main\\java\\Postres\\budin_de_pan.jpg"));
        
        postres[8].setNombre("TORTILLA DE COLIFLOR");
        postres[8].setPrecio(6);
        postres[8].setDescripcion("La tortilla de coliflor y cebolla, debido a su contenido en huevo, aporta proteínas de alto valor biológico que evitarán la pérdida de masa muscular.");
        postres[8].setImagen(new ImageIcon("src\\main\\java\\Postres\\tortilla_de_coliflor.jpg"));
        
        postres[9].setNombre("PIE DE LIMON");
        postres[9].setPrecio(7);
        postres[9].setDescripcion("Este postre se caracteriza por un sabor muy dulce pero no empalagoso.");
        postres[9].setImagen(new ImageIcon("src\\main\\java\\Postres\\pie_de_limon.jpg"));
        
        postres[10].setNombre("PAN DE AVENA");
        postres[10].setPrecio(5);
        postres[10].setDescripcion("Tiene una gran cantidad de fibra en su composición, es por eso que mejora el tránsito intestina.");
        postres[10].setImagen(new ImageIcon("src\\main\\java\\Postres\\pan_de_avena.jpg"));
        
        postres[11].setNombre("LECHE ASADA AL BAÑO MARIA");
        postres[11].setPrecio(13);
        postres[11].setDescripcion(" La leche asada peruana, a diferencia de postres similares como el flan o la crema volteada, no lleva caramelo y no se desmolda.");
        postres[11].setImagen(new ImageIcon("src\\main\\java\\Postres\\leche_asada_al_baño_maria.jpg"));
        
        postres[12].setNombre("CHIFON DE CHOCOLATE");
        postres[12].setPrecio(4);
        postres[12].setDescripcion("Este bizcocho marmolado casero está hecho a base de claras de huevo y precisamente esto es lo que hace especial a los conocidos como chiffon cake.");
        postres[12].setImagen(new ImageIcon("src\\main\\java\\Postres\\chiffon_de_chocolate.jpg"));
        
        postres[13].setNombre("ALFAJORES HELADOS");
        postres[13].setPrecio(8);
        postres[13].setDescripcion("Los alfajores son unas galletas que se deshacen en la boca y son muy populares en Latinoamérica especialmente en países como Argentina y Perú.");
        postres[13].setImagen(new ImageIcon("src\\main\\java\\Postres\\alfajores_helados.jpg"));
        
        postres[14].setNombre("PASTEL HELADO DE LIMON");
        postres[14].setPrecio(9);
        postres[14].setDescripcion("Este sencillo y delicioso Postre helado de limón se preparaDA con Leche condensada, leche evaporada y Galletas maría.");
        postres[14].setImagen(new ImageIcon("src\\main\\java\\Postres\\pastel_de_limon_helado.jpg"));
        
        postres[15].setNombre("QUESO HELADO AREQUIPEÑO");
        postres[15].setPrecio(10);
        postres[15].setDescripcion(" Este exquisito helado que, contrario a lo que pudiera pensarse por su nombre, no incluye queso entre sus ingredientes, posee una textura muy parecida a las lascas de queso.");
        postres[15].setImagen(new ImageIcon("src\\main\\java\\Postres\\queso_helado.jpg"));
        
        postres[16].setNombre("TAMALES CRIOLLOS");
        postres[16].setPrecio(3);
        postres[16].setDescripcion("El tamal es el nombre genérico que se le da a un guiso de masa, que puede ser de diferentes carnes o verduras u hojas, con salsas o moles variadas; dulces o salados.");
        postres[16].setImagen(new ImageIcon("src\\main\\java\\Postres\\tamales_criollos.jpg"));
        
        postres[17].setNombre("CREMA VOLTEADA");
        postres[17].setPrecio(7);
        postres[17].setDescripcion("Consiste en una crema delicada de leche y azúcar que tiene una contextura firme gracias a la coagulación de los huevos. ");
        postres[17].setImagen(new ImageIcon("src\\main\\java\\Postres\\crema_volteada.jpg"));
        
        postres[18].setNombre("MAZAMORRA DE CHANCACA");
        postres[18].setPrecio(9);
        postres[18].setDescripcion("La mazamorra de chancaca es un postre tradicional de la gastronomía peruana.");
        postres[18].setImagen(new ImageIcon("src\\main\\java\\Postres\\mazamorra_de_chancaca.jpg"));
        
        postres[19].setNombre("SUSPIRO A LA LIMEÑA");
        postres[19].setPrecio(14);
        postres[19].setDescripcion("También conocido como Suspiro Limeño, esta delicia está en el top de los postres más dulces que he probado.");
        postres[19].setImagen(new ImageIcon("src\\main\\java\\Postres\\suspiro_a_la_limeña.jpg"));
        
        postres[20].setNombre("EMPANA DE CARNE");
        postres[20].setPrecio(5);
        postres[20].setDescripcion("La Empanada es un aperitivo muy particular en casi toda América Latina.");
        postres[20].setImagen(new ImageIcon("src\\main\\java\\Postres\\empanada_de_carne.jpg"));
      
    }
    
    public void Almacenando_Datos_Bebidas(){
        Generando_Campos_Bebidas();
        bebidas[0].setNombre("LIMONADA  FROZEN");
        bebidas[0].setPrecio(24);
        bebidas[0].setDescripcion("La Limonada frozen por las múltiples vitaminas que aporta con la vitamina C fortalece nuestro sistema digestivo.");
        bebidas[0].setImagen(new ImageIcon("src\\main\\java\\Bebida\\limonada_frozen.jpg"));
        
        bebidas[1].setNombre("CHICHA MORADA");
        bebidas[1].setPrecio(12);
        bebidas[1].setDescripcion("Está hecha a base de maíz, un insumo bastante identificado con la gastronomía de este país.");
        bebidas[1].setImagen(new ImageIcon("src\\main\\java\\Bebida\\chicha_morada.jpg"));
        
        bebidas[2].setNombre("SIDRA CON ESPECIAS");
        bebidas[2].setPrecio(32);
        bebidas[2].setDescripcion("El aroma de esta bebida es una de sus mayores cualidades, además de representar una alternativa para climas fríos.");
        bebidas[2].setImagen(new ImageIcon("src\\main\\java\\Bebida\\sidra_con_especias.jpg"));
        
        bebidas[3].setNombre("BATIDO DE LIMON");
        bebidas[3].setPrecio(18);
        bebidas[3].setDescripcion("Esta vez, un batido de limón, muy sencillo de preparar y con sólo tres ingredientes, la leche que nos aportará calcio, grasa, proteínas, vitaminas.");
        bebidas[3].setImagen(new ImageIcon("src\\main\\java\\Bebida\\batido_de_limon.jpg"));
        
        bebidas[4].setNombre("PIÑA COLADA SIN ALCOHOL");
        bebidas[4].setPrecio(22);
        bebidas[4].setDescripcion("La piña colada, este coctel resulta sumamente refrescante.");
        bebidas[4].setImagen(new ImageIcon("src\\main\\java\\Bebida\\piña_colada.jpg"));
        
        bebidas[5].setNombre("COCTEL DE MANZANA");
        bebidas[5].setPrecio(18);
        bebidas[5].setDescripcion("Cóctel de manzana y menta puede que disfrutes esas reuniones con amigos sin se el aburrido que solo bebe agua o soda.");
        bebidas[5].setImagen(new ImageIcon("src\\main\\java\\Bebida\\coctel_de_manzana.jpg"));
        
        bebidas[6].setNombre("BEBIDA TROPICAL");
        bebidas[6].setPrecio(20);
        bebidas[6].setDescripcion("Una saludable y deliciosa mezcla de zumos frescos y recién exprimido, huevo y granadina para una bebida tropical de lo más vistosa y refrescante.");
        bebidas[6].setImagen(new ImageIcon("src\\main\\java\\Bebida\\bebida_tropical.jpg"));
        
        bebidas[7].setNombre("COCTEL SHANGAI");
        bebidas[7].setPrecio(23);
        bebidas[7].setDescripcion("Este coctel tiene como ingrediente principal la papaya o frutabomba.");
        bebidas[7].setImagen(new ImageIcon("src\\main\\java\\Bebida\\coctel_shanghai.jpg"));
        
        bebidas[8].setNombre("COCTEL MACHU PICCHU");
        bebidas[8].setPrecio(28);
        bebidas[8].setDescripcion("Delicioso cóctel con tres ingredientes clave para su gran y secreto sabor proveniente de nuestra tierra.");
        bebidas[8].setImagen(new ImageIcon("src\\main\\java\\Bebida\\coctel_machu_picchu.jpg"));
        
        bebidas[9].setNombre("PISCO SOUR");
        bebidas[9].setPrecio(25);
        bebidas[9].setDescripcion("El Pisco es una variedad de aguardiente de uvas que se produce en Perú desde finales del siglo XVI.");
        bebidas[9].setImagen(new ImageIcon("src\\main\\java\\Bebida\\pisco_sour.jpg"));
        
        bebidas[10].setNombre("SANGRIA");
        bebidas[10].setPrecio(15);
        bebidas[10].setDescripcion("Se trata de una combinación entre distintos tipos de fruta, licor y vino tinto.");
        bebidas[10].setImagen(new ImageIcon("src\\main\\java\\Bebida\\sangria.jpg"));
        
        bebidas[11].setNombre("COCTEL DE ALGARROBINA");
        bebidas[11].setPrecio(35);
        bebidas[11].setDescripcion("Es un trago dulce y cremoso como un ponche de huevos.");
        bebidas[11].setImagen(new ImageIcon("src\\main\\java\\Bebida\\limonada_frozen.jpg"));
        
        bebidas[12].setNombre("MOJITO CUBANO");
        bebidas[12].setPrecio(21);
        bebidas[12].setDescripcion("El mojito es uno de las bebidas más populares en la coctelería y desde su invención han surgido numerosas versiones que varían del original.");
        bebidas[12].setImagen(new ImageIcon("src\\main\\java\\Bebida\\mojito_cubano.jpg"));
        
        bebidas[13].setNombre("JULEPE DE MENTA");
        bebidas[13].setPrecio(23);
        bebidas[13].setDescripcion("El julepe de menta tiene poco que envidiarle a cualquier mojito. Aunque su origen no está del todo claro, se cree que esta bebida es originaria del Sur de Estados Unidos.");
        bebidas[13].setImagen(new ImageIcon("src\\main\\java\\Bebida\\julepe_de_menta.jpg"));
        
        bebidas[14].setNombre("AGUA DE VALENCIA");
        bebidas[14].setPrecio(24);
        bebidas[14].setDescripcion("El Agua de Valencia es un cóctel español que incluye cava, zumo de naranja, vodka y ginebra.");
        bebidas[14].setImagen(new ImageIcon("src\\main\\java\\Bebida\\agua_de_valencia.jpg"));
        
        bebidas[15].setNombre("MARGARITA DE PIÑA");
        bebidas[15].setPrecio(48);
        bebidas[15].setDescripcion("Esta es una versión realmente refrescante de esta bebida clásica.");
        bebidas[15].setImagen(new ImageIcon("src\\main\\java\\Bebida\\margarita_de_piña.jpg"));
        
        bebidas[16].setNombre("GINEBRA BLANCA");
        bebidas[16].setPrecio(55);
        bebidas[16].setDescripcion("La ginebra es una bebida alcohólica destilada que posee un sabor predominante a nebrinas, los frutos del enebro.");
        bebidas[16].setImagen(new ImageIcon("src\\main\\java\\Bebida\\ginebra_blanca.jpg"));
        
        bebidas[17].setNombre("ABSENTA");
        bebidas[17].setPrecio(75);
        bebidas[17].setDescripcion("La absenta o ajenjo, apodada el Diablo Verde, es una bebida alcohólica de ligero sabor anisado, con un fondo amargo de tintes complejos.");
        bebidas[17].setImagen(new ImageIcon("src\\main\\java\\Bebida\\absenta.jpg"));
        
        bebidas[18].setNombre("BRANDY");
        bebidas[18].setPrecio(70);
        bebidas[18].setDescripcion("El brandy es un aguardiente obtenido a través de la destilación del vino.");
        bebidas[18].setImagen(new ImageIcon("src\\main\\java\\Bebida\\brandy.jpg"));
        
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
    public Comida getObjetoPlatos(int n){
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
    public Comida getObjetoPostre(int n){
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
    public Comida getObjetoBebida(int n){
        return bebidas[n];
    }
    
    
     
    
}