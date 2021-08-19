package utp.misiontic2022.c2.p66.reto4.modelo.vo;

public class Requerimiento_1 {

    private String nombreMaterial;
    private int precioUnidad;
    private int idProyecto;
    
    
	public Requerimiento_1() {
		super();
	}


	public Requerimiento_1(String nombreMaterial, int precioUnidad, int idProyecto) {
		super();
		this.nombreMaterial = nombreMaterial;
		this.precioUnidad = precioUnidad;
		this.idProyecto = idProyecto;
	}


	public String getNombreMaterial() {
		return nombreMaterial;
	}


	public void setNombreMaterial(String nombreMaterial) {
		this.nombreMaterial = nombreMaterial;
	}


	public int getPrecioUnidad() {
		return precioUnidad;
	}


	public void setPrecioUnidad(int precioUnidad) {
		this.precioUnidad = precioUnidad;
	}


	public int getIdProyecto() {
		return idProyecto;
	}


	public void setIdProyecto(int idProyecto) {
		this.idProyecto = idProyecto;
	}
	
	
    
    
    

}
