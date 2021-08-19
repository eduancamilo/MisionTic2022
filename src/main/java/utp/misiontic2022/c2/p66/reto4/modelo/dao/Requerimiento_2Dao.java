package utp.misiontic2022.c2.p66.reto4.modelo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.p66.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p66.reto4.util.JDBCUtilities;

public class Requerimiento_2Dao {
    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {
        ArrayList<Requerimiento_2> resultados = new ArrayList<>();
        JDBCUtilities conexion = new JDBCUtilities();

        String consulta = "SELECT Proveedor , SUM(Cantidad) as \"Cantidad total\" "
        		+ "from Compra group by Proveedor order by \"Cantidad total\" asc limit 100";    

        
        ResultSet result = conexion.ejecutarConsulta(consulta);
        
        while(result.next()) {
        	Requerimiento_2 requerimiento_dos = new Requerimiento_2();
        	
        	requerimiento_dos.setProveedor(result.getString("Proveedor"));
        	requerimiento_dos.setCantidadTotal(result.getInt("Cantidad total"));
        	
        	resultados.add(requerimiento_dos);
        	
        }
  
        result.close();

        return resultados;
    }
}