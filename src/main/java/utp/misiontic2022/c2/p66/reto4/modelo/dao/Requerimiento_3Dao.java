package utp.misiontic2022.c2.p66.reto4.modelo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.p66.reto4.modelo.vo.Requerimiento_3;
import utp.misiontic2022.c2.p66.reto4.util.JDBCUtilities;

public class Requerimiento_3Dao {
    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {
        ArrayList<Requerimiento_3> resultados = new ArrayList<>();
        JDBCUtilities conexion = new JDBCUtilities();

        String consulta = "select p.Banco_Vinculado,SUM(l.Salario) as \"Costo de líderes\"  from Proyecto p Join Lider l on  p.ID_Lider = l.ID_Lider Group by p.Banco_Vinculado HAVING \"Costo de líderes\" <30000000";
        		
     
        ResultSet result = conexion.ejecutarConsulta(consulta);
        
        while(result.next()) {
        	Requerimiento_3 requerimiento_tres= new Requerimiento_3();
        	requerimiento_tres.setBancoVinculado(result.getString("Banco_Vinculado"));
        	requerimiento_tres.setCostoLideres(result.getInt("Costo de líderes"));
        	
        	resultados.add(requerimiento_tres);
        }
        
        result.close();
        
   

        return resultados;
    }
}