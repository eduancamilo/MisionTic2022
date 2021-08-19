package utp.misiontic2022.c2.p66.reto4.vista;

import java.util.ArrayList;

import utp.misiontic2022.c2.p66.reto4.controlador.ControladorRequerimientos;
import utp.misiontic2022.c2.p66.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p66.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p66.reto4.modelo.vo.Requerimiento_3;



public class VistaRequerimientos {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1(){
        try {
            ArrayList<Requerimiento_1> resultados = controlador.consultarRequerimiento1();
            System.out.print("Nombre material-Precio unidad-Id del proyecto\n");
           for(Requerimiento_1 re : resultados) {
        	
        	   System.out.printf("%s-$%d-%d %n",
        			   re.getNombreMaterial(),
        			   re.getPrecioUnidad(),
        			   re.getIdProyecto()
        			   );
        	   
           }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento2(){
        try {
            ArrayList<Requerimiento_2> resultados = controlador.consultarRequerimiento2();
            System.out.print("Proveedor-Cantidad Total\n");
            for(Requerimiento_2 re2 : resultados) {
            	System.out.printf("%s-%d %n",
            			re2.getProveedor(),
            			re2.getCantidadTotal()
            			
            			);
            }
            
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento3(){
        try {
            ArrayList<Requerimiento_3> resultados = controlador.consultarRequerimiento3();
            System.out.print("Banco_Vinculado-Costo de Líderes\n");
            for(Requerimiento_3 re3 : resultados) {
            	System.out.printf("%s-%s %n",
            			re3.getBancoVinculado(),
            			re3.getCostoLideres()
            			
            			);
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

}
