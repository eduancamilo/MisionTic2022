/**
 * No se debe modificar
 */
package utp.misiontic2022.c2.p66.reto4.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtilities {
    private static final String DATABASE_LOCATION = "ProyectosConstruccion.db";
    private Connection conn;

    public JDBCUtilities () {
        try {
            getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() throws SQLException {
        String url = "jdbc:sqlite:"+DATABASE_LOCATION;
        conn = DriverManager.getConnection(url);
        return conn;
    }

    public ResultSet ejecutarConsulta(String consulta) {
        ResultSet rs = null;
        try {
            Statement stmt = conn.createStatement();
            rs = stmt.executeQuery(consulta);
        } catch (SQLException e) {
            System.err.println(e);
        }
        return rs;
    }

    public int ejecutarSentencia(String sentencia) {
        int nFilas = 0;
        try {
            PreparedStatement pstmt = conn.prepareStatement(sentencia);
            nFilas = pstmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e);
        }
        return nFilas;
    }
}
