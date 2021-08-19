package utp.misiontic2022.c2.p66.reto4.modelo.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.p66.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p66.reto4.util.JDBCUtilities;

public class Requerimiento_1Dao {

    public ArrayList<Requerimiento_1> requerimiento1() throws SQLException {
        ArrayList<Requerimiento_1> resultados = new ArrayList<>();
        JDBCUtilities conexion = new JDBCUtilities();
        
 
    	   
        String consulta = "SELECT mc.Nombre_Material,mc.Precio_Unidad,p.ID_Proyecto " +
					"FROM MaterialConstruccion mc JOIN Compra c " +
					"ON mc.ID_MaterialConstruccion = c.ID_MaterialConstruccion "+
					"JOIN Proyecto p ON c.ID_Proyecto = p.ID_Proyecto " +
					"WHERE mc.Importado = 'No' and p.Constructora = 'Pegaso' LIMIT 100";

        ResultSet result =  conexion.ejecutarConsulta(consulta);
        
        while(result.next()) {
        	Requerimiento_1 requerimiento_uno = new Requerimiento_1();
        	
        		requerimiento_uno.setNombreMaterial(result.getString("Nombre_Material"));
        		requerimiento_uno.setIdProyecto(result.getInt("ID_Proyecto"));
        		requerimiento_uno.setPrecioUnidad(result.getInt("Precio_Unidad"));
        
        	resultados.add(requerimiento_uno);
        }
        
       
        
        result.close();
    	         

        return resultados;
    }
}