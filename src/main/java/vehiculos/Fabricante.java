package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private int cantidadVehiculos;
	private static ArrayList<Fabricante> fabricas = new ArrayList<Fabricante>();
	
	
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		this.pais.anadirFabrica(this);
		fabricas.add(this);
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	public int getCantidadVehiculos() {
		return cantidadVehiculos;
	}
	
	public void aumentarVehiculos() {
		cantidadVehiculos ++;
	}
	
	public static Fabricante fabricaMayorVentas() {
		Fabricante f1 = fabricas.get(0);
		
		for (Fabricante i:fabricas) {
			if (f1.getCantidadVehiculos() < i.getCantidadVehiculos()) {
				f1 = i;
			}
		}
		
		return f1;
	}
}
